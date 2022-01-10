package KK.Streams.JoeJames1.Four;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Program {
    public static void main(String[] args) {
        List<String> memberNames = new ArrayList<>();
        memberNames.add("Amitabh");
        memberNames.add("Shekhar");
        memberNames.add("Aman");
        memberNames.add("Rahul");
        memberNames.add("Shahrukh");
        memberNames.add("Salman");
        memberNames.add("Yana");
        memberNames.add("Lokesh");

        Optional<String> reduced = memberNames.stream()
                .reduce((s1,s2) -> s1 + "<-->" + s2);

        reduced.ifPresent(System.out::println);

        List<Integer> members = Arrays.asList(1,2, 3, 4);
        members.stream().reduce((x, y) -> x*y).ifPresent(System.out::println);

    }
}
