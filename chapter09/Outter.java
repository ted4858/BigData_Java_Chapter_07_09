package chapter09;

public class Outter {
//	//9.3.3
//	//자바 7 이전
//	public void method1(final int arg) {
//		final int  localVariable = 1;
//		//arg = 100; (x)
//		//localVariable = 100; (x)
//		class Inner {
//			public void method() {
//				int result = arg + localVariable;
//			}
//		}
//	}
//	
//	//자바 8 이후
//	public void method2(int arg) {
//		int  localVariable = 1;
//		//arg = 100; (x)
//		//localVariable = 100; (x)
//		class Inner {
//			public void method() {
//				int result = arg + localVariable;
//			}
//		}
//	}
	
	String field = "Outter-field";
	void method() {
		System.out.println("Outter-method");
	}
	
	class Nested {
		String field = "Nested-field";
		void method() {
			System.out.println("Nested-method");
		}
		void print() {
			System.out.println(this.field);
			this.method();
			System.out.println(Outter.this.field);
			Outter.this.method();
		}
	}
}
