package az.stepit.lambdas.greeter;

public class GreeterDemo {
    public static void main(String[] args) {
        Greeter greeter = new EngGreeterImpl();
        greeter.greet();

        Greeter azGreeter = new AzGreeterImpl();
        azGreeter.greet();
    }
}
