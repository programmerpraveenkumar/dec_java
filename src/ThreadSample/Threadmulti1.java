package ThreadSample;

public class Threadmulti1 implements  Runnable {


    @Override
    public void run() {
        for(int i = 0;i<10;i++){
            System.out.println(i);
            //thread to sleep
            try {
                Thread.sleep(2000);//1000Ms =>1s
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String args[]) {
        Threadmulti1 thc1 = new Threadmulti1();

        Thread th1 = new Thread(thc1);
        th1.start();
        th1.interrupt();//only sleepign thread can trigger or Interrupt
        //th1.start(); -- illegal thread state exception

        Thread th2 = new Thread(thc1);
        th2.start();

        //new Thread(new Threadmulti1()).start();

      //  new Thread(new Threadmulti1());

    }
}
