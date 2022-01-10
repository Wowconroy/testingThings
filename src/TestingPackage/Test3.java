package TestingPackage;

import java.util.LinkedList;
import java.util.List;

public class Test3 {
    public static void main(String[] args) {
        List<Test3A> list1 = new LinkedList<>();
        List list2 = list1;
        List<Test3C> list3 = list2;

        list1.add(new Test3A());
        list2.add(new Test3B());
        list3.add(new Test3C());

        System.out.println(list1);
        System.out.println(list2);
        System.out.println(list3);

    }
}

class Test3A{}
class Test3B{}
class Test3C{}