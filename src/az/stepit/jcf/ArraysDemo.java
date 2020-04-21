package az.stepit.jcf;

import java.util.Arrays;

public class ArraysDemo {
    public static void main(String[] args) {

        int[] arr = {4,5,9,3,1,4,6,3,4,5};

        long start = System.nanoTime();
        Arrays.sort(arr);
        long end = System.nanoTime();

        long startParallel = System.nanoTime();
        Arrays.parallelSort(arr);
        long endParallel = System.nanoTime();

        System.out.println("sort: " + (end - start));
        System.out.println("parallel sort: " + (endParallel - startParallel));


    }
}
