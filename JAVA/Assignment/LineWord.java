import java.io.*;

public class LineWord{
    public static void main(String[]args) throws IOException {

        File file =new File("avinash.txt");
        int linecounter=0;
        int wordcounter=0;
        int charcounter=0;
        if(file.exists()){

            BufferedReader bufferedReader=new BufferedReader(new FileReader(file));
            String string=bufferedReader.readLine();

            while (string!= null){
                linecounter++;
                String[]array= string.split(" ");
                wordcounter=wordcounter + array.length;

                for(int number=0; number<array.length;number++){
                    charcounter=charcounter+array[number].length();
                }
                string= bufferedReader.readLine();


            }
            System.out.println("total no.of line "+linecounter);
            System.out.println("total no.of word "+ wordcounter);
            System.out.println("total no, of chars "+charcounter);


        }
    }
    }

