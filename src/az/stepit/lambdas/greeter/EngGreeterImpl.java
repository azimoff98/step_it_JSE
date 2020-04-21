package az.stepit.lambdas.greeter;

public class EngGreeterImpl implements Greeter {
    @Override
    public void greet() {
        System.out.println("Hello world");
    }
}
