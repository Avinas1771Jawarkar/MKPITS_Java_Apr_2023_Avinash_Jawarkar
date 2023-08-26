import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Assignment {
    public static void main(String[] args) {
        LinkedList linkedList=new LinkedList();

//        //1.append the specified element to the end of a linked list.
        linkedList.add("Avinash");
        linkedList.add("saurabh");
        linkedList.add("nayan");
        linkedList.add("ashutosh");
        linkedList.add("teju");
        linkedList.add("pradnya");


        Scanner scanner=new Scanner(System.in );
        String name, choice;
        do{
            System.out.println("enter name");
            name= scanner.next();
            linkedList.add(name);
            System.out.println("do u want to enter add other yes/no");
            choice= scanner.next();

        }
        while (choice.equalsIgnoreCase("yes"));
        for (Object object:linkedList){
            System.out.println(object);
        }
        System.out.println(linkedList);

        System.out.println(linkedList);

        //2-iterate through all elements in a linked list.

        Iterator iterator=linkedList.iterator();
        while (iterator.hasNext())
        System.out.println(iterator.next());
        System.out.println(linkedList);

        //3.iterate through all elements in a linked list starting at the specified position.

        System.out.println("iterator index");
        for (int number=0; number<3;number++){
            System.out.println(linkedList.get(number));
            System.out.println(linkedList);
        }
//4.iterate a linked list in reverse order.
        System.out.println("Reverse order");
        Iterator reverse=linkedList.descendingIterator();
        while (reverse.hasNext())
        System.out.println(reverse.next());
        System.out.println(linkedList);

        //5.insert the specified element at the specified position in the linked list.

        linkedList.add(3,12);
        System.out.println(linkedList);

        //6.-insert elements into the linked list at the first and last positions.
        linkedList.addFirst(12);
        linkedList.addLast(13);
        System.out.println(linkedList);

        //7.-insert the specified element at the front of a linked list.
        linkedList.addFirst("rudhra");
        System.out.println(linkedList);

        //8.-insert the specified element at the end of a linked list.
linkedList.addLast("mrunalini");
        System.out.println(linkedList);

        //9.-insert some elements at the specified position into a linked list.


        //10. -get the first and last occurrence of the specified elements in a linked list.



        System.out.println(linkedList.indexOf(12));
        System.out.println(linkedList.lastIndexOf("pradnya"));
    }
}
