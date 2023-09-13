package anonymous;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class MAin {
    public static void main(String[] args) {
        LinkedList<Student> linkedList=new LinkedList();
        Student[] student=new Student[4];

        student[0] = new Student("Avinash", 99);
        student[1] = new Student("Saurabh", 98);
        student[2] = new Student("Nayan", 97);
        student[3] = new Student("Aushotosh", 96);

        linkedList.addAll(Arrays.asList(student));

       Collections.sort(linkedList, new Comparator<Student>() {
           @Override
           public int compare(Student o1, Student o2) {
               if (o1.getMarks()==o2.getMarks()){
                   return 0;
               }
               else if(o1.getMarks()<o2.getMarks()){
                   return -1;
               }
                   else  return 1;
               }

       });
        System.out.println(linkedList);

    }
}
