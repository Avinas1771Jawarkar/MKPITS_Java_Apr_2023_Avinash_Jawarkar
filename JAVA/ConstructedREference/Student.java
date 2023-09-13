package ConstructedREference;


    public class Student {
        private String name;
        private int marks;

        public Student(String name, int marks) {
            this.name = name;
            this.marks = marks;
        }

        public Student() {

        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            name = name;
        }

        public int getMarks() {
            return marks;
        }

        public void setMarks(int marks) {
            marks = marks;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "name='" + name + '\'' +
                    ", marks=" + marks +
                    '}';
        }
    }


