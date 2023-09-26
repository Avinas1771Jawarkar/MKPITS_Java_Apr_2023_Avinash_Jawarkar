package IntermidateOperation;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Mapping {
    public static void main(String[] args) {
        List<Integer> number =Arrays.asList(12,23,34,45,56,67,78);
        List list= number.stream().map(c->c*2).collect(Collectors.toList());
        System.out.println(list);
    }
}
