package az.stepit.threads.example3;

public class Demo {
    public static void main(String[] args) {

        Runnable runner1 = () -> {
            for (int i = 0; i < 100; i++) {
                System.out.println("Thread is: " + Thread.currentThread().getName() + " i is: " + i);
            }
        };
        Runnable runner2 = () -> {
            for (int i = 0; i < 100; i++) {
                System.out.println("Thread is: " + Thread.currentThread().getName() + " i is: " + i);
            }
        };
        Runnable runner3 = () -> {
            for (int i = 0; i < 100; i++) {
                System.out.println("Thread is: " + Thread.currentThread().getName() + " i is: " + i);
            }
        };
        Runnable runner4 = () -> {
            for (int i = 0; i < 100; i++) {
                System.out.println("Thread is: " + Thread.currentThread().getName() + " i is: " + i);
            }
        };

        System.out.println("Starting...");

        new Thread(runner1).start();
        new Thread(runner2).start();
        new Thread(runner3).start();
        new Thread(runner4).start();

        System.out.println("Ending...");
    }
}
