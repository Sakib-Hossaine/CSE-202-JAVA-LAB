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

       
            
        int option;
        Menu:
        while(true){
            System.out.println("give input 1 to 3");
            
            
            option = scanner.nextInt();

            switch (option) {
                case 1:
                System.out.println("1. Update CGPA");
                    System.out.println("Enter course credit:");
                    double courseCredit = scanner.nextDouble();

                    System.out.println("Enter course GPA:");
                    double courseGpa = scanner.nextDouble();

                    student.updateCgpa(courseCredit, courseGpa);
                    break;
                case 2:
                
                System.out.println("2. Show CGPA");
                    System.out.println("Current CGPA: " + student.getCgpa());
                    break;
                case 3:
                System.out.println("3. Display Student Info");
                    student.display();
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 0 and 3.");
            }
        } 
      
    }
}