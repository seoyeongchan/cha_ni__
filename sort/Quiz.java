package sort;

public class Quiz {
		public static void main(String[] args) {

		String[] nameArray = { "이지은", "홍진호", "강호동", "주호민", "이병건" };
		int[] ageArray = { 30, 41, 53, 42, 40 };

		show(nameArray, ageArray);
		// 1) 나이 순으로 내림차순 정렬 후 출력하세요

		for (int i = 0; i < ageArray.length - 1; i++) {
			for (int j = i + 1; j < ageArray.length; j++) {
				// System.out.printf("%d > %d : %b\n", ageArray[i], ageArray[j], ageArray[i] >
				// ageArray[j]);
				if (ageArray[i] < ageArray[j]) {
					int tmp = ageArray[i];
					ageArray[i] = ageArray[j];
					ageArray[j] = tmp;

					String tmp2 = nameArray[i];
					nameArray[i] = nameArray[j];
					nameArray[j] = tmp2;
				}

			}

		}
		show(nameArray, ageArray);
		// 2) 이름 순으로 오름차순 정렬 후 출력하세요

		for (int i = 0; i < nameArray.length - 1; i++) {
			for (int j = i + 1; j < nameArray.length; j++) {
				if (nameArray[i].compareTo(nameArray[j]) > 0) {
					String tmp = nameArray[i];
					nameArray[i] = nameArray[j];
					nameArray[j] = tmp;

					int tmp2 = ageArray[i];
					ageArray[i] = ageArray[j];
					ageArray[j] = tmp2;

				}

			}
		}

		show(nameArray, ageArray);

		// 단, 정렬에 의해서 이름과 나이가 엇갈리면 안됩니다.

	}
						// ---출력 ---
						// 이지은 : 30살
						// 홍진호 : 41살
						// 강호동 : 53살
						// 주호민 : 42살
						// 이병건 : 40살
						//
						// 강호동 : 53살
						// 주호민 : 42살
						// 홍진호 : 41살
						// 이병건 : 40살
						// 이지은 : 30살
						//
						// 강호동 : 53살
						// 이병건 : 40살
						// 이지은 : 30살
						// 주호민 : 42살
						// 홍진호 : 41살

	private static void show(String[] nameArray, int[] ageArray) {
		for (int i = 0; i < nameArray.length; i++) {
			System.out.printf("%s : %d살\n", nameArray[i], ageArray[i]);
		}
		System.out.println();

	}

}
