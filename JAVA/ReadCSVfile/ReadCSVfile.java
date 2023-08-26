package ReadCSVfile;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadCSVfile {
    public void readCSVFile() throws IOException {

        BufferedReader bufferedReader=new BufferedReader(new FileReader("csvfile.csv"));
        String str;
        str= bufferedReader.readLine();
     while(str!=null){
         String arr[]=str.split(",");
         System.out.println(arr[0]+"\t"+arr[1]+"\t");
         str=bufferedReader.readLine();
     }

    }
}
