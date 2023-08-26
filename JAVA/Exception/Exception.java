package Exception;

import javax.naming.PartialResultException;

public class Exception {


    public static void main(String[] args){
      int ch[]={ 12,32,43,54,65};

          try {
              for (int number = 0; number < 6; number++) {
                  System.out.println(ch[3]);

              }
          }
          catch (NullPointerException e){
              System.out.println("exception bound");


          }
    }
}
