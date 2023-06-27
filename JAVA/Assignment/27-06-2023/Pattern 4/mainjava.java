import java.util.Scanner;

public class Mainjava {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter upper half number : ");
        int number1 = scanner.nextInt();
        System.out.println("Enter lower half number : ");
        int number2 = scanner.nextInt();
        StarPatternRightAngleUpperHalf starRightAngleUpperHalf = new StarPatternRightAngleUpperHalf();
        starRightAngleUpperHalf.starPatternRightAngleUpperHalf(number1);


        StarPatternDownRightAngleLowerHalf starDownRightAngleLowerHalf = new StarPatternDownRightAngleLowerHalf();
        starDownRightAngleLowerHalf.starPatternDownRightAngleLowerHalf(number2);
    }
}