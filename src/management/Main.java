package management;

import java.util.Scanner;

import model.ComputerScieneceStudent;
import model.EnglishLinguisticStudent;
import model.Student;

public class Main {

	private static Handler handler = new Handler();
	// private 를 걸지않으면 다른 패키지에 있는 핸들러가 같은곳을 참조할 수도 있어서
	// private를 걸어줌 (main 밖에서 선언할 경우 생각해서 선언하기)
	public static void main(String[] args) {

		Student st = null;	// Student 자료형을 빈값으로 둔다
		Scanner sc = new Scanner(System.in);
		int select, row, index;
		String name;

		System.out.println("\n\t학생 관리 프로그램\n");

		do {
			System.out.println("1. 목록");
			System.out.println("2. 추가");
			System.out.println("3. 검색");
			System.out.println("4. 삭제");
			System.out.println("5. 삭제 (index를 이용한 삭제)");
			System.out.println("0. 종료");
			System.out.print("선택 >>> ");
			select = Integer.parseInt(sc.nextLine());

			switch (select) {
			case 1:
				handler.showList();		// 반환형은 void
				break;

			case 2:
				System.out.println("학생 유형을 선택하세요 (1. 영문과 | 2. 컴공과) : ");
				select = Integer.parseInt(sc.nextLine());
				if (select == 1)
					st = makeEnglishLinguisticStudent(sc);
				if (select == 2)
					st = makeComputerScienceStudent(sc);
				row = handler.insert(st);
				System.out.println(row == 1 ? "추가성공" : "추가실패");
				break;

			case 3:
				System.out.print("검색할 학생의 이름을 입력하세요 : ");
				name = sc.nextLine();
				st = handler.find(name); // 이름을 전달하여 일치하는 학생을 찾기
				if (st != null)
					st.showDetail();
				else
					System.out.println(name + " 학생을 찾을 수 없습니다");
				break;

			case 4:
				System.out.print("삭제할 학생의 이름을 입력하세요 : ");
				name = sc.nextLine();
				st = handler.find(name);		// 이름을 전달받아서, 이름이 일치하는 학생 객체를 반환
				row = handler.delete(st);		// 그 학생을 전달하여 배열에서 제거
				System.out.println(row == 1 ? "삭제성공" : "삭제실패");
				break;
				
			case 5:
				System.out.println("삭제할 학생의 이름을 입력하세요 : ");
				name = sc.nextLine();
				index = handler.indexOf(name);
				row = handler.delete(index);
				System.out.println(row == 1 ? "삭제 성공" : "삭제 실패");
				break;

			default:
				System.out.println("다시 선택하세요");
			}

		} while (select != 0);
		sc.close();
		System.out.println("종료");

	}

	private static Student makeComputerScienceStudent(Scanner sc) {
		ComputerScieneceStudent comst;
		String name;
		int kor, eng, mat, java, network, linux;

		System.out.print("학생이름 입력 : ");
		name = sc.nextLine();
		System.out.println("국어점수 입력 : ");
		kor = Integer.parseInt(sc.nextLine());
		System.out.println("영어점수 입력 : ");
		eng = Integer.parseInt(sc.nextLine());
		System.out.println("수학점수 입력 : ");
		mat = Integer.parseInt(sc.nextLine());
		System.out.println("자바점수 입력 : ");

		java = Integer.parseInt(sc.nextLine());
		System.out.println("네트워크점수 입력 : ");
		network = Integer.parseInt(sc.nextLine());
		System.out.println("리눅스점수 입력 : ");
		linux = Integer.parseInt(sc.nextLine());

		comst = new ComputerScieneceStudent(name, kor, eng, mat, java, network, linux);
			// 생성자를 통하기 때문에 생성자와 형식을 꼭 맞춰야 한다
		return comst;
	}

	private static Student makeEnglishLinguisticStudent(Scanner sc) {
		EnglishLinguisticStudent engst;
		String name;
		int kor, eng, mat, literature, translation;

		System.out.print("학생이름 입력 : ");
		name = sc.nextLine();
		System.out.println("국어점수 입력 : ");
		kor = Integer.parseInt(sc.nextLine());
		System.out.println("영어점수 입력 : ");
		eng = Integer.parseInt(sc.nextLine());
		System.out.println("수학점수 입력 : ");
		mat = Integer.parseInt(sc.nextLine());
		System.out.println("문학점수 입력 : ");
		literature = Integer.parseInt(sc.nextLine());
		System.out.println("번역점수 입력 : ");
		translation = Integer.parseInt(sc.nextLine());

		engst = new EnglishLinguisticStudent(name, kor, eng, mat, literature, translation);

		return engst;

	}
}
