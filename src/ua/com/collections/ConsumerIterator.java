package ua.com.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerIterator {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        //or = Arrays.asList(1, 2, 3, 4); --> but it's has immutable size
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        Iterator<Integer> it = list.iterator();
        System.out.println(it.next());
        System.out.println(it.next());
        System.out.println(it.next());
        System.out.println("~~~");
// 1       it.forEachRemaining(new Consumer<Integer>() {
//            @Override
//            public void accept(Integer integer) {
//                System.out.println(integer);
//            }
//        });
        System.out.println("~~~");
// 2        it.forEachRemaining((Integer integer)-> System.out.println(integer));

        it.forEachRemaining(System.out::println); //3
    }
}
