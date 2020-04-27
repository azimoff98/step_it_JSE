package az.stepit.threads.example6;

public class Demo {

    public static void main(String[] args) throws InterruptedException {

        Resource resource = new Resource();
        resource.setI(10);

        for (int i = 0; i < 20 ; i++) {
            MyThread myThread = new MyThread();
            myThread.setResource(resource);
            myThread.start();
        }

        System.out.println(resource.getI());

    }
}

class MyThread extends Thread{
    Resource resource;

    public void setResource(Resource resource){
        this.resource = resource;
    }

    @Override
    public void run() {
        resource.increment();
    }
}

class Resource {
    private int i = 0;

    public void setI(int i) {
        this.i = i;
    }

    public int getI() {
        return i;
    }

    public void increment(){
        i++;
    }
}
