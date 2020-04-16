package az.stepit.desingPatterns.factory;

public class Demo {
    public static void main(String[] args) {

        Phone iphone = PhoneFactory.create(PhoneTypes.IPHONE);
        iphone.call();
        Phone samsung = PhoneFactory.create(PhoneTypes.SAMSUNG);
        samsung.call();

    }
}
