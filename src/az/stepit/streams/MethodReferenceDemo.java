package az.stepit.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class MethodReferenceDemo {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(10);
        list.add(15);

        //first way local lambda
        list.forEach(integer -> {
            System.out.println("Integer was " + integer);
            integer = integer + 10;
            System.out.println("Integer become: " + integer);
        });

        //second way lambda call
        list.forEach(integer -> CollectionOperations.increaseByTen(integer));


        //third way method reference
        list.forEach(CollectionOperations::increaseByTen);

    }
}
