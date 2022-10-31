package airplane;

public class Human {
	String name;
	String jop;
	
	public Human(String name, String jop) {
		this.name = name;
		this.jop = jop;
	}
	
	void show() {	// 오버라이딩 하세요
		System.out.printf("%s %s", jop, name);
		
	}
	
}
