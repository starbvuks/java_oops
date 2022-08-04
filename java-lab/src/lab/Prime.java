package lab;
import java.util.*;

public class Prime {
	public static void main(String arr[]) {

		Scanner in = new Scanner(System.in);
		System.out.println("Enter number: ");
		int n = in.nextInt();
		
	    boolean flag = false;
	    for (int i = 2; i<n ; ++i) {

	      if (n % i == 0) {
	        flag = true;
	        break;
	      }
	    }
	    
	    if (!flag)
	        System.out.println(n + " is prime");
	      else
	        System.out.println(n + " isn't prime");
		in.close();
	}
}
