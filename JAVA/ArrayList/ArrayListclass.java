
import java.util.*;

    public class ArrayListclass{

            public static void main(String[] args) {
                List list = (List) new ArrayList();
                list.add(45);
                list.add(13);
//        list.add(45,35);
                list.add(99);
                System.out.println(list);
                System.out.println("using for loop");
                for(int elementNumber=0;elementNumber<list.size();elementNumber++){
                    System.out.println(list.get(elementNumber));
                }

            }
        }