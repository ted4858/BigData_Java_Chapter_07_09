package chapter07;

class A2 {}

class B2 extends A2 {}
class C2 extends A2 {}

class D2 extends B2 {}
class E2 extends C2 {}

public class PromotionExample {
	public static void main(String[] args) {
		B2 b = new B2();
		C2 c = new C2();
		D2 d = new D2();
		E2 e = new E2();
		
		A2 a1 = b;
		A2 a2 = c;
		A2 a3 = d;
		A2 a4 = e;
		
		B2 b1 = d;
		C2 c1 = e;
		
		//B b3 = e;
		//C c2 = d;
	}
}
