package Calculation;

import java.util.Scanner;

public class MainCalculation {
    public static void main(String[] args){
        int result ;
        Calculation s;

        Scanner scanner =new Scanner(System.in);
        System.out.println(" enter 1-Addition , 2- Substraction , 3-Multiplication , 4-Division" );
        int choice = scanner.nextInt();
        switch (choice){

            case 1: s=new Addition();
            System.out.print("enter the two number");
            result=s.calculation(scanner.nextInt(), scanner.nextInt());
                System.out.println(result);


            case 2:

                s=new Substraction();
                System.out.println("enter the two number");
                result=s.calculation(scanner.nextInt(), scanner.nextInt());
                System.out.println(result);



            case 3:
                s=new Multiplication();
                System.out.println(" enter the tow number");
                result=s.calculation(scanner.nextInt() , scanner.nextInt());
                System.out.println(result);

            case 4:
                s=new Division();
                System.out.println("enter the two number");
                result=s.calculation(scanner.nextInt(), scanner.nextInt());
                System.out.println(result);



            default:
                System.out.println("invalid number");
        }



    }


}
