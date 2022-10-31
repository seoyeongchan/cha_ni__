package airplane;

public class Main {
	public static void main(String[] args) {
		Airplane air = new Airplane();
		
		// 6명의 객체를 생성하여 비행기에 탑승시킵니다 (1명은 못탐)
		// Human의 서브클래스는 여러개를 만들어도 됩니다
		// 이때, 최소 2명의 의사를 포함시킵니다
		Human d1 = new Doctor("김의사", "내과의사");
		
		Human d2 = new Doctor("강의사", "외과의사");
		
		Human s1 = new Singer("아이유", "가수");
		Human s2 = new Singer("크러쉬", "가수");
		Human s3 = new Singer("지코", "가수");
		Human s4 = new Singer("KCM", "가수");
		
		air.entrance(d1);
		air.entrance(d2);
		air.entrance(s1);
		air.entrance(s2);
		air.entrance(s3);
		air.entrance(s4);
		
		int pain = air.emergency();
		// int pain = 4;
		
		//Doctor h7 ;
		
		
		for (int i = 0; i < air.arr.length; i++) {
			if(air.arr[i] != air.arr[pain] && air.arr[i] instanceof Doctor) {
				Doctor d3 = (Doctor)air.arr[i];
				d3.heal(air.arr[pain]);
				break;
			}
		}
		
		
	
		
		
		// 비행기 내부에 의사가 있다면, 의사의 heal() 함수를 호출하여 대상을 치료하는 코드를 작성하세요
		
			
	}

}
