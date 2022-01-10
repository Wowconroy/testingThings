package uK.InputOutput.First1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        FileInputStream fis = null;
        InputStreamReader isr = null;
        int b = 0;
        try {
            fis = new FileInputStream("C:/data/temp/DecemberOf23/test.txt");
            isr = new InputStreamReader(fis, "CP1251");
            while ((b=isr.read())!=-1){
                System.out.print((char)b);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (isr != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
