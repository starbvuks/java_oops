package labnine;

public class ExceptionHandlingOne {
	public static void main(String arr[]) {
		try 
		{
			int a = Integer.parseInt(arr[0]);
			if(a< 10 || a>50)	
				throw(new Exception("Valid range is between 10 and 50")); 
			
			int s= a*a;
			System.out.println("Square is: "+s);
				
		}catch(Exception ex) {
			//ex.printStackTrace();
			System.out.println("Numbers are out of range");
		}
	}
}
