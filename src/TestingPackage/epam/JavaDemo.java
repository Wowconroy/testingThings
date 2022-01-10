package TestingPackage.epam;


public class JavaDemo {
    public static void main(String[] args){
        A a = new B();
        a.m();
    }
    }

class A{
    int a = 1;
    int aa = 11;
    void m(){
        System.out.println("A#m");
    }

    void aM(){
        System.out.println("A#aM");
    }
}

class B extends A{
    int a = 2;
    int bb = 22;
    void m(){
        System.out.println("B#m");
    }

    void bM(){
        System.out.println("B#bM");
    }
}

