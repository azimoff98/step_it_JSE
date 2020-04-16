package az.stepit.desingPatterns.builder;

public class Demo {
    public static void main(String[] args) {
        Subscription subscription = new Subscription.Builder()
                .withId(123)
                .withName("Test 1")
                .withSurname("Test 2")
                .build();


    }
}
