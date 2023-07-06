package new_area;

import java.util.Scanner;

public class NewMain {


    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        System.out.println("enter 1st number ");
        int num1= scanner.nextInt();

        System.out.println("enter 2st number ");
        int num2= scanner.nextInt();


        NewRectange newRectange = new NewRectange();

       ;
        System.out.println( "area is "+newRectange.rectanglenew( num1,num2));
    }
}
