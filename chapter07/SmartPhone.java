package chapter07;

public class SmartPhone extends Phone{
	//생성자
	public SmartPhone(String owner) {
		super(owner);
	}
	
	//메소드
	public void internetSearch() {
		System.out.println("인터넷 검색을 합니다.");
	}
	
//	//추상클래스에서 오버라이드 해서 사용하는 것이 좋다!!
//	@Override
//	public void turnOn() {
//		// TODO Auto-generated method stub
//		super.turnOn();
//	}
//
//	@Override
//	public void turnOff() {
//		// TODO Auto-generated method stub
//		super.turnOff();
//	}	
}
