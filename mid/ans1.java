import java.util.Scanner;

public class java {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the arrays: ");
        int n = scanner.nextInt();

        int[] array1 = new int[n];
        int[] array2 = new int[n];
        int[] array3 = new int[n];

        System.out.println("Enter elements for the first array: ");
        for (int i = 0; i < n; i++) {
            array1[i] = scanner.nextInt();
        }

        System.out.println("Enter elements for the second array: ");
        for (int i = 0; i < n; i++) {
            array2[i] = scanner.nextInt();
        }

        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (array2[j] > array1[i]) {
                    count++;
                }
            }
            array3[i] = count;
        }

        System.out.println("The third array is: ");
        for (int i = 0; i < n; i++) {
            System.out.print(array3[i] + " ");
        }

        scanner.close();
    }
}