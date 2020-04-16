package az.stepit.desingPatterns.startegy;

public class CreditCardStrategy implements PaymentStrategy{

    private String cardNumber;
    private String expDate;
    private int cvv;

    public CreditCardStrategy(String cardNumber, String expDate, int cvv) {
        this.cardNumber = cardNumber;
        this.expDate = expDate;
        this.cvv = cvv;
    }


    @Override
    public void pay(double amount) {
        System.out.println(amount + " paid with credit card");
    }
}
