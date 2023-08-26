package VarArray;

public class Substraction {
    public static int substraction(int ...num){
        int s=0;
        for(int i:num){
            s=+i-s;

        }
       return s;
    }

}
