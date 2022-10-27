package 서영찬2A;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
	static SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd");
	
	public static void main(String[] args) throws ParseException {
		int select, row;
		String result, name;
		Date dt;
		
		Scanner sc = new Scanner(System.in);
		Handler hd = new Handler();
		Todo to;
		
		do {
			System.out.println("\tSimple Todo List (작성자 : 서영찬)");
			System.out.println();
			System.out.println("1.목록 | 2. 항목추가 | 3. 완료처리 | 4. 삭제 | 0. 프로그램 종료");
			System.out.print("메뉴 선택 >>>");
			select = Integer.parseInt(sc.nextLine());
		

			
			switch(select) {
			
			case 1:
				result = hd.selectAll();
				System.out.println(result);
				break;
				
				
			
			case 2:
				System.out.print("할 일 입력 : ");
				name = sc.nextLine();
				System.out.print("날짜 입력 (yyyy.MM.dd): ");
				dt = sdf.parse(sc.nextLine());
				to = new Todo(dt, name);
				row = hd.insert(to);
				if(row == 1)	System.out.println("추가 성공");
				if(row == 0)	System.out.println("추가 실패");

				
				break;
			
			case 3:
				System.out.print("완료처리할 일정의 이름 입력 : ");
				name = sc.nextLine();
				row = hd.update(name);
				System.out.println(row == 1 ? "수정 성공" : "수정 실패");

				
				break;
			
			case 4:
				System.out.print("삭제할 일정의 이름 입력 : ");
				name = sc.nextLine();
				
				row = hd.delete(name);
				System.out.println(row == 1 ? "삭제 성공" : "삭제 실패");

				
				
				
				break;
			}
			
			
			
		}while(select != 0);
		System.out.println("프로그램 종료");
		sc.close();
			
		
		
	}

}
