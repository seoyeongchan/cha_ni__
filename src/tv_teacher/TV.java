package tv_teacher;

public class TV {
	private boolean power;
	private int channel = 2;	// 2 ~ 10
	private int volume = 10;	// 0 ~ 20
	
	
	
	public void powerBtn() {
		power = !power;	// 저장된 값이 true이면 false를 대입한다
		show();
	}
		
	public void channelUp() {
		if(power) {
			channel++;
			if(channel > 10)
				channel = 2;
		}
	}
	
	public void channelDown() {
		if(power) {
			channel --;
			if(channel < 2)
				channel = 10;
		}
		
	}
	
	public void volumeUp() {
		if(power && volume > 0) {
			volume ++;
		}
	}
	
	public void volumeDown() {
		if(power && volume > 0) {
			volume --;
		}
	}
	
	public void mute() {
		
	}
	
	
	public void show() {
		if(power) {
			System.out.println("전원 : " + power);
			System.out.println("채널 : " + channel);
			System.out.println();
		}
		else {
			System.out.println("전원 off 상태");
		}
	}
}
