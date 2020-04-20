package az.stepit.jcf;

import java.util.ArrayDeque;
import java.util.Queue;

//FIFO
public class QueueDemo {
    public static void main(String[] args) {
        Queue<String> queue = new ArrayDeque<>();
        queue.add("a");
        queue.add("b");
        queue.add("c");
        queue.peek();
        System.out.println("poll " + queue.poll());
        System.out.println("queue after poll " + queue);
    }
}
