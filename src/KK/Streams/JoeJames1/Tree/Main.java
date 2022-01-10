package KK.Streams.JoeJames1.Tree;

import java.io.File;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        System.out.println("Begin...");
        String path = "C:/data/temp/DecemberOf23/src/KK/Streams/JoeJames1/xprom";
        printFiles(path, "");

        System.out.println("Done.");
    }

    private static void printFiles(String path, String prefix){
        File [] files = new File(path).listFiles();
        Arrays.sort(files, (File o1, File o2) -> {
                if (o1.isDirectory() && o2.isFile()){
                    return -1;
                } else if (o2.isDirectory() && o1.isFile()){
                    return 1;
                }
                else {
                    return o1.getName().compareTo(o2.getName());
                }
            });

        for (File file : files) {
            if (file.isFile()){
                System.out.println(prefix + file.getName() + " " + file.length());
            }else {
                System.out.println(prefix + "[" + file.getName() + "]" + dirSize(file));
                printFiles(file.getAbsolutePath(), prefix + "   ");
            }
        }
    }

    private static long dirSize(File dir) {
        File [] files = dir.listFiles();
        long size = 0;
        for (int i = 0; i < files.length; i++) {
            if (files[i].isDirectory()){
                size += dirSize(files[i]);
            }else {
                size += files[i].length();
            }
        }
        return size;
    }
}
