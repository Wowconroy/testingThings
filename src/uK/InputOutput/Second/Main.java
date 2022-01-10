package uK.InputOutput.Second;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        String str = "New string!";
        String str2 = "Some new sort of files!";
        InputStreamReader isr = null;
        FileInputStream fis = null;

        byte [] buffer = str2.getBytes();
        FileOutputStream fos = null;
        File file = new File("NewString.txt");
        try {
            fos = new FileOutputStream(file, true);
            fos.write(buffer);
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


        int b = 0;

        try {
            fis = new FileInputStream("NewString.txt");
            isr = new InputStreamReader(fis, "CP1251");

            while ((b = isr.read())!=-1) {
                System.out.print((char)b);
            }
        }  catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                isr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }
}
