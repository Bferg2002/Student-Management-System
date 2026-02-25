package main.java.students.bryantferguson;
//Student class that is a child of Person
public class Student extends Person{
    //fields for a Student
    private int gradeLevel;
    private double gpa;

    //Constructor
    public Student(int id, String firstName, String lastName, String email, double gpa, int gradeLevel) {
        super(id, firstName, lastName, email);
        this.gpa = gpa;
        this.gradeLevel = gradeLevel;
    }

    //returns if the student is on honor roll
    public String isOnHonorRoll(double gpa){
        if(gpa >= 3.5){
            return "Yes";
        }
        return "No";
    }

    //getter methods for the fields
    public int getGradeLevel() {
        return gradeLevel;
    }

    public double getGpa() {
        return gpa;
    }

    //method passed down from the parent class that is overwritten to have its own behavior
    //displays the info of a student
    @Override
    public void getSummary(){
        System.out.println("[Student] " + super.getFirstName() + " " + super.getLastName() + " |" + " Grade Level: "
                + getGradeLevel() + " | " + "GPA: " + getGpa()  + " | " + "Honor Roll: " + isOnHonorRoll(getGpa()));
    }
}
