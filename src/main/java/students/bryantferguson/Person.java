package main.java.students.bryantferguson;
//abstract class that outlines what a Person should be like
public abstract class Person {
    //fields for a Person
    private int id;
    private String firstName;
    private String lastName;
    private String email;

    //constructor
    public Person(int id, String firstName, String lastName, String email) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    //getters
    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }


    //method to be passed down to child classes
    public abstract void getSummary();
}
