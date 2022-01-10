package uK.InputOutput.TobyIOStream1;

import java.io.*;

public class Program {
    public static void main(String[] args) {
        File file = new File("FROSIA.txt");

        PrintWriter pw = null;

        try {
            FileWriter fileWriter = new FileWriter(file, true);
            pw = new PrintWriter(fileWriter);

            pw.println("-----ADDED-----");
            for (int i = 0; i < 10 ; i++) {
                pw.println("Line: " + i);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            pw.close();
        }
    }
}
