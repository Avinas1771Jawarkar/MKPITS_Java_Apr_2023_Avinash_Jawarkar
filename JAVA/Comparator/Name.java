package Comparator;

import java.util.Comparator;

public class Name implements Comparator<Student> {
    @Override
    public int compare(Student o1,Student o2) {

        if (o1.getName()==o2.getName()) {
            return 0;
        }
        else if(o1.getName().compareTo( o2.getName())<0) {
            return -1;
        }
        else {
            return 1;
        }
    }


}
