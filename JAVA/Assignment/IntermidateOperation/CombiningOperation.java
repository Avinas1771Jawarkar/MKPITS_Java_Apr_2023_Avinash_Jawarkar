package IntermidateOperation;

import VarArray.Sum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CombiningOperation {
    public static void main(String[] args) {
        List<Integer> number= Arrays.asList(12,23,34,45,56,67,78);
        List list= number.stream().filter(n->n%2==0.).collect(Collectors.toList());
        System.out.println(list);
        List list1= number.stream().filter(n->n%2!=0).map(n->n*2).collect(Collectors.toList());
        System.out.println(list1);
        int list2=number.stream().reduce(0,(Sum,integer)->Sum+integer);
        System.out.println(list2);
    }
}
