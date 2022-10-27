package 서영찬2A;


public class Handler {
	
	Todo[] arr = new Todo[5];

	// 목록
	String selectAll() {
		String result = "";
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != null) {
				result += arr[i].toString();
				result += "\n";
			}
		}
		
		return result;
	}
	
	// 추가
	public int insert(Todo to) {
		for(int i = 0; i< arr.length; i++) {
			if(arr[i] == null) {
				arr[i] = to;
				return 1;
			}
		}
		return 0;
	}

	// 완료처리
	int update(String name) {
		for(int i = 0; i < arr.length; i++) {
			if (arr[i] != null && arr[i].toString().contains(name)) {
				arr[i].complete = "[완료]";
				
				return 1;
			}
		}
		
		return 0;
	}

	
	// 삭제
	int delete(String name) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != null && arr[i].toString().contains(name)) {
				arr[i] = null;
				return 1;
			}
		}
		
		return 0;
	}









}
