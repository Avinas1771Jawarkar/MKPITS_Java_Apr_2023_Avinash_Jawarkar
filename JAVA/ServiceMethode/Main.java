package ServiceMethode;

import java.io.IOException;
import java.util.HashMap;

    public class Main{
        public static void main(String[] args) throws IOException {
            HashMap<Integer, String> sortedMap = new HashMap<>();
            sortedMap.put(11, "Avinash");
            sortedMap.put(14, "Rudhra");
            sortedMap.put(12, "");
            sortedMap.put(10, "Rahul");
            sortedMap.put(44, "Devansha");

            ServiceMethode serviceMethods = new ServiceMethode();
            serviceMethods.writeObjectToFile(sortedMap);
            serviceMethods.readObjectFromFile();
        }
    }



