import java.util.Scanner;

public class EvenDigitSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number ");
        long number = scanner.nextLong();

        int sum = EvenDigitSum(number);

        System.out.println( + sum);
    }

    private static int EvenDigitSum(long number) {
        int sum = 0;

        while (number > 0) {
            int digit = (int) (number % 10);
            if (digit % 2 == 0) {
                sum += digit;
            }
            number /= 10;
        }

        return sum;
    }
}