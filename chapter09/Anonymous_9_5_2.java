package chapter09;

public class Anonymous_9_5_2 {
	//필드 초기값으로 대입
	public RemoteControl field = new RemoteControl() {
		@Override
		public void turnOn() {
			System.out.printf("%s \r\n", "TV를 켭니다.");
		}
		@Override
		public void turnOff() {
			System.out.printf("%s \r\n", "TV를 끕니다.");
		}
	};
	
	public void method1() {
		//로컬 변수값으로 대입
		RemoteControl localVar = new RemoteControl() {
			@Override
			public void turnOn() {
				System.out.printf("%s \r\n", "Audio를 켭니다.");
			}
			@Override
			public void turnOff() {
				System.out.printf("%s \r\n", "Audio를 끕니다.");
			}
		};
		//로컬 변수 사용
		localVar.turnOn();
	}
	
	void method2(RemoteControl rc) {
		rc.turnOn();
	}
}
