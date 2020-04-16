package az.stepit.desingPatterns.factory;

public class Samsung implements Phone {

    @Override
    public void call() {
        System.out.println("i am calling from samsung");
    }
}
