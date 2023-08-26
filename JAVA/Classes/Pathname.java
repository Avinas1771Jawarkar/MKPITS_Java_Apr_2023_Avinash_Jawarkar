
import java.io.File;
public class Pathname {

        public static void main(String[] args) {
            // Create a File object
            File file = new File("avinash.txt");
            if (file.isDirectory())
            {
                System.out.println(file.getAbsolutePath() + " is a directory.\n");
            }
            else
            {
                System.out.println(file.getAbsolutePath() + " is not a directory.\n");
            }
            if (file.isFile())
            {
                System.out.println(file.getAbsolutePath() + " is a file.\n");
            }
            else
            {
                System.out.println(file.getAbsolutePath() + " is not a file.\n");
            }
        }
    }


