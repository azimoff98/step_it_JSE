package az.stepit.streams;


import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args) {
        Stream<Integer> integerStream = Stream.of(4,5,2,2,1,12,9,2,2,6);

        List<Integer> list = integerStream.filter(i -> i % 2 == 0).collect(Collectors.toList());

        list.forEach(System.out::println);
    }
}
