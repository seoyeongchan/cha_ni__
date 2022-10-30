package sort;

import java.util.Arrays;

public class Ex06 {
	static void showArray(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
	}

	public static void main(String[] args) {
		int[] arr = { 2, 7, 8, 4, 6 };
		showArray(arr);		// 2 7 8 4 6 
		
		Arrays.sort(arr); 	// 별도의 객체를 생성하지 않아도, 정렬 함수를 호출할 수 있다(static)
		showArray(arr);		// 2 4 6 7 8 
		
 	}
	/*
	 * 배열을 내림차순으로 정렬할 때는 Collections 클래스의 reverseOrder() 함수를 사용하면 됩니다. 
	 * 만약 기본 타입 배열을 내림차순으로 정렬하고 싶다면 기본 타입의 배열을 래퍼클래스로 만들어 Comparator를 
	 * 두번째 인자에 넣어주어야 역순으로 정렬할 수 있습니다.
	 */
	

}

// 배열의 연습은 필수다 -> 추후 콜렉션을 연습하는데 도움이 많이 된다
