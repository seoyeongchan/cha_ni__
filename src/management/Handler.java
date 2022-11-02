package management;


import model.Student;

public class Handler {
	
	private Student[] arr = new Student[10];
	// arr { 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0}

	// 목록
	public void showList() {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != null) {
				arr[i].showInfo();
			}
		}
		System.out.println();	// 끝나고 구분하기 위해서 한줄 띄운것	
	}
	
	// 추가
	public int insert(Student st) {
		if(st == null) return 0;
		for (int i = 0; i < arr.length; i++) {	// 배열을 처음부터 끝까지 순회하면서
			if(arr[i] == null) {
				arr[i] = st;
				return 1;
			}
		}
		return 0;
	}
	
	// 검색
	
	public Student find(String name) {	// 배열을 다룰 때에는 배열의 자료형을 확인하고 진행하자
		Student stu = null;				// 학생의 배열이므로, 각배열의 칸(arr[i]) 에는 학생 객체가 담길 수 있다
										// 빈칸이 아닌 곳의 학생의 이름이 전달받은 이름과 일치하면
										// 그 학생객체를 반환한다
		
		for (int i = 0; i < arr.length; i++) {	// equals 는 String 자료형끼리 비교
			if(arr[i] != null && arr[i].getName().equals(name)) {
				stu = arr[i];									// 학생 클래스가 다른패키지에서 
			// 위에 학생타입 변수를 선언 하지 않았을 경우 return null ; 		// protected형식으로 있기 때문에
			}													 // getName으로 가져온다
																// Student 의(.)이름().과 같으면(equals)
		}return stu;			
	}
			
			
	
	// 삭제
	// student st1  "김대현" // 객체와 String 을비교하려니까 안된다.
	public int delete(Student st) {
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] != null && arr[i] == st) {	// == 연산자는 NullPointerException 을 발생시키지 않는다
				arr[i] = null;						// . 왼쪽이 null이면 NullPointerException이 발생한다
				return 1;
			}
		}
		return 0;
	}

	// find는 객체를 반환하지만, indexOf는 객체가 위치하는 배열의 index를 반환하게 만든다
	public int indexOf(String name) {
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] != null && arr[i].getName().equals(name)) {
				return 1;
			}
		}
		return -1;
	}

	public int delete(int index) {
		if (arr[index] != null) {	// index 번째의 객체가 있으면
			arr[index] = null;		// 객체를 제거하고
			return 1;				// 1을 반환
			
		}
		return 0;	// if를 만족하지 않으면 0을 반환
	}

	


	
	
	
	

}
