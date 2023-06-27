import java.util.Scanner;

public class StarPatternRightAngleUpperHalf{
    public void starPatternRightAngleUpperHalf(int number){
        //upper half
        for (int row = 1; row <= number; row++) {
            for (int column = 1; column <= row; column++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
}