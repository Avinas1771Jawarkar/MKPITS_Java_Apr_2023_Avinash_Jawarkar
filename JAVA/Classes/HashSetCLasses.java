import java.util.Arrays;
import java.util.HashSet;

public class HashSetCLasses {
    public static void main(String[] args) {
        HashSet hashSet=new HashSet();
        hashSet.add(100);
        hashSet.add(90);
        hashSet.add(80);
        System.out.println(hashSet);
        System.out.println(hashSet.clone());
        System.out.println(hashSet.contains(10));
        System.out.println(hashSet.contains(100));
        System.out.println(hashSet.isEmpty());
        System.out.println(hashSet.size());
        System.out.println(hashSet.remove(80));
        System.out.println(hashSet);
        hashSet.clear();
        System.out.println(hashSet);

//Hashset convert to Arrays
        Integer[] numArray1={13,24,65,75 ,85};
        Integer[] numArray2={12,25,43,65,85};
        HashSet hashSet1=new HashSet(Arrays.asList(numArray1));
        HashSet hashSet2=new HashSet(Arrays.asList(numArray2));
        System.out.println(hashSet1);
        System.out.println(hashSet2);


        HashSet Unionset1andset2=new HashSet();
        Unionset1andset2.addAll(hashSet1);
        Unionset1andset2.addAll(hashSet2);
        System.out.println(Unionset1andset2);



        Unionset1andset2.retainAll(hashSet1);
        Unionset1andset2.retainAll(hashSet2);
        System.out.println(Unionset1andset2);


        HashSet IntersectionSet1andSet2=new HashSet(hashSet1);
        IntersectionSet1andSet2.retainAll(hashSet2);
        System.out.println(IntersectionSet1andSet2);


        HashSet<Integer> hashSet3=new HashSet<Integer>(Arrays.asList(numArray1));
        HashSet<Integer> hashSet4=new HashSet<Integer>(Arrays.asList(numArray2));
        hashSet3.removeAll(hashSet4);
        System.out.println(hashSet3);



//        Unionset1andset2.(hashSet1);
//        Unionset1andset2.clone(hashSet2);
//        System.out.println(Unionset1andset2);



    }
}
