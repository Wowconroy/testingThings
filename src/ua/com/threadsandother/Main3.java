package ua.com.threadsandother;

public class Main3 {
    public static void main(String[] args) throws InterruptedException {
        MyThread mt = new MyThread();
        MyThread mt2 = new MyThread();
        mt.start();
        mt2.start();

        for (int i = 1; i <=10; i++) {
            Thread.sleep(333);
            System.out.println(Thread.currentThread().getName() + ": " + i);
        }
    }
}

class MyThread extends Thread{
    int counter;
    @Override
    public void run() {
        counter = 0;
        for (int i = 0; i < 20; i++) {

            counter+=1;
            System.out.println(Thread.currentThread().getName() + ": " + counter);

            try{
                Thread.sleep(333);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
