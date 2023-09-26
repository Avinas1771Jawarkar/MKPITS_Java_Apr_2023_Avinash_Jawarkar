

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class consumer {
    public static void main(String[] args) {
        List<String> cities = Arrays.asList("Amravati","Pune","Nagpur","Mumbai");
        Consumer<List<String>> upperCaseConsumer=list->{
            for (int i=0;i< list.size();i++){
                list.set(i,list.get(i).toUpperCase());
            }
        };
        upperCaseConsumer.andThen(upperCaseConsumer).accept(cities);


        System.out.println("Supplier Interface");

        //
        Supplier<Double>supplier=()->{
            return Math.random();
        };
        System.out.println(supplier.get());

        System.out.println("perdicate Interface");
        //
        Predicate<String> namecontainA=str ->str.contains("A");
        cities.stream().filter(namecontainA).forEach(System.out::println);

        System.out.println("Functional Interface");
        Function<String,Integer> nameMappingFunction =String::length;
        cities.stream().map(nameMappingFunction).forEach(System.out::println);



    }
}
