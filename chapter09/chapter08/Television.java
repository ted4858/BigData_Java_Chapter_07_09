package chapter08;

public class Television implements RemoteControl{
	//필드
	private int volume;
	
	//turnOn() 추상 메소드의 실체 메소드
	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다.");
	}
	//turnOff() 추상 메소드의 실체 메소드
	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다.");
	}
	//setVolume() 추상 메소드의 실체 메소드
	@Override
	public void setVolume(int volume) {
		if(volume > RemoteController.MAX_VOLUME) {
			this.volume = RemoteController.MAX_VOLUME;
		} else if(volume > RemoteController.MIN_VOLUME) {
			this.volume = RemoteController.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("현재 TV 볼륨: " + this.volume);
	}
}
