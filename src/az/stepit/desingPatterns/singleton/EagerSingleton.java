package az.stepit.desingPatterns.singleton;

public class EagerSingleton {

    private static volatile EagerSingleton instance = new EagerSingleton();
    private EagerSingleton(){}

    public static EagerSingleton getInstance(){
        return instance;
    }
}