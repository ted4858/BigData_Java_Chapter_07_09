package chapter08;

public interface ChildInterface2 extends ParentInterface {
	@Override
	public default void method2() {
		/*실행문*/
		System.out.println("ChildInterface2-method2() 실행");
	}
	
	public void method3();
}
