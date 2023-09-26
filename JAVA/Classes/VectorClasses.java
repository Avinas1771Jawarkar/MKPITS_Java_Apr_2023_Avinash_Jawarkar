import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Vector;

public class VectorClasses {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        Vector vector =new Vector();
        Integer arr []= new Integer[3];

vector.add(100);
vector.add(200);
vector.add(300);
        System.out.println(vector);
        System.out.println(" cheack the value in vector  "+ vector.contains(100));
        System.out.println(vector.toString());
        vector.trimToSize();
        System.out.println(vector);
        System.out.println(vector.elementAt(1));
        System.out.println(vector.equals(100));
        vector.copyInto(arr);
        System.out.println(vector);
        System.out.println(vector.capacity());
        System.out.println(vector.size());
        vector.iterator();
        System.out.println(vector);


        Integer[] arra = new Integer[3];
        //copy elements of vector into an array
        vector.copyInto(arr);
        System.out.println("Elements in an array are: ");
        for(Integer num : arr)
        {
            System.out.println(num);
        }

        System.out.println(vector);
    }

}

