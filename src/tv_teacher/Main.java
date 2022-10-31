package tv_teacher;

public class Main {
	public static void main(String[] args) {
		TV tv = new TV();
		
//		tv.power();
		
		tv.powerBtn();
//		tv.show();
		
		for (int i = 0; i < 10; i++) {
			tv.channelUp();
		}
		tv.show();
		tv.powerBtn();
	}

}
