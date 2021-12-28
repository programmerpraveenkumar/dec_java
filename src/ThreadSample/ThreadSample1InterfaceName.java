package ThreadSample;
//thread creation with thread class
public class ThreadSample1InterfaceName implements Runnable {


    public static void main(String args[]) {
        ThreadSample1InterfaceName th1 = new ThreadSample1InterfaceName();
        Thread obj = new Thread(th1,"int2-1");;
        obj.start();

    }

    @Override
    public void run() {

        System.out.println("this is thread interface programming.."+Thread.currentThread().getName());
    }
}
