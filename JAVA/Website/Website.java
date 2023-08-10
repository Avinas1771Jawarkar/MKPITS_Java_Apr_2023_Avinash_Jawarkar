package Website;

import java.util.Scanner;

public class Website {
    public static void main(String[] args){
        String website= "http://www.";

        Scanner scanner=new Scanner(System.in);
        System.out.println(" Enter the website");
         String web =scanner.next();


              String STR=web.substring(0,11);

         if(STR.equals("http://www.")){
            if (web.substring(11).contains("."))
                System.out.println("Valid website");
             else
                System.out.println("invalid");

        }

            else
            System.out.println("invalid");


    }
}

