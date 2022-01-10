package ua.com.threadsandother;

public class Main {
    private static int counter;

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Main thread begin!");
        test();

        Thread.sleep(1000);
        System.out.println("Main thread end!");
    }

    public static void test(){
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                counter = 0;
                for (int i = 0; i <5; i++) {
                    counter+=1;
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + ": " + counter);
                }
            }
        };
        Thread t1 = new Thread(runnable);
        Thread t2 = new Thread(runnable);

        t1.start();
        try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t2.start();
        try {
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
