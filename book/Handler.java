package book;

public class Handler {

	Book[] arr = new Book[20];
	
	// 생성자에 따라서, 배열에 더미 데이터를 미리 넣을 수 있도록 설정해보기
	
	Handler() {
		System.out.println("기본 생성자로 객체 생성 (더미 데이터 없음)");
	}
	
	Handler(Book[] arr) {
		for(int i = 0; i < arr.length; i++) {
			this.arr[i] = arr[i];
		}
		System.out.println("배열을 전달받아서 객체 생성 (더미 데이터 있음)");
	}
	
	// 추가 함수
	int insert(Book bo) {
		
		for(int i = 0; i < arr.length; i++) {
			if (arr[i] == null) {
				arr[i] = bo;
				return 1;
			}
		}
		return 0;
	}
	
	// 목록 함수
	String getList() {
		String data = "";
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] != null) {
				data += arr[i].toStr();
				data += "\n";
			}
		}
		data += "\n";
		return data;
	}
	
	// 삭제 함수(index 혹은 name 으로 삭제)
	
	int delete(int index) {
		if(arr[index] != null) {
			arr[index] = null;
			return 1;
		}
		return 0;
			
	}
	int delete(String name) {
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] != null && arr[i].name.equals(name)) {
				arr[i] = null;
				return 1;
			}
		}
		return 0;
	}
	
	
	
	
	
	
}
