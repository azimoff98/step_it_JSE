package az.stepit.lambdas.greeter;

public class GreeterAnonymous {
    public static void main(String[] args) {
        Greeter greeter = new Greeter() {
            @Override
            public void greet() {
                System.out.println("Hello World");
            }
        };

        greeter.greet();
    }
}
