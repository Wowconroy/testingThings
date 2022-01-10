package uK.InputOutput.Forth;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        File file = new File("FROSIA.txt");
        FileWriter fw = null;
        String str = "New English lessons --> I'VE BECAME A MASTER!";
        try {
            fw = new FileWriter(file,true);
            fw.write(str);

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                fw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

}
