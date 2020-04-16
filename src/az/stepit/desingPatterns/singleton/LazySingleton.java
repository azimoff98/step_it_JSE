package az.stepit.desingPatterns.singleton;

import java.util.Objects;

public class LazySingleton {

    private static volatile LazySingleton instance;

    private LazySingleton(){}

    public static LazySingleton getInstance(){
        if(Objects.isNull(instance)){
            instance = new LazySingleton();
        }
        return instance;
    }
}
