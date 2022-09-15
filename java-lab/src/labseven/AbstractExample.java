package labseven;

abstract class vehicle {
	abstract void engine();
}
class car extends vehicle {
	public void engine() {
		System.out.println("car has good engine");
	}
}
class truck extends vehicle {
	public void engine() {
		System.out.println("truck has bad engine");
	}
}

public class AbstractExample {
	public static void main(String arr[]) {
		vehicle v = new car();
		v.engine();
		vehicle n = new truck();
		n.engine();
	}
}
