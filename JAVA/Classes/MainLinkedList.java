import java.util.Iterator;
import java.util.List;
import java.util.LinkedList;

public class MainLinkedList {


    public static void main(String[] args) {
       LinkedList list= new LinkedList();
        list.add("avinash");
        list.add("saurabh");
        list.add("nayan");
        list.add("asuhtosh");
        list.add("om");
       list.addFirst(99);
       list.addLast(6);



        System.out.println(list);
        System.out.println("contain methode " + list.contains(6));
        System.out.println("element methode " + list.element());
        System.out.println("get index " + list.get(4));
        System.out.println("getFirst Methode "+list.getFirst());
        System.out.println("getlast methode " +list.getLast());
        System.out.println("index of methode " +list.lastIndexOf(6));  //Returns the index of the first occurrence of the specified element in this list, or -1 if this list does not contain the element.


        Iterator it= list.iterator();
        while (it.hasNext())
        System.out.println( "iteration   " +it.next());




        LinkedList linkedList=new LinkedList();
        linkedList.addAll(list);
        System.out.println(" print " + linkedList);

        System.out.println("remove form Queue (poll methode) " + linkedList.poll());

        System.out.println(" pop methode "+ list.pop());

        System.out.println(list.set(2,6));
        System.out.println(list);

        System.out.println(list.size());

        System.out.println(list.remove(4));
        System.out.println(list);

        list.push(12);
        System.out.println("push methode " + list);



    }
}
