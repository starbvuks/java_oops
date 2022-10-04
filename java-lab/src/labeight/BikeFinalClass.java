package labeight;

/* WAJP to demonstrate the use of final keyword with
 * class */

class Kawasaki{}
class BikeFinalClass extends Kawasaki{
	void run() {
		System.out.println("running safely");
	}
	
	public static void main(String args[]) {
		BikeFinalClass k = new BikeFinalClass();
		k.run();
	}
}

