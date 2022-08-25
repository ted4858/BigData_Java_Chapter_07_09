package chapter09;

public class AnonymousExample_5 {
	public static void main(String[] args) {
		Anonymous_5 anony = new Anonymous_5();
		anony.field.run();
		anony.method1();
		anony.method2(
			new Vehicle() {
				@Override
				public void run() {
					System.out.println("트럭이 달립니다.");
				}
			}
		);
	}
}
