package az.stepit.threads.example1;

public class Demo {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.setName("t1");
//        myThread.start();

        Runner runner = new Runner();
        Thread thread = new Thread(runner);

        thread.start();

    }
}

class Runner implements Runnable{
    @Override
    public void run() {
        System.out.println("Hello from runner " + Thread.currentThread().getName());
    }
}


class MyThread extends Thread{
    @Override
    public void run() {
        System.out.println("Hello from " + Thread.currentThread().getName());
    }
}








