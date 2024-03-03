import java.util.Scanner;
public class Assignment6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 10 numbers:");

        for (int i = 0; i < 10; i++) {
         
            int number = scanner.nextInt();

            if ((number % 3 == 0 || number % 5 == 0) && !(number % 3 == 0 && number % 5 == 0)) {
                System.out.println(number);
            }
        }

        scanner.close();
    }
}