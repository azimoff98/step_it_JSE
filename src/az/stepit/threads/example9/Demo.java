package az.stepit.threads.example9;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Demo {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            System.out.println("Starting: " + 1);
            System.out.println("Thread 1 does some stuff");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Completed: " + 1);
        });

        Thread t2 = new Thread(() -> {
            System.out.println("Starting: " + 2);
            System.out.println("Thread 2 does some stuff");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Completed: " + 2);
        });
        Thread t3 = new Thread(() -> {
            System.out.println("Starting: " + 3);
            System.out.println("Thread 3 does some stuff");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Completed: " + 3);
        });

        ExecutorService executor = Executors.newFixedThreadPool(1);

        executor.submit(t1);
        executor.submit(t2);
        executor.submit(t3);

        executor.shutdown();

        try {
            executor.awaitTermination(1, TimeUnit.DAYS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("All completed");
    }
}
