package collection;

import java.util.List;
import java.util.Arrays;

// Ex8 과 같은 내용
public class Ex09 {
	public static void main(String[] args) {
		Integer[] arr = { 2, 7, 8, 4, 6 };
		List<Integer> list = Arrays.asList(arr);
		
		System.out.println(list);
		list.sort((a, b) -> a - b);
		System.out.println(list);
	}
	
}
