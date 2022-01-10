package ua.com.collections;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class SortingInBothOrders {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        System.out.println(list);

     //  list.removeIf((integer) -> integer%2 == 0);
        list.sort((x,y)-> -(x-y));
        System.out.println(list);

        list.sort(Integer::compare);
        System.out.println(list);

        list.sort(Comparator.reverseOrder());
        System.out.println(list);

        list.sort(Long::compare);
        System.out.println(list);

        list.sort(null);
        System.out.println(list);


    }

}
