package chapter09;

public class Main {
	public static void main(String[] args) {
//		A a = new A();
//		
//		//인스턴스 멤버 클래스 객체 생성
//		A.B b = a.new B();
//		b.field1 = 3;
//		b.method1();
////		A.B.field2 = 3; 이게 되긴 된다? 그러나 쓰지 말도록...
////		A.B.method2(); 이게 되긴 된다? 그러나 쓰지 말도록...
//		
//		//정적 멤버 클래스 객체 생성
//		A.C c = new A.C();
//		c.field1 = 3;
//		c.method1();
//		A.C.field2 = 3;
//		A.C.method2();
//		
//		//로컬 클래스 객체 생성을 위한 메소드 호출
//		a.method();
		
		Window w = new Window();
		w.button1.onTouch();
		w.button2.onTouch();
	}
}
