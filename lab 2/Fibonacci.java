import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter  n: ");
        int n = scanner.nextInt();


        printFibonacci(n);
    }

    private static void printFibonacci(int n) {
        int first = 1;
        int second = 1;

        for (int i = 0; i < n; i++) {
            System.out.println(first);
            int next = first + second;
            first = second;
            second = next;
        }
    }
}
