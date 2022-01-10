package TestingPackage;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class Test {
    public static void main(String[] args) {
        TreeSet set = new TreeSet(new TestA());
        set.add("1");
        set.add("2");
        set.add("3");
        Iterator it = set.iterator();
        while (it.hasNext()){
            System.out.print(it.next());
        }
    }
}
class TestA implements Comparator{
    @Override
    public int compare(Object a, Object b) {
        return -((String)a).compareTo((String)b);
    }
}
