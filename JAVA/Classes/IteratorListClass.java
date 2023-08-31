import java.util.LinkedList;
import java.util.ListIterator;

public class IteratorListClass {
    public static void main(String[] args) {
        LinkedList linkedList=new LinkedList();
        linkedList.add(2);
        linkedList.add(8);
        linkedList.add(5);
        linkedList.add(4);


        ListIterator numberIterator=linkedList.listIterator();
        while (numberIterator.hasNext()){                         //--------------forwar direction--------------------
            System.out.println(numberIterator.next());
        }
        while(numberIterator.hasPrevious()){                      //--------------reverse direction--------
            System.out.println(numberIterator.previous());
        }



        }

    }

