package main.java.students.bryantferguson;

import java.util.ArrayList;
//Instructor class that is a child of Person
public class Instructor extends Person{
    //fields of an Instructor
    private String department;
    private ArrayList<Student> students;

    public Instructor(int id, String firstName, String lastName, String email, String department) {
        super(id, firstName, lastName, email);
        this.department = department;
        this.students = new ArrayList<>();
    }

    //getter method for the department field
    public String getDepartment() {
        return department;
    }

    //methods for adding and removing students from Instructor's roster
    public void addStudent(Student student){
        students.add(student);
    }

    public void removeStudent(Student student){
        students.remove(student);
    }

    //displays the full contents of the students list
    public void displayRoster() {
        System.out.println("[Instructor] Dr." + super.getFirstName() + "'s Roster:");
        for(Student student : students) {
            student.getSummary();
        }
        System.out.println("****************************************************");
    }

    //returns whatever value is stored in method
    public void createAnnouncement(String message){
        System.out.println(message);
    }

    //method passed down from the parent class that is overwritten to have its own behavior
    //displays the info of a student
    @Override
    public void getSummary(){
        System.out.println("[Instructor] Dr. " + super.getFirstName() + " | " + "Department: " + getDepartment());
    }

}
