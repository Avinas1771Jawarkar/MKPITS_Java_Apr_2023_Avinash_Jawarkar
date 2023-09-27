import java.util.HashMap;

public class HashMapClasses {
    public static void main(String[] args) {
        HashMap hashMap=new HashMap();
        hashMap.put(101,"Avinash");
        hashMap.put(102, "Saurabh");
        hashMap.put(103,"Nayan");
        hashMap.put(104, "aushtosh");
        System.out.println(hashMap);

        HashMap hashMap1=new HashMap();
        hashMap1.putAll(hashMap);
        System.out.println(hashMap1);
        System.out.println(hashMap.containsKey(103));
        System.out.println(hashMap.get(101));
        hashMap1.replace(102,"Prajwal");
        System.out.println(hashMap1);

        System.out.println(hashMap1.getOrDefault(105,"om"));






    }
}
