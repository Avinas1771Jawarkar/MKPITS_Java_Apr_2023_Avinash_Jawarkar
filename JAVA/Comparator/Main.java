package Comparator;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {


        LinkedList<Student> linkedList = new LinkedList<Student>();
        Student[] student = new Student[4];

        student[0] = new Student("Avinash", 99);
        student[1] = new Student("Saurabh", 98);
        student[2] = new Student("Nayan", 97);
        student[3] = new Student("Aushotosh", 96);

        linkedList.addAll(Arrays.asList(student));
        Collections.sort(linkedList, new Marks());
        Collections.sort(linkedList, new Name());
        for (Student student1 : linkedList) {

            System.out.println(student1.getMarks() + " " + student1.getName());


        }
    }
}
