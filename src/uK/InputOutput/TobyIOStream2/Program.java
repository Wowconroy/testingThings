package uK.InputOutput.TobyIOStream2;

import java.io.*;

public class Program {
    public static void main(String[] args) {
        BufferedReader br = null;
        String line = null;
//        int b = 0;

        try {
            br = new BufferedReader(new FileReader("FROSIA.txt"));
            while((line=br.readLine()) != null){
                System.out.println(line);
            }
            // OR BELLOW
//            while ((b=br.read())!=-1){
//                System.out.print((char) b);
//            }

        }catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
