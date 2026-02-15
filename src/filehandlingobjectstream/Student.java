package filehandlingobjectstream;

import java.io.Serializable;

// Student class implements Serializable so objects can be saved to a file
public class Student implements Serializable {

    String name;
    int age;

    // Constructor to create a student object
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display student details
    public void display() {
        System.out.println("Name: " + name + " Age: " + age);
    }
}
