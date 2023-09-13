package LambdaFunction;

public class Student {
    private String Name;
    private int  Marks;

    public Student(String name, int marks) {
        Name = name;
        Marks = marks;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getMarks() {
        return Marks;
    }

    public void setMarks(int marks) {
        Marks = marks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "Name='" + Name + '\'' +
                ", Marks=" + Marks +
                '}';
    }
}
