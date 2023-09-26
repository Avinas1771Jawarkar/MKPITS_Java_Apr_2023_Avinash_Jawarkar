import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class IntermidateOperation {

    public static void main(String[] args) {
        List<Integer> number= Arrays.asList(11,22,33,44,55,66,77,88,99);
       List list= number.stream().filter(n->n%2==0).collect(Collectors.toList());
        System.out.println(list);

        List<String> cities =Arrays.asList("Amravati","Pune","Nagpur","Wardha","Mumbai","Satara","Akola","Buladhna");
         List list1=cities.stream().map(c->c).collect(Collectors.toList());
        System.out.println(list1);

        int s=number.stream().reduce(0,(sum,n)->sum+n);
        System.out.println(s);

    }}
