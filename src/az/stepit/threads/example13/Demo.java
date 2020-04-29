package az.stepit.threads.example13;

public class Demo {

    public static void main(String[] args) {
        Processor processor = new Processor();

        new Thread(processor::produce).start();
        new Thread(processor::consume).start();
    }
}
