import java.io.BufferedReader;
import java.io.*;
import java.io.IOException;
import java.io.InputStreamReader;

public class LongestWord{
    public static void main(String[] args) {
        InputStreamReader inputStreamReader=new InputStreamReader(System.in);
        BufferedReader bufferedReader=new BufferedReader(inputStreamReader);
        String fileName = null;
        int numberOfLinesInFile=0;

        String longestWord=" ";
//        String longestWord=new String();
        try {
            System.out.println("------------ Enter Your File Name --------");
            fileName=bufferedReader.readLine();
            BufferedReader bufferedReader1=new BufferedReader(new FileReader(fileName));
            while(fileName!=null){
                numberOfLinesInFile++;
                String [] array=fileName.split(" ");

                for(int number=0;number< array.length;number++)
                {
                    if(longestWord.length()< array[number].length()){
                        longestWord=array[number];
                    }
                }
                fileName=bufferedReader1.readLine();

            }
            System.out.println("The Longest word in the file is :- " +longestWord);
        } catch (IOException e) {
            System.out.println(e);
        }
    }





    }





