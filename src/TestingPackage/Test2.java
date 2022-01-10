package TestingPackage;

import java.util.ArrayList;

public class Test2 {
    public static void main(String[] args) {
        ArrayList<Object> list = new ArrayList<>();
        //can't use -> <? extends Test2A> only through <..super..> or <Object> or leave it
        list.add(new Test2B());
        list.add(new Test2C());

        Test2C c = (Test2C)list.get(1);
        System.out.println(c);
    }
}

class Test2A{}
class Test2B extends Test2A{}
class Test2C extends Test2A{}

