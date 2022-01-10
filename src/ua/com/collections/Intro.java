package ua.com.collections;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Intro {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);


        A a = new A();
        for (Integer element: a){
            System.out.println(element);
        }
    }
}
class A implements Iterable<Integer>{

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            final static int N = 10;
            int index;
            @Override
            public boolean hasNext() {
                return index<N;
            }

            @Override
            public Integer next() {
                return index++;
            }
        };
    }
}
