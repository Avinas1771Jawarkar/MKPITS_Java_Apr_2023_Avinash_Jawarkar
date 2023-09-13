package ConstructedREference;


import Comparator.Student;

public class Main {
    public static void main(String[] args) {

        ConstructedReference constructedReference = Comparator.Student::new;
        Student student=constructedReference.getname("Avinash",99);
        System.out.println(student);
    }

}
