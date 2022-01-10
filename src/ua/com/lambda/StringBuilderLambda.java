package ua.com.lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StringBuilderLambda {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("ab");
        list.add("abcdddsf");
        list.add("12");
        list.add("1234");
        list.add("abc");
        list.add("12");
        list.add("1234");
        list.add("abc");
        Object o = list.parallelStream()
                .map(String::length)
                .collect(
                        StringBuilder::new,
                        StringBuilder::append,
                        (a, s)->{
                            System.out.println(Thread.currentThread());
                            a.append(s);
                        });
        System.out.println(o);


    }
}
