package az.stepit.threads.example2;

public class QuickDemo {
    public static void main(String[] args) {


        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("Hello " + i);
                }
            }
        }).start();

        new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("Hello " + i);
            }
        }).start();

    }
}
