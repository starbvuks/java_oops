package misc;

public class ShiftOp {
		  public static void main(String args[]) {
		    byte a = 127, b;
		    int i;
		    i = a << 2;
		    b = (byte)(a << 2);
		    System.out.println("Original value of a: " + a);
		    System.out.println("i and b: " + i + " " + b);
		  }
}
