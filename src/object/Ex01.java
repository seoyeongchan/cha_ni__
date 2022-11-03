package object;

class A /*extends Object*/{
	
}

class B extends A {}

public class Ex01 {
	public static void main(String[] args) {
		
		A ob = new B();
		
		System.out.println(ob.getClass().toString());		// class object.B
		
		// 1) 자바의 모든 객체는 Object 클래스의 인스턴스이다
		// 2) Object 는 자바에 있는 모든 클래스의 최상위 슈퍼클래스이다
		// 3) Object 클래스에 정의된 메서드는 모든 클래스가 오버라이딩 할 수 있다 (단, final은 제외)
		
		B ob2 = (B) ob;
		
		System.out.println(ob.equals(ob2));			// true
		
		// Java API 문서 확인하기
		
		// 모든 객체는 Object 타입으로 참조할 수 있다
		
		Object ob3 = ob;	// A
		Object ob4 = ob2;	// B
		
		System.out.println(ob3.getClass());	// 참조가 업캐스팅 되어도 객체 자신의 정보는 변하지 않는다		//class object.B
		System.out.println(ob4.getClass());													//class object.B
		
		System.out.println(ob3.equals(ob4));				//true
	}
	

}
