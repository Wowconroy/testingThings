package ua.com.collections;

import java.util.*;

public class SomeTestingsOfCollect {
    public static void main(String[] args) {
        Collection <A> col;

//        col = new ArrayList<>();
        col = new HashSet<>();
//        col = new TreeSet<>();
        col.add(new A());
        System.out.println("~~~");
        col.add(new A());
        System.out.println("~~~");
        col.add(new A());
        System.out.println("~~~");

        A a = new A();
        System.out.println(col.contains(a));
    }
    static class A implements Comparable<A>{
        @Override
        public boolean equals(Object obj) {
            System.out.println("A#equals");
            return super.equals(obj);
        }

        @Override
        public int hashCode() {
            System.out.println("A#hashCode");
            return super.hashCode();
 //           return 0;
        }

        @Override
        public int compareTo(A o) {
            System.out.println("A#compareTo");
            return 1;
        }
    }

}
