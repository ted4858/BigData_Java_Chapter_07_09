package chapter08;

public class RemoteControlExample {
	public static void main(String[] args) {
//		RemoteControl rc;
//		rc = new Television();
//		rc = new Audio();
		
//		RemoteControl rc = new RemoteControl() {
//			@Override
//			public void turnOn() { /*실행문*/ }
//			@Override
//			public void turnOff() { /*실행문*/ }
//			@Override
//			public void setVolume(int volume) { /*실행문*/ }
//		};
		
		RemoteControl rc = null;
		
		rc = new Television();
		rc.turnOn();
//		rc.turnOff();
		rc.setMute(true);
		
		rc = new Audio();
		rc.turnOn();
//		rc.turnOff();
		rc.setMute(true);
		
		RemoteControl.changeBattery();
	}
}
