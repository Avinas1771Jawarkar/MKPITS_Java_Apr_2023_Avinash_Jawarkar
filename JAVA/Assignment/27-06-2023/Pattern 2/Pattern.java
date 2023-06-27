public class Pattern {
    public void pattern(int number) {
        
        for (int row = number; row >= 1; row--) {
            for (int column = row; column >= 1; column--) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
}