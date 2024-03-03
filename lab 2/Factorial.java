import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = scanner.nextInt();

        if (n < 0) {
            System.out.println("positive numbers please");
        } else {
            long factorial = sumFactorial(n);
            System.out.println(+ factorial);
        }
    }

    private static long sumFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * sumFactorial(n - 1);
        }
    }
}
