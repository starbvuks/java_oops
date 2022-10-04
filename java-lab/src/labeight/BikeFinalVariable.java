package labeight;

/* WAJP to demonstrate the use of final keyword with
 * variables */

public class BikeFinalVariable {
	final int speedlimit=90;
	void run() {
		// speedLimit = 400;
		System.out.println("SpeedLimit: " + speedlimit);
	}
	public static void main(String args[]) {
		BikeFinalVariable obj = new BikeFinalVariable();
		obj.run();
	}
}