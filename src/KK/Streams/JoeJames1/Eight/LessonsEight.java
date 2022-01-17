package KK.Streams.JoeJames1.Eight;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
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


        IntStream infiniteNumberStream2 = IntStream.iterate(1, i -> i+1);
        Integer[] integerArray = infiniteNumberStream2.limit(10)
                .boxed()
                .toArray(Integer[]::new);
        System.out.println(Arrays.toString(integerArray));

        IntStream intStream = IntStream.generate(() -> new Random().nextInt(100));
//        int [] arr = intStream.limit(10).toArray();
//        System.out.println(Arrays.toString(arr));
        Integer [] bigAmAr = intStream
                .limit(10).boxed()
                .toArray(Integer[]::new);
        System.out.println(Arrays.toString(bigAmAr));
    }
}
