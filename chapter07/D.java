package chapter07;

public class D extends A {
	public D() {
		A a = new A();		// (o)
		a.field = "value";	// (o)
		a.method();			// (o)
	}
}
