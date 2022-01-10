package uK.InputOutput.First2;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
    public static void main(String[] args) {
        FileWriter fw = null;
        File file = new File("FROSIA.txt");
        String str = "SomeSomeSome";
        try {
            fw = new FileWriter(file, true);
            fw.write(str);
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (fw != null){
                try {
                    fw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
