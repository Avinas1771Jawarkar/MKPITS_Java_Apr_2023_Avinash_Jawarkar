package Comparable;

import Comparator.Name;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {


        LinkedList<Empolyee> linkedList = new LinkedList<Empolyee>();
        Empolyee[] empolyees = new Empolyee[5];
        empolyees[0]=new Empolyee("Ashish sir",50000 );
        empolyees[1]=new Empolyee("Gati sir",40000 );
        empolyees[2]=new Empolyee("Rajesh sir",30000 );
        empolyees[3]=new Empolyee("Neha mam",20000 );
        empolyees[4]=new Empolyee("Ishita mam",20000 );
        linkedList.addAll(Arrays.asList(empolyees));
        Collections.sort(linkedList);
        for(Empolyee empolyee:linkedList){
            System.out.println(empolyee);

        }



    }
}
