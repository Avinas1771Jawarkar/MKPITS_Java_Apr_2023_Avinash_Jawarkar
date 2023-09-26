package StudentGradeTracker;

import java.util.List;

public class Student {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public Student() {

    }

    public String getName() {
        return name;
    }

    List<Course> courses ;

    public Student(List<Course> courses) {
        this.courses = courses;
    }
//    public void addcourse(){
//
//            courses.add();
//
//
//        }




}



