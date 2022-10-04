package misc;

import java.io.*;

public class StremReader {
	public static void main(String[] args) throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String str;
		do{
			str = reader.readLine();
			System.out.println(str);
			
		}while(!str.equals("stop"));
	}
}
