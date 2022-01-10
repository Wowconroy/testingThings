package KK.Streams.JoeJames1.One;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Program {
    public static void main(String[] args) throws IOException {
        Stream<String> list  = Files.lines(Paths.get("example.txt"));
        int rowCount = (int) list
                .map(x -> x.split(","))
                .filter(x -> x.length == 3)
                .count();
        System.out.println(rowCount + " rows.");
        list.close();


    }
}
