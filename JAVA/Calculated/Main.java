package Calculated;

import java.util.Scanner;

public class Main {
public static void main(String[] args){


    Scanner scanner =new Scanner(System.in);
    System.out.println("LAMBDA PROGRAM");
    System.out.println("enter the first value");
    int i= scanner.nextInt();
    System.out.println("enter the second value");
     int i1=scanner.nextInt();
    System.out.println("1= addition , 2= substraction");
    int choice = scanner.nextInt();
    int result;


    switch (choice){
        case 1:

            Calculated cal=(a,b)-> System.out.println("Addition of tow number " + (i+i1));
            cal.Calculation(i,i1);
        break;

        case 2:  Calculated cal1=(a,b)-> System.out.println("substraction of tow number " + (i-i1));
            cal1.Calculation(i,i1);
        break;


    }



//   cal.Calculation();
//   cal1.Calculation();
}

}

