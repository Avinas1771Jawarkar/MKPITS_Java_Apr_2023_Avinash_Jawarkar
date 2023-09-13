package LambdaFunction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {

        ArrayList<Student> arrayList=new ArrayList();
        Student[] students=new Student[4];

        students[0]=new Student("Avinash",99);
        students[1]=new Student("Rudhra",91);
        students[2]=new Student("Ankush",70);
        students[3]=new Student("Ananya",97);

        arrayList.addAll(Arrays.asList(students));

        Comparator<Student> student =(avinash,shreyash)->{
            if(avinash.getMarks()==shreyash.getMarks()){
                return 0;
            }
            else if(avinash.getMarks()<shreyash.getMarks()) {
              return -1;
            }
            else
                return 1;

        } ;
        Collections.sort(arrayList,student);
        System.out.println("using marks= -> "+ arrayList);

        Comparator<Student> studentComparator=(avinash ,shreyash)->{
            return  avinash.getName().compareTo(shreyash.getName());

        };
        Collections.sort(arrayList,studentComparator);
        System.out.println("using name -> "+ arrayList);

    }

}
