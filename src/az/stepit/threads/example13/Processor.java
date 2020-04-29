package az.stepit.threads.example13;

import java.util.LinkedList;
import java.util.Random;

public class Processor {

    private Random random = new Random();

    //FIFO
    private LinkedList<Integer> list = new LinkedList<>();
    private static final int LIMIT = 10;
    private Object lock = new Object();

    public void produce(){
        int value = 0;
        while (true){
            synchronized (lock){
                while (list.size() == LIMIT){
                    try {
                        //producer waits
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                list.add(value++);
                lock.notify();
            }
            try {
                Thread.sleep(generateDuration());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

    }

    public void consume(){
        while (true){
            synchronized (lock) {
                while (list.size() == 0){
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                int value = list.removeFirst();
                System.out.println("consume value is: " + value + " list's size is: " + list.size());
                lock.notify();

            }
            try {
                Thread.sleep(generateDuration());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private int generateDuration(){
        return random.nextInt(500);
    }
}
