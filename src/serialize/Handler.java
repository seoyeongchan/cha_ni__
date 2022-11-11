package serialize;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;


public class Handler {

	SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd");

	private ArrayList<Todo> list;

	public Handler() throws FileNotFoundException, IOException, ClassNotFoundException {
		this.load();
	}

	// 불러오기
	@SuppressWarnings("unchecked")
	private void load() throws FileNotFoundException, IOException, ClassNotFoundException { // 생성자 내부에서 호출함. 파일에서 객체를
																							// 불러와서 리스트에 저장
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("ex03.dat"));
		list = (ArrayList<Todo>) ois.readObject();

		ois.close();
	}

	// 저장
	public void save() throws IOException { // main에서 호출함. 리스트 객체를 파일로 저장
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("ex03.dat"));

		oos.writeObject(list);
		oos.flush();
		oos.close();

		System.out.println();
		System.out.println("저장 완료 !!");
	}

	//추가
	public void insert(Scanner sc) throws ParseException { // 객체를 전달받아서 추가하기
		String title;
		Date date;
		System.out.print("title 입력 : ");
		title = sc.nextLine();
		System.out.print("date 입력 : ");
		date = sdf.parse(sc.nextLine());
		list.add(new Todo(title, date));
			
		
		System.out.println("추가 성공 !!");
		System.out.println();
	}

	//삭제
	public void delete(Scanner sc) { // 선택한 객체의 index를 확인하여 제거하기
		String title;
		System.out.println("삭제할 title 입력 :");
		title = sc.nextLine();
		
		
		if (list.removeIf(st -> st.getTitle().equals(title)) == true) {
			System.out.println("삭제성공");
			
		}
		else {
			System.out.println("삭제실패");
		}	
		System.out.println();
	}
	
	// 목록
	public void showList() {
		for (Todo to : list) {
			System.out.println(to);
		}
		System.out.println();
		
	}

	// 정렬
	public void sort() {
		list.sort((a, b) -> a.getDate().compareTo(b.getDate()));
		System.out.println();
	}

}
