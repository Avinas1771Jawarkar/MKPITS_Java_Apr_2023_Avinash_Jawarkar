import java.util.Arrays;


public class ClassArrays {
    public static void main(String[] args) {
        int arrNum[] = {12,23,34,45};
        int ArrNum[]={12,43,45,67};
        int aRaNum[]={12,34,53,64,42};
        System.out.println(Arrays.binarySearch(arrNum,34));
        System.out.println("compare of tow array" +Arrays.compare(arrNum,ArrNum));
//        Arrays.fill(arrNum,7);
        int newarray[]=Arrays.copyOf(arrNum,10);
        for(int number=0; number<newarray.length;number++) {
            System.out.print( + newarray[number]);   //copy of methode
        }


        System.out.println(Arrays.compareUnsigned(arrNum,aRaNum));



    }
}
