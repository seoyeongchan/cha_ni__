package tv;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// TV 클래스를 구성하여 실제 현실의 TV기능을 모두 구현해보세요

		// main에서는 TV의 메서드만 호출합니다
		int menu;
		boolean power;
		
		System.out.println("전원켜짐");
		
		if (true) {
			do {
				System.out.println("1.전원");
				System.out.println("2.다음채널");
				System.out.println("3.이전채널");
				System.out.println("4.볼륨올림");
				System.out.println("5.볼륨내림");
				System.out.println("6.음소거");
				System.out.println("선택 >>>");
				menu = Integer.parseInt(sc.nextLine());
				while (true) {
					switch (menu) {
					case 1:

						break;
					case 2:

						break;
					case 3:

						break;
					case 4:

						break;
					case 5:

						break;
					case 6:

						break;
					}
				}
			} while (menu != 0);

		} else {
			System.out.println("전원꺼짐");
			sc.close();
		}

	}

}
