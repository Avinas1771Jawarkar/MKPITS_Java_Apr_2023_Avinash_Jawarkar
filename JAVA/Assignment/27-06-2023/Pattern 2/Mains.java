import java.util.Scanner;

public class Mains {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		 System.out.println("Enter lower half number : ");
        int number1 = scanner.nextInt();
		
		 Pattern PATTERN = new Pattern();
        PATTERN.pattern(number1);
    }
}