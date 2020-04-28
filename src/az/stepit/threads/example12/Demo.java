package az.stepit.threads.example12;

public class Demo {
    public static void main(String[] args) {
        Worker1 worker1 = new Worker1();
        Worker2 worker2 = new Worker2();
        worker1.start();
        worker2.start();
    }

    private static Object lock1 = new Object();
    private static Object lock2 = new Object();


    private static class Worker1 extends Thread{
        @Override
        public void run() {
            synchronized (lock1){
                System.out.println("Worker-1: holding lock1 ");
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Worker-1: waiting for lock2 ");

                synchronized (lock2){
                    System.out.println("Worker-1: holding lock1 and lock2");
                }
            }
        }
    }

    private static class Worker2 extends Thread{
        @Override
        public void run() {
            synchronized (lock2){
                System.out.println("Worker-2: holding lock2 ");
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Worker-2: waiting for lock1 ");

                synchronized (lock1){
                    System.out.println("Worker-2: holding lock1 and lock2");
                }
            }
        }
    }

}
