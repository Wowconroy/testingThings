package KK.Streams.JoeJames1;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Program {
    public static void main(String[] args) {
        IntStream
                .range(1, 10)
                .skip(5)
                .forEach(System.out::print);
        System.out.println();

System.out.println("~~~~");

        System.out.println(
                IntStream
                .range(1,5)
                .sum()
        );

System.out.println("~~~~");

        Stream.of("Oleksii", "Mariia", "Frosiia")
                .sorted()
                .findFirst()
                .ifPresent(System.out::println);

System.out.println("~~~~");

        String [] names = {"Toyota", "Mercedes-Benz", "Mazda", "BMW", "Subaru"};
        Arrays.stream(names) // the same as Stream.of(names)
            .filter(x -> x.startsWith("M"))
                .sorted()
                .forEach(System.out::println);

System.out.println("~~~~");

        Arrays.stream(new int[]{1, 2, 3, 4, 8, 10, 22, 165})
                .map(x -> x * x)
                    .average()
                        .ifPresent(System.out::println);

System.out.println("~~~~");

        List<String> people = Arrays.asList("John", "Anny", "Mary", "David", "Alex", "Yolanda", "Frank", "Joe", "Ashot");
        people.stream()
                .map(String::toUpperCase)
                .filter(x -> x.startsWith("A"))
                .sorted()
                .forEach(System.out::println);

System.out.println("~~~~");

        Stream <Integer> numbers = Stream
                .generate(() -> (new Random()).nextInt(100));

        List<Integer> list =  numbers.limit(10).collect(Collectors.toList());
        System.out.println(list);

    }
}
