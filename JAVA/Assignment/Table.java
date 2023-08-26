import java.util.Scanner;

public class Table {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number which table you want");
        int sum = scanner.nextInt();


    for(int counter=1 ; counter<11 ; counter++){
        System.out.println( sum*counter+" ");

    }
    }
}
