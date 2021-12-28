package ThreadSample;
//thread creation with thread class
public class ThreadSample1Interface implements Runnable {


    public static void main(String args[]) {
        ThreadSample1Interface th1 = new ThreadSample1Interface();
        Thread obj = new Thread(th1);
        obj.start();

    }

    @Override
    public void run() {
        System.out.println("this is thread interface programming..");
    }
}
