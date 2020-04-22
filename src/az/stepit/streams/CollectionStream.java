package az.stepit.streams;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectionStream {
    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();

        map.put("first", "birinci");
        map.put("second", "ikinci");
        map.put("third", "uchuncu");
        map.put("fourth", "dorduncu");

        List<String> subs =  map.values()
                .stream()
                .peek(System.out::println)
                .map(v -> v.substring(1,3))
                .sorted()
                .skip(2)
                .collect(Collectors.toList());

        subs.forEach(System.out::println);
    }
}
