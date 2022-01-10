package TestingPackage.epam2;

public class Main {

    boolean flag;
    synchronized void m(boolean flag){
        this.flag = flag;
        try {
            Thread.sleep(333);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.printf("%s ==> %s%n", this.flag, flag);
    }

    public static void main(String[] args) {
        Main main = new Main();
        new Thread( ()-> {
                while (true) {
                    main.m(true);
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }).start();


        new Thread(){
            @Override
            public void run() {
                while (true) {
                    main.m(false);
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }.start();
    }
}
