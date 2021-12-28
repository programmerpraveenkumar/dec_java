package ThreadSample;
//thread creation with thread class
public class ThreadSample1 extends  Thread {

    @Override
    public void run() {
        System.out.println("this is thread programming..");
    }

    public static void main(String args[]) {
        ThreadSample1 obj = new ThreadSample1();
        //obj.start();//thread will create
        obj.run();//program will execute.but thread will not create.
    }
}
