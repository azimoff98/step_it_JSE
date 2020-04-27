package az.stepit.threads.example2;

public class LambdaDemo {
    public static void main(String[] args) {
        Runnable runner = () -> {
            for (int i = 0; i <10 ; i++) {
                System.out.println("Hello " + i);
            }
        };
        Thread thread = new Thread(runner);
        thread.start();
    }
}
