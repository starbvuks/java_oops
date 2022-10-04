package labeight;

/* WAJP to demonstrate the use of final keyword with
 * methods */

class Bike {
	final void run() {
		System.out.println("Riding");
	}
}

public class BikeFinalMethod extends Bike {	
//	void run() {
//		System.out.println("running at 100kmph");
//	}
	void running() {
		System.out.println("Kawasaki - 948cc");
	}
	public static void main(String args[]) {
		BikeFinalMethod honda = new BikeFinalMethod();
		honda.run();
		honda.running(); 
	}
}
