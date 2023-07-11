package Switch;

//import java.util.Scanner;

import java.util.Scanner;

class Time {


    public static void main(String[] args) {

        Scanner scanner =new Scanner(System.in);
        System.out.println("enter the time");
        int time =scanner.nextInt();


        if (time < 10) {
            System.out.println("good morning");
        } else if (time < 18) {
            System.out.println("GOOD GAY");
        } else {
            System.out.println("good evening");
        }


    }

}
