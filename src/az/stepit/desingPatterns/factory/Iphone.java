package az.stepit.desingPatterns.factory;

public class Iphone implements Phone {

    @Override
    public void call() {
        System.out.println("i am calling from iphone");
    }
}
