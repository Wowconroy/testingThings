package GoF.FabricalMethod;

import java.lang.reflect.InvocationTargetException;
import java.util.ResourceBundle;

public class Main {
    public static void main(String[] args) {
//        A a = A.getA();
//        a.m1();

//        ResourceBundle rb = ResourceBundle.getBundle("baseName");
        System.setProperty("c.impl.fqn", "GoF.FabricalMethod.CImpl2");
        C c = C.getInstance();
        c.m();
    }
}
//interface A{
//    public static A getA(){
//        return new A() {
//            public void m1() {
//                System.out.println("Method# -> A#m1");
//            }
//
//            public void m2() {
//                System.out.println("Method# -> A#m2");
//            }
//        };
//    }
//    void m1();
//    void m2();
//}

abstract class C{
    C(){
        System.out.println("C()");
    }
    abstract void m();

    public static C getInstance(){
        String fqn = System.getProperty("c.impl.fqn");
        C c = null;
        try {
            c = (C) Class.forName(fqn)
                    .getDeclaredConstructor().
                    newInstance();
        } catch (ReflectiveOperationException ex) {
            throw new IllegalStateException("...", ex);
        }
        return c;
    }
}

class CImpl extends C{

    @Override
    void m() {
        System.out.println("CImpl#m");
    }
}

class CImpl2 extends C{

    @Override
    void m() {
        System.out.println("CImpl2#m");
    }
}
