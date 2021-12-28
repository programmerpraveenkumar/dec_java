package ThreadSample;

public class ThreadmultiClass extends  Thread {
    public ThreadmultiClass(){

    }
    public  ThreadmultiClass(String name){
        super(name);//call the parent class constructor for naming the thread.
    }


    @Override
    public void run() {
        for(int i = 0;i<10;i++){

            //thread to sleep
            try {
                System.out.println(i+" "+Thread.currentThread().getName());
                Thread.sleep(2000);//1000Ms =>1s
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String args[]) {
        System.out.println(Thread.currentThread().getName());//prints the main thread
        ThreadmultiClass thc1 = new ThreadmultiClass("th-1");
       // thc1.setName("th-update-1");;
        thc1.start();
        ThreadmultiClass thc2 = new ThreadmultiClass("th-2");
        thc2.start();



    }
}
