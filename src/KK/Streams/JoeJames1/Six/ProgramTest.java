package KK.Streams.JoeJames1.Six;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ProgramTest {
    public static void main(String[] args) {
        Stream<Integer> integerStream = Stream
                .iterate(0, n -> n + (new Random().nextInt(10)));
        List<Integer> list = integerStream.limit(10)
                .collect(Collectors.toList());
        System.out.println(list);
    }
}
