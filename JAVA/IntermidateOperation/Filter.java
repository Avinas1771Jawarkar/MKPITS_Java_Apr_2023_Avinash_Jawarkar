package IntermidateOperation;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Filter {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("Pranjal","Rani","Prajacta","Ananya","Shrushti","Avinash","Abhishek");
        List list1=names.stream().filter(c->c.contains("A")).collect(Collectors.toList());
        System.out.println(list1);
    }
}
