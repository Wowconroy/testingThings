package ua.com.lambda;

import java.util.*;
import java.util.stream.Collectors;

public class ListMapLambda {

    public static void main(String[] args){
        List <String> list = new ArrayList<>();
        list.add("a");
        list.add("abcd");
        list.add("12");
        list.add("1234");
        list.add("abc");

        Map<Integer, List<String>>map = list.stream()
                .collect(Collectors.groupingBy(String::length));
        map.forEach((K,V)-> System.out.println(K +" -> " + V));

        List<String> list2 = map.values().stream()
                .flatMap(List::stream)
                .collect(Collectors.toList());
        list2.forEach(System.out::println);

        System.out.println(list2);

    }


}
