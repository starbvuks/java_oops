package labnine;

import java.util.Scanner;

public class MatrixAdd {
	public static void main(String args[]) {
		int[][] x = new int[3][3];
		int[][] y = new int[3][3];
		int[][] z = new int[3][3];
		
		Scanner input = new Scanner(System.in);
		for(int i = 0; i<3; i++) {
			for(int j=0; j<3; j++) {
				System.out.println("Enter the value for matrix x["+i+"]["+j+"]: ");
				x[i][j] = input.nextInt();
			}
		}
		for(int i = 0; i<3; i++) {
			for(int j=0; j<3; j++) {
				System.out.println("Enter the value for matrix y["+i+"]["+j+"]: ");
				y[i][j] = input.nextInt();
			}
		}
		for(int i = 0; i<3; i++) {
			for(int j=0; j<3; j++) {
				z[i][j] = x[i][j] + y[i][j];
			}
		}
		for(int i = 0; i<3; i++) {
			for(int j=0; j<3; j++) {
				System.out.print(z[i][j]+" ");
			}
			System.out.print("\n");
		}
	}
}
