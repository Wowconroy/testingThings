package KK.Streams.JoeJames1.Nine;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Work {
    public static void main(String[] args) {
        int product = IntStream.range(0, 10)
                .filter(x -> x++ % 4 == 0)
                .reduce((acc, x) -> acc * x)
                .getAsInt();

        System.out.println(product);

        int max = Stream.of(20, 11, 45, 78, 13)
                .max(Integer::compare).get();
        System.out.println(max);

    }
}
