package TestingPackage.epam;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MultiThreadingAndCo {
    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 3; i++) {
                    System.out.println(Thread.currentThread().getName());
                    try {
                        Thread.sleep(333);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
//        Thread thread = new Thread(runnable);
//        thread.start();
        ExecutorService es = Executors.newFixedThreadPool(3);
        es.execute(runnable);
        es.execute(runnable);
        es.execute(runnable);
        es.shutdown();
    }

}
