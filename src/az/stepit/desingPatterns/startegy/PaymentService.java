package az.stepit.desingPatterns.startegy;

public class PaymentService {


    private double calculateTotal(Basket basket){
        double totalSum = 0;
        for (Product product : basket.getProductList()) {
            totalSum += product.getPrice();
        }
        return totalSum;
    }

    public void pay(PaymentStrategy strategy, Basket basket){
        double amountToPay = calculateTotal(basket);
        strategy.pay(amountToPay);
    }

}
