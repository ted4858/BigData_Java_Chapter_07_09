package chapter07;

public class DmbCellPhone extends CellPhone {
	//필드
	int channel;
	
	//생성자
	DmbCellPhone(String model, String color, int channel) {
		super(); // CellPhone 생성자 호출
		this.model = model;
		this.color = color;
		this.channel = channel;
	}
	
//	@Override //동적바인딩 => Virtual Table => 다형성
//	void powerOn() { System.out.println("전원을 켭니다."); }
	
	//메소드
	void turnOnDmb() {
		System.out.println("채널 " + channel + "번 DMB 방송 수신을 시작합니다.");
	}
	
	void changeChannelDmb(int channel) {
		this.channel = channel;
		System.out.println("채널 " + channel + "번으로 바꿉니다.");
	}
	
	void turnOffDmb() {
		System.out.println("DMB 방송 수신을 멈춥니다.");
	}
}
