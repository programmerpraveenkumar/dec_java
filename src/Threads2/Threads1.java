package Threads2;

public class Threads1 extends Thread {

    @Override
    public void run() {
        System.out.println("this is thread");
    }

    public static void main(String args[]) {
        Threads1 obj = new Threads1();
        obj.start();
       // obj.run();
    }
}
