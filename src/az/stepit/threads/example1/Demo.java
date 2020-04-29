package az.stepit.threads.example1;

/**
 * ForeGround and BackGround threads in java.
 *
 * There are two types of threads in java.
 * First in User threads and second is Daemon threads.
 * Users threads act as ForeGround threads and Daemon threads
 * act as BackGround threads. In java all threads are
 * ForeGround by default.
 * If we want to mark Thread as daemon
 * we should thread.setDaemon(true);
 *
 */
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








