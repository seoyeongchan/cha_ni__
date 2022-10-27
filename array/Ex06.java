package array;

public class Ex06 {
	static void guide(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.printf("(%d, %d) ", i, j);
			}
			System.out.println();
		}
		System.out.println();
	}

	static void show(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.printf("%2d ", arr[i][j]);
			}
			System.out.println();
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int[][] arr = new int[5][5];

		guide(arr);

		show(arr);

		int num = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = ++num;
			}
		}
		show(arr);

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = i * 5 + j + 1;
			}
		}
		show(arr);

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				boolean flag = i == 0 || i == 4 || j == 0 || j == 4;
				arr[i][j] = flag ? 1 : 0;

			}
		}
		show(arr);

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				boolean flag = i == 2 || j == 2;
				arr[i][j] = flag ? 1 : 0;
			}
		}
		show(arr);

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				boolean flag1 = i - j == 2;
				boolean flag2 = j - i == 2;
				boolean flag3 = i + j == 2;
				boolean flag4 = i + j == 6;

				boolean flag = flag1 || flag2 || flag3 || flag4;

				arr[i][j] = flag ? 1 : 0;
			}
		}
		show(arr);

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
//				if (i % 2 == 0) {
//					arr[i][j] = i * 5 + j + 1;
//				} else {
//					arr[i][j] = i * 5 + (5 - j);
//				}
				int tmp = i % 2 == 0 ? j + 1 : 5 - j;
				arr[i][j] = i * 5 + tmp;

			}
		}
		show(arr);
	}

}
