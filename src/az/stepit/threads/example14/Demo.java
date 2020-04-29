package az.stepit.threads.example14;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Demo {
    public static void main(String[] args){
        Connection connection = Connection.getInstance();
        ExecutorService executor = Executors.newCachedThreadPool();

        for (int i = 0; i < 300; i++) {
            executor.submit(new Thread(connection::connect));
        }

        executor.shutdown();
        try {
            executor.awaitTermination(1, TimeUnit.DAYS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
