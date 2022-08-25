package chapter08;

public interface ParentInterface {
	public void method1();
	public default void method2() { 
		/*실행문*/ 
		System.out.println("ParentInterface-method2() 실행"); 
	}
}
