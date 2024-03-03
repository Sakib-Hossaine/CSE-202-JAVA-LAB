public class Student {
    private String name;
    private String id;
    private double creditCompleted;
    private double cgpa;

    public Student(String name, String id, double creditCompleted, double cgpa) {
        this.name = name;
        this.id = id;
        this.creditCompleted = creditCompleted;
        this.cgpa = cgpa;
    }

    public void updateCgpa(double courseCredit, double courseGpa) {
        double totalQualityPoints = this.cgpa * this.creditCompleted;
        totalQualityPoints += courseCredit * courseGpa;
        this.creditCompleted += courseCredit;
        this.cgpa = totalQualityPoints / this.creditCompleted;
    }

    public void display() {
        System.out.println("\t========================UAP CSE STUDENT RESULT========================\n" );
        System.out.println("\tName: " + this.name + ";\n \tId: " + this.id + ";\n \tCredit Completed: " + this.creditCompleted + ";\n \tCGPA: " + this.cgpa);
        System.out.println("\t========================Best Wishes========================\n" );
    }
}