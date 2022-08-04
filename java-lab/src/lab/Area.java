package lab;
import java.util.*;

public class Area {
	static public void main(String arg[]) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter length: ");
		float l = in.nextFloat() ;
		
		System.out.println("Enter base: ");
		float b = in.nextFloat() ;
		
		float area = (l*b)/2;
		System.out.println(area+ "is the area");
		
		in.close();
	}
}
