import java.io.*;

public class ReadFile {
    public static void main(String[] args) throws IOException {
        InputStreamReader inputStreamReader=new InputStreamReader(System.in);
        BufferedReader bufferedReader=new BufferedReader(inputStreamReader);
        String file= null;

        try {
            System.out.println("enter a file name");
            file= bufferedReader.readLine();
            BufferedReader br =new BufferedReader(new FileReader("avinash.txt"));

           while (file!=null){
               System.out.println(file);
               file= br.readLine();
           }
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }

    }
}
