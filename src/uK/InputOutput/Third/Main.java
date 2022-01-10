package uK.InputOutput.Third;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class Main {
    public static void main(String[] args) {
        String str = "Work with Print Stream & File Output Stream..";
        String reWr = "This string will rewrite previous..";
        try {
            FileOutputStream fos = new FileOutputStream("NewString.txt");
            PrintStream printStream = new PrintStream(fos);
            printStream.println(reWr);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
