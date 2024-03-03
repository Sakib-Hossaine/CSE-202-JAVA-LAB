import java.util.Scanner;
 
public class LCM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        System.out.print("Enter the first integer: ");
        int num1 = scanner.nextInt();
 
        System.out.print("Enter the second integer: ");
        int num2 = scanner.nextInt();
 
        int gcd = 1;
 
        for (int i = 1; i <= num1 && i <= num2; ++i) {
            if (num1 % i == 0 && num2 % i == 0) {
                gcd = i;
            }
        }
 
        int lcm = (num1 * num2) / gcd;
 
        System.out.println( + lcm);
    }
}