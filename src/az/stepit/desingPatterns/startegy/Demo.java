package az.stepit.desingPatterns.startegy;

import java.util.Arrays;
import java.util.List;

public class Demo {

    private static PaymentService paymentService = new PaymentService();

    public static void main(String[] args) {

        List<Product> products = Arrays.asList(
                new Product(123, "aaa", 15.6),
                new Product(456, "bbb", 7.94),
                new Product(741, "ccc", 74.2)
        );

        Basket basket = new Basket(1, products);

        paymentService.pay(new PaypalStrategy("abcd", "1111"), basket);
        paymentService.pay(new CreditCardStrategy("1234", "03/25", 452), basket);

    }
}
