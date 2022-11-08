package management_system;

// 슈퍼클래스
public abstract class Member {
	protected String id;
	protected String password;
	protected String name;
	
	public Member(String id, String password, String name) {
		
		this.id = id;
		this.password = password;
		this.name = name;
	}
	
	public abstract void showInfo();
	public abstract void showDetail();

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
		
	


}
