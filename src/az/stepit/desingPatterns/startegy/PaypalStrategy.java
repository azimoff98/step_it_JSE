package az.stepit.desingPatterns.startegy;

public class PaypalStrategy implements PaymentStrategy{

    private String username;
    private String password;

    public PaypalStrategy(String username, String password) {
        this.username = username;
        this.password = password;
    }

    @Override
    public void pay(double amount) {
        System.out.println(amount + " paid with paypal");
    }
}
