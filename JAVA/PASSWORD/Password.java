package PASSWORD;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class Password {
    public static void main(String[] args) {

        String STR = "a74qi5r1";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the password");
        String str = scanner.next();

        if (STR.compareTo(str)==0){
            System.out.println("valid password" );
        } else {
            System.out.println("invalid password");

        }

    }
}
