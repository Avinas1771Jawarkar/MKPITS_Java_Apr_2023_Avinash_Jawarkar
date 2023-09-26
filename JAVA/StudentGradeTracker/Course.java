package StudentGradeTracker;

import java.util.Collection;

public class Course {
    private String coursename;
    private int creditHours;
    private double grade;


//    public int addcourse (){
//        for (Course course: );
//    }


    public Course(String coursename, int creditHours, double grade) {
        this.coursename = coursename;
        this.creditHours = creditHours;
        this.grade = grade;
    }

    public String getCoursename() {
        return coursename;
    }

    public int getCreditHours() {
        return creditHours;
    }

    public double getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return "Course{" +
                "coursename='" + coursename + '\'' +
                ", creditHours=" + creditHours +
                ", grade=" + grade +
                '}';




    }
}
