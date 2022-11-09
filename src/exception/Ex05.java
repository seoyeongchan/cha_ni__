package exception;

import java.util.Scanner;


public class Ex05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1, n2, result = 0;
		char oper = ' ';

		// 두 정수와 연산자를 입력받아서 결과를 화면에 출력하는 코드를 작성하세요
		// 해당 과정에서 발생할 수 있는 예외를 최대한 많이 확인하여 try ~ catch 구문으로 작성하세요
		// 하나의 try에는 여러 catch가 연결될 수 있으며, 다형성이 적용됩니다
		// 상세한 예외부터 위에 작성하고, 포괄적인 예외는 아래쪽에 작성합니다


		
		

		try {
			System.out.println("첫번째정수 입력 : ");
			n1 = sc.nextInt();
			System.out.println("두번째정수 입력 : ");
			n2 = sc.nextInt();
			System.out.println("연산자 입력 : ");
			oper = sc.next().charAt(0);

				
			if (oper == '+') {result = n1 + n2;}
			else if (oper == '-') {result = n1 - n2;} 
			else if (oper == '*') {result = n1 * n2;}
			else if (oper == '/') {result = n1 / n2;}
			System.out.printf("%d %s %d = %d ", n1, oper, n2, result);
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			sc.close();
		}
		System.out.println("종료");	
	}
				
				
			
			
			
		

}
