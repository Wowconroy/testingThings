package TestingPackage;

public class Test4 extends Thread{
    public static void main(String[] args) {
        try{
            System.out.println("A");
            Thread.currentThread().interrupt();
            System.out.println("B");
            Thread.currentThread().join();
            System.out.println("C");
        }catch (InterruptedException e){
            System.out.println("D");
        }
        System.out.println("E");
    }
}
