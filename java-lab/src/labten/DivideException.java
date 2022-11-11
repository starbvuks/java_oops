package labten;

public class DivideException {
	public static void main(String arr[]) {
		try
		{
			if(arr.length<2) 
				throw(new Exception("two args must be provided"));
			
			int a = Integer.parseInt(arr[0]);
			int b = Integer.parseInt(arr[1]);
			if(b == 0)
				throw(new Exception("second arg must be non zero"));
				
			float c = a/b;
			System.out.println("result: " +c);
		} catch(Exception e) {
			System.out.println(e);
		}
	}
}
