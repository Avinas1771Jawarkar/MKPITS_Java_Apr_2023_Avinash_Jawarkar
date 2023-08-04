package calculation;

import calculation.*;

import java.util.Scanner;


public class MainCalculation {

    public static void main(String[] args){
        int result;

        Calculation s;


        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter 1-Addition, 2-Substraction, 3-Multiplaction, 4-Division ");
        int choice = scanner.nextInt();
        switch (choice)
        {
            case 1:
                s=new Addition();
                System.out.println("enter the 2 number");
               result =s.calculate (scanner.nextInt(), scanner.nextInt());
                System.out.println(result);
                break;

                case 2:
                    s=new Substraction();
                    System.out.println("enter the 2 number");
                     result = s.calculate(scanner.nextInt(), scanner.nextInt());
                    System.out.println(result);
                    break;

                    case 3:
            s=new Multiplication();
            System.out.println("enter the 2 number");
            result = s.calculate(scanner.nextInt(), scanner.nextInt());
            System.out.println(result);
            break;

            case 4:
                s=new Division();
                System.out.println("enter the 2 number");
                 result = s.calculate(scanner.nextInt(), scanner.nextInt());
                System.out.println(result);
                break;

            default:
                System.out.println("invalid ");


        }




    }

}

