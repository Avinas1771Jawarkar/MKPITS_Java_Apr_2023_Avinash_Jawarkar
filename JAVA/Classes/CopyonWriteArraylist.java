import java.util.concurrent.CopyOnWriteArrayList;

public class CopyonWriteArraylist {
    public static void main(String[] args) {


        CopyOnWriteArrayList copyonWriteArraylist=new CopyOnWriteArrayList();
        copyonWriteArraylist.add("Amravti");
        copyonWriteArraylist.add("Akola");
        copyonWriteArraylist.add("Buldana");
        copyonWriteArraylist.add("yavatmal");
        System.out.println(copyonWriteArraylist);

        copyonWriteArraylist.add(2, "Pune");
        System.out.println(copyonWriteArraylist);

        System.out.println(copyonWriteArraylist.addIfAbsent("Amravti"));
        copyonWriteArraylist.indexOf("pune",2);
        System.out.println(copyonWriteArraylist);

        copyonWriteArraylist.toArray();
        System.out.println(copyonWriteArraylist);

        System.out.println(copyonWriteArraylist.toArray());










    }


    }

