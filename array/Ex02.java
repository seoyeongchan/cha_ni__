package array;

public class Ex02 {
	public static void main(String[] args) {
		
		String s1 = null;		// s1이 참조하는 대상이 없다	// 가리키는 대상이없다
		String s2 = "";			// s2가 참조하는 대상의 내용이 없다	// 가리키고는 있지만 내용이없다
		// Scanner로 입력을 받았으면 빈문자열, 입력 받은 적이 없다 --> null
		
//		System.out.println(s1 == s2);
//		System.out.println(s2.equals(s1));
		
		String[] arr = { null, "", "Hello" };
		
		for(int i = 0; i < arr.length; i++) {	// null. 은 성립하지 않는다
												// . 왼쪽에 null이 오면 NullPointerException
			System.out.println("i : "+ i);
			System.out.println(arr[i] == null);			// 대상이 null인지 확인하기
			System.out.println("".equals(arr[i]));		// 대상의 내용이 ""인지 확인하기
			System.out.println("Hello".equals(arr[i])); // 대상의 내용이 "Hello"인지 확인하기
			System.out.println();
		}
	}

}
