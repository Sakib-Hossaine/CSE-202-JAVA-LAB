import java.util.Scanner;
 
public class Prime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
 
        boolean Prime = true;
 
        if (number <= 1) {
            Prime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    Prime = false;
                    break;
                }
            }
        }
 
        if (Prime) {
            System.out.println("Prime");
        } else {
            System.out.println("Not Prime");
        }
 
        scanner.close();
    }
}