package management_system;

import java.util.ArrayList;

public class Handler {
	
	ArrayList<Member> memberlist = new ArrayList<Member>();

	// 추가
	public void insert(Member sc) {
		memberlist.add(sc);
		
		
	}

	// 목록
	public void showList() {
		for(Member mem : memberlist) {
			mem.showInfo();
		}
	}

	//검색
	public Member find(String id) {
		for(Member mem : memberlist) {
			if(mem.id.equals(id)){
				return mem;
			}
		}
		return null;
	}

	// 삭제
	public int delete(Member id) {
		for (Member mem : memberlist) {
			if(mem == id) {
				memberlist.remove(mem);
				return 1;
			}
		}
		return 0;
	}
	
	// 아이디 중복체크
		public int idcheck(String id) {
			for(Member check : memberlist) {
				if(check.getId().equals(id)){
					return 1;
				}
			}
			
			return 0;
		}

}
