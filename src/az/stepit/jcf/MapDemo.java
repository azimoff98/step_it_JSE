package az.stepit.jcf;

import java.util.*;

public class MapDemo {

    public static void main(String[] args) {
        Map<String, Integer> hashMap = new HashMap<>();
        Map<String, Integer> linkedHashMap = new LinkedHashMap<>();
        Map<String, Integer> treeMap = new TreeMap<>();

        hashMap.put("a", 1);
        hashMap.put("a", 2);
        hashMap.put("a", 3);
        hashMap.put("b", 3);
        hashMap.put("c", 3);
        System.out.println(hashMap);
        System.out.println(hashMap.keySet());
        System.out.println(hashMap.values());


        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            Integer integer = entry.getValue() + 10;
            entry.setValue(integer);
        }
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            System.out.println(entry);
        }
    }
}
