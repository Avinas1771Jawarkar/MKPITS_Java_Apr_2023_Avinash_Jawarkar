package car;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the distance: ");
        int distance=scanner.nextInt();
        System.out.println("Enter the fualconsume: ");
        int fualconsume=scanner.nextInt();

        BMW bmw =new BMW();
        bmw.mileage(distance, fualconsume);
     }
    }
