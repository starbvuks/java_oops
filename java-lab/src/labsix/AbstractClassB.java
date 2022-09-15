package labsix;

abstract class A {
	abstract void call();
}

public class AbstractClassB {
	public void call() {
		System.out.println("call me from B");
	}
	public static void main(String arr[]) {
		AbstractClassB b = new AbstractClassB();
		b.call();
	}
}
