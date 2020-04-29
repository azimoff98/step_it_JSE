package az.stepit.threads.example15;


import java.util.Random;
import java.util.concurrent.*;

public class CallableDemo {
    public static void main(String[] args) {

        Random random = new Random();

        ExecutorService executor = Executors.newCachedThreadPool();

        Callable<String> callable = () -> {
            System.out.println("Starting...");

            int duration = random.nextInt(5000);

            try {
                Thread.sleep(duration);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Finished.");
            return "Thread slept for ".concat(String.valueOf(duration)).concat(" millis");

        };

        Runnable runnable = () -> {
            System.out.println("Starting...");

            int duration = random.nextInt(5000);

            try {
                Thread.sleep(duration);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Finished.");
        };

        for (int i = 0; i < 5 ; i++) {
           Future<?> future = executor.submit(() -> {
                System.out.println("Starting...");

                int duration = random.nextInt(5000);

                try {
                    Thread.sleep(duration);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Finished.");
                return "Thread slept for ".concat(String.valueOf(duration)).concat(" millis");
            });

            try {
                System.out.println(future.get());
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
        }

        executor.shutdown();

    }
}
