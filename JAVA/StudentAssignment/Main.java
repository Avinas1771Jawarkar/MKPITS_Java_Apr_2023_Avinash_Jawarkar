package StudentAssignment;

import Serlization.Student;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        LinkedList <Student>linkedList = new <Student>LinkedList();
        Scanner scanner = new Scanner(System.in);

        Student student;

        while (true) {
            System.out.println(" enter 1-Add Record, 2- Display , 3-find , 4-Modify, 5-Delete ,6-Delete All, 7-exit");
            int choice = scanner.nextInt();
             switch (choice) {
                case 1:
                    System.out.println("enter the name");
                    String n=scanner.next();
                    System.out.println("enter the mark");
                    int m=scanner.nextInt();
                    student=new Student(n,m);
                    linkedList.add(student);
                    break;
                case 2:
                    for (Student s:linkedList
                         ) {
                        System.out.println(s.getName()+", "+s.getMarks());

                    }
                    break;


                 case 3:
                     System.out.println("find the sudent data");
                    int find =scanner.nextInt();
                     System.out.println( linkedList.get(find));
                     break;

                 case 4:
                     System.out.println("enter the index no. to  modify student data");
                     int find1 =scanner.nextInt();
                     n=scanner.next();
                     m=scanner.nextInt();
                     System.out.println(linkedList.set(find1,new Student(n,m)));

                      break;

                 case 5:
                     System.out.println(" Enter the index no. which student data is to delete");
                     int delete=scanner.nextInt();
//                     System.out.println(linkedList.clear();
                     break;

                 case 6:
                     System.out.println("delete all");
                     int deleteAll=scanner.nextInt();
                     System.out.println(linkedList.remove());
                     break;






                      case 0:
                        return;












            }
        }


    }
}

