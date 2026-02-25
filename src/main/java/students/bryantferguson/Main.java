package main.java.students.bryantferguson;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //Instructor objects
        Instructor instructor1 = new Instructor(101, "Bryant","Ferguson","bferg@gmail.com", "Computer Science");
        Instructor instructor2 = new Instructor(102, "Kerry","Ferguson","kferg@gmail.com", "Computer Science");
        Instructor instructor3 = new Instructor(103, "Shawn","Ferguson","sferg@gmail.com", "Computer Science");
        ArrayList<Instructor> instructorList = new ArrayList<>(Arrays.asList(instructor1,instructor2,instructor3));

        instructor1.getSummary();
        instructor2.getSummary();
        instructor3.getSummary();
        System.out.println("------------------");

        //Student objects
        Student s1 = new Student(120,"Bob","Jeff", "123@gmail.com",1.1,2);
        Student s2= new Student(121,"Fer","Jeff", "222@gmail.com",1.1,2);
        Student s3 = new Student(122,"Ray","Jeff", "447@gmail.com",1.1,2);
        Student s4 = new Student(120,"Lily","Richards", "444@gmail.com",2.5,3);
        Student s5= new Student(121,"Rachel","Richards", "555@gmail.com",2.8,3);
        Student s6 = new Student(122,"Susan","Richards", "666@gmail.com",2.9,3);
        Student s7 = new Student(120,"Kemain","Brown", "000@gmail.com",3.7,4);
        Student s8= new Student(121,"Paul","Brown", "333@gmail.com",3.5,4);
        Student s9 = new Student(122,"Rashid","Brown", "111@gmail.com",3.8,4);

        //giving each teacher a roster of students
        instructor1.addStudent(s1);
        instructor1.addStudent(s2);
        instructor1.addStudent(s3);
        instructor2.addStudent(s4);
        instructor2.addStudent(s5);
        instructor2.addStudent(s6);
        instructor3.addStudent(s7);
        instructor3.addStudent(s8);
        instructor3.addStudent(s9);

        //shows the teacher and their roster of students
        instructor1.displayRoster();
        instructor2.displayRoster();
        instructor3.displayRoster();

        //shows the announcement that the instructor made
        instructor1.createAnnouncement("Bryant is the BEST instructor!");
    }
}
