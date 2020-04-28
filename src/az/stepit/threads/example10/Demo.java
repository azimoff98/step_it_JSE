package az.stepit.threads.example10;

import java.util.concurrent.*;

//CountDownLatch = CyclicBarrier = Phaser
//same functionality
public class Demo {
    public static void main(String[] args) {

        CountDownLatch latch = new CountDownLatch(3);
        ExecutorService executor = Executors.newFixedThreadPool(3);

        for (int i = 0; i < 3; i++) {
            executor.submit(new Processor(latch));
        }

        try {
            latch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            executor.shutdown();
        }

        System.out.println("Completed.");
    }
}

class Processor implements Runnable{

    private CountDownLatch countDownLatch;

    public Processor(CountDownLatch countDownLatch) {
        this.countDownLatch = countDownLatch;
    }

    @Override
    public void run() {
        System.out.println("Started: " + Thread.currentThread().getName());
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Completed: " + Thread.currentThread().getName());
        countDownLatch.countDown();
    }
}