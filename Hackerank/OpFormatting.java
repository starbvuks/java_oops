import java.util.Scanner;

public class OpFormatting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("================================");
        for (int i = 0; i < 3; i++) {
            String s1 = sc.next();
            int x = sc.nextInt();
            System.out.printf("%s  %d\n", s1, x);
            // Complete this line
        }
        System.out.println("================================");

    }
}
