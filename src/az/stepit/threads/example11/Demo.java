package az.stepit.threads.example11;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Demo {
    private static BlockingQueue<Integer> queue = new ArrayBlockingQueue<Integer>(10);

    public static void main(String[] args) {
        new Thread(Demo::produce).start();
        new Thread(Demo::consume).start();
    }

        private static void produce(){
            Scanner scanner = new Scanner(System.in);
            boolean okay = true;
            while (okay){
                System.out.println("Enter number to produce or press some character to break");
                try {
                    int produced = scanner.nextInt();
                    queue.put(produced);
                    System.out.println(produced + " produced to queue");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }catch (InputMismatchException e){
                    okay = false;
                    System.out.println("Producer is shutting down");
                }
            }
        }

    private static void consume(){
        boolean okay = true;
        while (okay){
            try {
                Thread.sleep(3000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            if(queue.size() != 0){
                int consumed = queue.poll();
                System.out.println(consumed + " consumed from queue, queue's size is: " + queue.size());
            }
        }
    }
}
