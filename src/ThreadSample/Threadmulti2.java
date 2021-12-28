package ThreadSample;

public class Threadmulti2 implements  Runnable {


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
        Threadmulti2 thc1 = new Threadmulti2();

        Thread th1 = new Thread(thc1);
        th1.start();
        try{
            th1.join();//stop the further creation of new threads till its completed.
        }catch (Exception e){

        }
        Thread th2 = new Thread(thc1);
        th2.start();

    }
}
