package Integer;

import java.util.Scanner;

public class Ienteger {
    int number =12;

    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the number");
        int ans=scanner.nextInt();

        System.out.println(Integer.toBinaryString(ans));
        System.out.println(Integer.toOctalString(ans));
        System.out.println(Integer.toHexString(ans));



    }
}
