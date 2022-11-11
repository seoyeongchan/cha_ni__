package serialize;

import java.io.IOException;
import java.text.ParseException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException, ClassNotFoundException, ParseException {

		Handler handler = new Handler();
		int select;
		Scanner sc = new Scanner(System.in);

		do {

			System.out.println("1. 목록");
			System.out.println("2. 추가");
			System.out.println("3. 삭제");
			System.out.println("4. 정렬");
			System.out.println("0. 종료");
			System.out.println("선택 >>>>");
			select = Integer.parseInt(sc.nextLine());

			switch (select) {
			case 1:
				handler.showList();
				break;
			case 2:
				handler.insert(sc);
				break;

			case 3:
				handler.delete(sc);
				break;

			case 4:
				handler.sort();
				handler.showList();
				break;

			}

		} while (select != 0);

		handler.save();
		sc.close();
	}
}