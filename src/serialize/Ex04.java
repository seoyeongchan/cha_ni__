package serialize;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;


public class Ex04 {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		ArrayList<Todo> list = null;
		// ex03.dat의 객체를 list에 저장하여 아래 출력코드가 작동할 수 있도록 처리하세요
		
		FileInputStream fis = new FileInputStream("ex03.dat");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		// 한줄로 줄여쓴다면 ?/
//		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("ex03.dat"));
		
		list = (ArrayList<Todo>) ois.readObject();
		
		
		for (int i = 0; i < list.size(); i++) {
			Todo t = list.get(i);
			System.out.println(t);
			
		}
		System.out.println("\n==================================\n");
		
		for (Todo t : list) {
			System.out.println(t);
		}
		System.out.println("\n==================================\n");
		
		// 위 두 코드는 array(배열), list 둘다 된다
		
		// 밑에 두 코드는 list만 쓸 수 있다. ( 위에 두개와 밑에 두개의 차이는 제어문을 쓰냐 안쓰냐의 차이)
		list.forEach(t -> System.out.println(t));
		
		list.forEach(System.out::println);
		System.out.println("\n==================================\n");
		
		// 위 코드는 다 똑같은 결과를 출력하는 코드이다.
		
		ois.close();
	}
	
}
