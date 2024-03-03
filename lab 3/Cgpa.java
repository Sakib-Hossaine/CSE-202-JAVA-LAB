import java.util.Scanner;

public class Cgpa {
    public static void main(String[] args)  {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter student name:");
        String name = scanner.nextLine();

        System.out.println("Enter student id:");
        String id = scanner.nextLine();

        System.out.println("Enter initial credit completed:");
        double creditCompleted = scanner.nextDouble();

        System.out.println("Enter initial CGPA:");
        double cgpa = scanner.nextDouble();

        Student student = new Student(name, id, creditCompleted, cgpa);

        System.out.println("Enter course credit:");
        double courseCredit = scanner.nextDouble();

        System.out.println("Enter course GPA:");
        double courseGpa = scanner.nextDouble();

        student.updateCgpa(courseCredit, courseGpa);
        student.display();

       
    }
}