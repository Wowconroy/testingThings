package ua.com.threadsandother;

public class Main2 {
    public static void main(String[] args) throws Exception {
        Resource resource = new Resource();
        resource.i = 5;
        MyThreads mt = new MyThreads();
        MyThreads mt2 = new MyThreads();
        mt.setResource(resource);
        mt2.setResource(resource);
        mt.start();
        mt2.start();
        mt.join();
        mt2.join();
        System.out.println(resource.i);
    }
}

class MyThreads extends Thread {
    Resource resource;

    public void setResource(Resource resource) {
        this.resource = resource;
    }

    @Override
    public void run() {
        resource.changeI();
    }
}

class Resource {
    int i;

    public void changeI() {
        int i = this.i;
        i++;
        this.i = i;
        System.out.println(i);
    }
}