package az.stepit.threads.example15;

public class RunnableDemo {

    public static Integer result = null;

    public static void main(String[] args) {
        Runner runner = new Runner();
        Thread t1 = new Thread(runner);

        t1.start();
        try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Result is: " + result);
    }


    public static class Runner implements Runnable{
        @Override
        public void run() {
            int a = 10;
            int b = 5;
            result = a+b;
        }
    }
}
