package KK.Streams.JoeJames1.Eight;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class LessonsEight {

    public static void main(String[] args) {
        Stream<String> tokenStream = Arrays.asList("A", "B", "C", "D").stream();
        String [] arrString = tokenStream.toArray(String[]::new);
        System.out.println(Arrays.toString(arrString));

        IntStream infiniteNumberStream = IntStream.iterate(1, i -> i+1);
        int[] intArray = infiniteNumberStream.limit(10)
                .toArray();
        System.out.println(Arrays.toString(intArray));
    }
}
