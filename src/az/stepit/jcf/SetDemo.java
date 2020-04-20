package az.stepit.jcf;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {
    public static void main(String[] args) {

        Set<String> hashSet = new HashSet<>();
        hashSet.add("a");
        hashSet.add("c");
        hashSet.add("b");
        hashSet.add("b");
        System.out.println("HashSet: " + hashSet);

        Set<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("a");
        linkedHashSet.add("c");
        linkedHashSet.add("b");
        System.out.println("LinkedHashSet: " + linkedHashSet);

        Set<String> treeSet = new TreeSet<>();
        treeSet.add("a");
        treeSet.add("g");
        treeSet.add("b");
        treeSet.add("f");
        System.out.println("TreeSet " + treeSet);

    }
}
