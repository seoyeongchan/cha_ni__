package management_system;

import java.util.Scanner;

public class Main {
	private static Handler handler = new Handler();

	public static void main(String[] args) {
		int select, row;
		String name;
		Member mem = null;

		Scanner sc = new Scanner(System.in);

		System.out.println("\n\t 회원 관리 시스템 \n");

		do {
			System.out.println("1. 회원가입 | 2. 회원탈퇴 | 3. 전체목록 | 4. 단일검색(ID) | 0. 종료");

			System.out.println("메뉴선택 >>>");
			select = Integer.parseInt(sc.nextLine());
			System.out.println();

			switch (select) {
			case 1:
				System.out.println("회원 유형을 선택하세요 (1. 판매자 | 2. 구매자) ");
				select = Integer.parseInt(sc.nextLine());
				if (select == 1)
					mem = makeSeller(sc);
				else if (select == 2)
					mem = makeCustomer(sc);
				else {
					System.out.println("회원유형을 잘못입력하셨습니다");
					break;
				}

				handler.insert(mem);
				System.out.println("추가성공");

				break;

			case 2:
				System.out.println("삭제할 회원의 ID를 입력하세요 : ");
				name = sc.nextLine();
				mem = handler.find(name); // 이름을 전달받아서, 이름이 일치하는 회원 객체를 반환
				row = handler.delete(mem);
				System.out.println(row == 1 ? "삭제성공" : "삭제실패");

				break;

			case 3:
				handler.showList();

				break;

			case 4:
				System.out.println("검색할 회원의 ID를 입력하세요 : ");
				name = sc.nextLine();
				mem = handler.find(name); // 이름을 전달하여 일치하는 회원 찾기
				if (mem != null)
					mem.showDetail();
				else
					System.out.println(name + " 회원을 찾을 수 없습니다");

				break;

			}

		} while (select != 0);
		System.out.println("프로그램 종료");

		sc.close();
	}

	private static Member makeCustomer(Scanner sc) {
		Customer ct;
		String id, name;
		String password;
		String address;
		int check = 1;

		System.out.println("ID 입력 : ");
		id = sc.nextLine();
		while (check == 1) {
			check = handler.idcheck(id);
			if (check != 0) {
				System.out.println("중복된 ID입니다");
				System.out.println("ID 입력 : ");
				id = sc.nextLine();
			} else {
				System.out.println("가입가능한 ID입니다");
			}
		}

		System.out.println("이름 입력 : ");
		name = sc.nextLine();
		System.out.println("패스워드 입력 : ");
		password = sc.nextLine();
		System.out.println("배송주소 입력 : ");
		address = sc.nextLine();

		ct = new Customer(id, password, name, address);
		return ct;
	}

	private static Member makeSeller(Scanner sc) {
		Seller sl;
		String id, name;
		String password;
		String store;
		int check = 1;

		System.out.print("ID 입력 : ");
		id = sc.nextLine();
		while (check == 1) {
			check = handler.idcheck(id);
			if (check != 0) {
				System.out.println("중복된 ID입니다");
				System.out.println("ID 입력 : ");
				id = sc.nextLine();
			} else {
				System.out.println("가입가능한 ID입니다");
			}
		}
		System.out.println("이름 입력 : ");
		name = sc.nextLine();
		System.out.println("패스워드 입력 : ");
		password = sc.nextLine();
		System.out.println("가게이름 입력 : ");
		store = sc.nextLine();

		sl = new Seller(id, password, name, store);

		return sl;
	}

}
