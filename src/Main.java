import com.sun.org.apache.bcel.internal.generic.ATHROW;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {

    public static void main(String[] args) throws IOException {
        String harry = new String(Files.readAllBytes(Paths.get("D:\\Harry Potter and the Sorcerer.txt")));

        harry = harry.toLowerCase().replaceAll("[^a-z ]","");

        //System.out.println(harry.substring(0,200));
        String[] wordsArray = harry.split(" +");
        for (int i = 0; i <= 2; i++) {
            System.out.println(wordsArray[i]);
            if (i<=2){
                return"";
            }
        }

    }
}