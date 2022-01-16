package KK.Streams.JoeJames1.Eight;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class LessonsEight {
    public static void main(String[] args) {
        Stream.of("10", "11", "33")
                .map(x -> Integer.parseInt(x, 16))
                .forEach(System.out::println);
    }
}
