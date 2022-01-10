package ua.com.threadsandother;

public class Main4 {
    public static void main(String[] args) throws InterruptedException {
        WorkingClass wc = new WorkingClass();
        SleepingClass sc = new SleepingClass();
        wc.start();
        sc.start();
        Thread.sleep(5000);
        System.out.println("Beginning of interruption");
        wc.interrupt();
        sc.interrupt();


        Thread.sleep(333);

        System.out.println("Main thread is closed");
    }
}

class WorkingClass extends Thread{
    int sum;

    @Override
    public  void run() {
        for (int i = 0; i <1_000_000; i++) {
            sum += i;
            try {
                Thread.sleep(333);
            } catch (InterruptedException e) {
                System.out.println("Total summa of iteration: " + sum);
                break;
            }
        }
    }
}

class SleepingClass extends Thread{
    @Override
    public void run() {
        while (!SleepingClass.interrupted()){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Thread was interrupted");
                break;
            }
            System.out.println("Tik-tok");
        }
    }
}
