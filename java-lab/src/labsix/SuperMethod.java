package labsix;


class Woxsen{
	void name() {
		System.out.println("Woxsen...");
	}
}

class University extends Woxsen {
	void name() {
		System.out.println("Woxsen University...");
	}
	void lastname() {
		System.out.println("University...");
	}
	
	void work() {
		super.name();
		lastname();
	}
}

public class SuperMethod{
	public static void main(String args[]) {
		University d = new University();
		d.work();
	}

}
