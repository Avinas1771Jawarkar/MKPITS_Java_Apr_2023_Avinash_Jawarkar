import java.util.Scanner;

public class loop {

        public static void main(String [] args){

            Scanner scanner=new Scanner(System.in);
            System.out.println("enter the value for pattern");

        int number= scanner.nextInt();


            for (int counter=1; counter<=number; counter++ ){
                for (int counter1 =number ; counter1>=counter; counter1--){
                    System.out.print(" * ");
                }
                System.out.println();
            }
        }

}
