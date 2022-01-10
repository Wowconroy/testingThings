package ua.com.lambda;

import java.util.HashMap;
import java.util.Map;

public class MapLambda {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "A");
        map.put(2, "B");
        map.put(3, "C");
        map.entrySet().stream()
                .map(pair -> pair.getKey() + pair.getValue())
                .reduce((s1, s2)->s1+s2)
                .ifPresent(System.out::println);
        ;
    }
}
