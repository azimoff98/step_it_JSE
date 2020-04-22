package az.stepit.jcf;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.*;

public class CollectionsDemo {

    public static void main(String[] args) {
        List<String> strings = Collections.EMPTY_LIST;
        List<String> stringList = Collections.singletonList("string");
        Map<String, String> map = Collections.singletonMap("key", "value");

    }
}
