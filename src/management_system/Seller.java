package management_system;

public class Seller extends Member {
	private String store;
	
	protected Seller(String id, String password, String name, String store) {
		super(id, password, name);
		this.store = store;

	}

	@Override
	public void showInfo() {
		System.out.printf("ID : %s\n "
				+ "회원유형 : 판매자\n", id);
		
		
	}

	@Override
	public void showDetail() {
		System.out.printf("ID : %s\n"
				+ "비밀번호 : *******\n"
				+ "회원 이름 : %s\n"
				+ "회원유형 : 판매자\n"
				+ "가게이름 : %s\n" , id, name, store);
		
		
	}

	public String getStore() {
		return store;
	}

	public void setStore(String store) {
		this.store = store;
	}
	

}
