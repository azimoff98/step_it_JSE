package az.stepit.threads.example8;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Demo {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(3);

        for (int i = 0; i < 10; i++) {
            executor.submit(new Processor(i));
        }
        executor.shutdown();
        System.out.println("All tasks are submitted");

        try {
            executor.awaitTermination(1, TimeUnit.DAYS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("All tasks completed");
    }
}

class Processor implements Runnable{
    private int id;
    public Processor(int id) {
        this.id = id;
    }
    public int getId(){
        return this.id;
    }

    @Override
    public void run() {
        System.out.println("Starting: " + getId());
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Completed: " + getId());
    }
}