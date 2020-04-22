package az.stepit.streams;

import java.util.Collection;

public class CollectionOperations {

    public static void increaseByTen(Integer integer){
        System.out.println("Integer was " + integer);
        integer = integer + 10;
        System.out.println("Integer become: " + integer);
    }

}
