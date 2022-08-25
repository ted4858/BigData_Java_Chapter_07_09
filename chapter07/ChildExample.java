package chapter07;

public class ChildExample {
	public static void main(String[] args) {
//		Child child = new Child();
//		Parent parent = child;
//		parent.method1();
//		parent.method2();
//		
////		parent.method3();	(호출 불가능)
		
		Parent parent = new Child();
		parent.field1 = "data1";
		parent.method1();
		parent.method2();
		/*
		parent.field2 = "data2";	//(불가능)
		parent.method3();			//(불가능)
		 */
		
		Child child = (Child) parent;
		child.field2 = "yyy";	//(가능)
		child.method3(); 		//(가능)
	}
}
