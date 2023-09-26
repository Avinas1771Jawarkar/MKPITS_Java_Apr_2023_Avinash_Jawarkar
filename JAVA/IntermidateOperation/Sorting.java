package IntermidateOperation;

import java.util.Arrays;

import java.util.List;
import java.util.stream.Collectors;

public class Sorting {
    public static void main(String[] args) {

        List<String> Name= Arrays.asList("Avinash","Abhishek","Pranay","Saurabh","Nayan","Aushtosh");
        List list= Name.stream().sorted().collect(Collectors.toList());
        System.out.println(list);
    }
}
