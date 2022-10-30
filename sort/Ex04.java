package sort;

public class Ex04 {
	static void showArray(int[] arr) {
		for(int i = 0; i< arr.length; i++) {	// i가 0 일때 arr배열의길이만큼(length) i ++ 반복
			System.out.println(arr[i] + "");
			System.out.printf("%d : %d\n", i, arr[i]); //(배열 확인)
		}
		System.out.println();
	}
	public static void main(String[] args) {

		// 배열의 두 요소를 교환하기
		// 배열의 각 요소는 일반 변수와 동일하게 취급한다
		
		int[] arr = { 10, 20 };
		showArray(arr);
		
		int tmp = arr[0];
		arr[0] = arr[1];
		arr[1] = tmp;
		
		showArray(arr);
		
	}
	//	-- 출력
//
//	10
//	0 : 10
//	20
//	1 : 20
//	20
//	0 : 20
//	10
//	1 : 10


}
