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
        double totalGradePoints = this.cgpa * this.creditCompleted;
        totalGradePoints += courseCredit * courseGpa;
        this.creditCompleted += courseCredit;
        this.cgpa = totalGradePoints / this.creditCompleted;
    }

    public void display() {
        System.out.println("Name: " + this.name + "; Id: " + this.id + "; Credit Completed: " + this.creditCompleted + "; CGPA: " + this.cgpa);
    }

    public double getCgpa() {
        return this.cgpa;
    }
}

