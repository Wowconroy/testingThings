package ua.com.lambda;

import java.util.*;
import java.util.stream.Collectors;

public class FindingMaxValueByOptional {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("ab");
        list.add("abcdddsf222");
        list.add("12");
        list.add("1234ddddddddddddddd");
        list.add("abc");
        list.add("12");
        list.add("1234");
        list.add("abc");
        Optional<Integer> o = list.stream()
                .map(String::length)
                .collect(Collectors.maxBy(Comparator.naturalOrder()));
        //or -> .max(Comparator.naturalOrder());
        o.ifPresent(System.out::println);


    }
}
