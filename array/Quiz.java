package array;

public class Quiz {
	static void guide(int[][] arr) {
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.printf("(%d, %d) ", i, j);
			}
			System.out.println();
		}
		System.out.println();
	}
	
	static void show(int[][] arr) {
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.printf("%2d ", arr[i][j]);
			}
			System.out.println();
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		int length = 5;
		int[][] arr = new int[length][length];
		int num = 0;
		int x = -1, y = 0;		// 이동하고 할당하기 위해서 x의 값을 -1로 
		int sign = 1;
		
		while(length > 0) {
			for(int i = 0; i < length; i++) {
				x += sign;
				arr[y][x] = ++num;
			}
			length--;
			for(int i = 0; i < length; i++) {
				y += sign;
				arr[y][x] = ++num;
			}
			sign = -sign;
		}
		show(arr);
	}
}
// 이차원배열 