package array;

public class Quiz_result {
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
		int[][] arr = new int[5][5];
		
		arr[0][0] = 1;					// 규칙을 먼저 찾자
		arr[0][1] = 2;					// 
		arr[0][2] = 3;
		arr[0][3] = 4;
		arr[0][4] = 5;					// 변수로 만들 수 있는 값은 변수로 담자
										// 규칙성을 찾는 연습을 할 때는 일단 다 써보고 하나씩 정리하기
		arr[1][4] = 6;
		arr[2][4] = 7;
		arr[3][4] = 8;
		arr[4][4] = 9;
		
		arr[4][3] = 10;
		arr[4][2] = 11;
		arr[4][1] = 12;
		arr[4][0] = 13;
		
		arr[3][0] = 14;
		arr[2][0] = 15;
		arr[1][0] = 16;
		
		arr[1][1] = 17;
		arr[1][2] = 18;
		arr[1][3] = 19;
		
		arr[2][3] = 20;
		arr[3][3] = 21;
		
		arr[3][2] = 22;
		arr[3][1] = 23;
		
		arr[2][1] = 24;
		
		arr[2][2] = 25;
		
		show(arr);
	}
}
