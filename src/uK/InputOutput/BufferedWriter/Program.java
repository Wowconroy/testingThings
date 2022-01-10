package uK.InputOutput.BufferedWriter;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Program {
    public static void main(String[] args) {
        BufferedWriter bufferedWriter = null;
        String str = "Hello Frosia";
        try {
            bufferedWriter = new BufferedWriter(new FileWriter("FROSIA.txt", true));
            bufferedWriter.write(str);
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                bufferedWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
