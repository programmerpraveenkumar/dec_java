package Threads2;

public class Threads2 implements Runnable {

    @Override
    public void run() {
        System.out.println("this is thread interface");
    }

    public static void main(String args[]) {
        Threads2 obj = new Threads2();

        Thread th = new Thread(obj);//pass the argms of the Thread2
        th.start();
    }
}
