package Serlization;

import java.io.*;

public class FileReadWrite {
    public static void writeObjectToFile(Student s) throws IOException {
        ObjectOutputStream oss = new ObjectOutputStream(new FileOutputStream("avinash.txt"));
        oss.writeObject(s);


    }

    public static void readObjectToFile() throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("avinash.txt"));
        Student student = (Student) ois.readObject();
        System.out.println(student.getName() + " " + student.getMarks());
    }

//    public static void readFormFile(String fname) throws IOException {
//
//        try {
//            File file = new File(fname);
//            BufferedReader br = new BufferedReader(new FileReader(file));
//            String str = br.readLine();
//            while (str != null) {
//                System.out.println(str);
//                str = br.readLine();
//            }
//
//           else{
//                System.out.println("File does not exist");
//
//
//            }
//
//
//        }
//   catch (FileNotFoundException e){
//       System.out.println(e);
//
//
//   }



    }

