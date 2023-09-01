package Serlization;

import java.io.ObjectOutputStream;

public class Student implements java.io.Serializable {
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMarks() {
        return marks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", marks=" + marks +
                '}';
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    int marks;

    public Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

}
