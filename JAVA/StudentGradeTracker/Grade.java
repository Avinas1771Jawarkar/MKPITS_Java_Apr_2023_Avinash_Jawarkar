package StudentGradeTracker;


import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {

//
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the name");
        String NAME= scanner.next();
        Student student=new Student(NAME);

        System.out.println("Enter the No. Course");
        int  StudentCourse= scanner.nextInt();

        for(int i=0;i<StudentCourse;i++) {
            System.out.println("Enter the course");
            String COURSE = scanner.next();

            System.out.println("Enter the credit");
            int studentcredit = scanner.nextInt();

            System.out.println("Enter the grade");
            int GRADE = scanner.nextInt();


        }







    }
}
