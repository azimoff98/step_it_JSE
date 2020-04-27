package az.stepit.threads.example7;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Worker {

    private Object lock1 = new Object();
    private Object lock2 = new Object();

    private Random random = new Random();

    private List<Integer> list1 = new ArrayList<>();
    private List<Integer> list2 = new ArrayList<>();



    public void startPoint(){
        System.out.println("Starting...");

        long star = System.currentTimeMillis();
        Thread t1 = new Thread(this::process);
        Thread t2 = new Thread(this::process);
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        long end = System.currentTimeMillis();

        System.out.println("List1 size: " + list1.size() + ", List2: " + list2.size());
        System.out.println("Taken time: " + (end - star));
    }

    private void process(){
        for (int i = 0; i < 1000 ; i++) {
            stageOne();
            stageTwo();
        }
    }


    //synchronized methods and and blocks with this Object
    //lock whole object.
    private void stageOne(){
        synchronized (lock1) {
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            list1.add(random.nextInt(100));
        }
    }

    private void stageTwo(){
        synchronized (lock2) {
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            list2.add(random.nextInt(100));
        }
    }

}
