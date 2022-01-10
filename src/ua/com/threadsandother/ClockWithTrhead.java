package ua.com.threadsandother;

class ClockWithThread extends Thread{
    public static void main(String[] args) throws InterruptedException {
        ClockWithThread clock = new ClockWithThread();
        for (int i = 0; i <10; i++) {
            System.out.println("Main number -> " + i);
            Thread.sleep(333);
        }
        clock.start();

        Thread.sleep(10000);
        clock.interrupt();
    }

    @Override
    public void run() {
        Thread current = Thread.currentThread();

        while (!current.isInterrupted()){
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
