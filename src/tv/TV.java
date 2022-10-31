package tv;

public class TV {
	
	// TV 클래스를 구성하세요
	// 필드는 속성을 저장합니다 : ex) 전원, 채널, 볼륨, 음소거 상태 등...
	// 메서드는 기능을 정의합니다 : 채널 올림/내림, 볼륨 올림/내림, 전원on/off, 음소거 기능 등...
	// 생성자는 객체 생성 시 초기 작동을 담당합니다. ( 생성된 TV의 초기 채널은 2로 설정한다)
	// 접근제한자는 필드에 대해 private, 메서드에 대해 public을 적용합니다
	// getter/setter는 사용해도 되고, 생략해도 됩니다
	
	boolean power;
	int channel, volume, mute;
	
	public TV(boolean power, int channel, int volume, int mute) {
		this.power = power;
		this.channel = channel;
		this.volume = volume;
		this.mute = mute;
	}
	
	
	void show() {
		
	}
	
}



	