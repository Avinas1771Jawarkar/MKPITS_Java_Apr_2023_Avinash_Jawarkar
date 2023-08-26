package VarArray;

public class SumMain {
    private static Substraction object1;

    public static void main(String[] args){

        Sum object=new Sum();
        int ansWER=object.sum(1,12,11);
        System.out.println(ansWER);

        Substraction OBJ=new Substraction();
        int ANSwer=object1.substraction(100,12);
        System.out.println(ANSwer);

    }
}
