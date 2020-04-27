package az.stepit.threads.example4;

public class Demo {
    public static void main(String[] args) {
        Thread thread = new Thread();
        thread.setPriority(10);
        thread.setName("t-1");
        thread.notify();

        try {
            thread.wait();
            Thread.sleep(1000);
            Thread.currentThread();
            Thread.yield();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
}
