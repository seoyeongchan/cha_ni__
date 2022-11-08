package management_system;

public class Customer extends Member{
	
	private String address;
	
	protected Customer(String id, String password, String name, String address) {
		super(id, password, name);
		this.address = address;
	}

	@Override
	public void showInfo() {
		System.out.printf("ID : %s\n "
				+ "회원유형 : 구매자\n", id);
		
	}

	@Override
	public void showDetail() {
		System.out.printf("ID : %s\n"
				+ "비밀번호 : *******\n"
				+ "회원 이름 : %s\n"
				+ "회원유형 : 구매자\n"
				+ "배송주소 : %s\n" , id, name, address);
		
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
