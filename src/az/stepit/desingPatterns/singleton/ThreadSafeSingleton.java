package az.stepit.desingPatterns.singleton;

import java.util.Objects;

public class ThreadSafeSingleton {

    private static ThreadSafeSingleton instance;

    private ThreadSafeSingleton(){}

    public synchronized static ThreadSafeSingleton getInstance(){
        if(Objects.isNull(instance)){
            instance = new ThreadSafeSingleton();
        }
        return instance;
    }

}
