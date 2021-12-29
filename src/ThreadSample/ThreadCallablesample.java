package ThreadSample;

import java.util.concurrent.*;

public class ThreadCallablesample  {

    public static void main(String args[]) {
        ExecutorService ser = Executors.newSingleThreadExecutor();
        ser.execute(new SampleRunnable());//only for runnables
        ser.submit(new SampleCallable());//both runnable and callable
        ser.submit(new SampleRunnable());//both runnable and callable
        ser.shutdown();//ony then program will exit for executor service.

    }


}

class SampleRunnable implements  Runnable{
    @Override
    public void run() {
        System.out.println("this is interface runnable..");
    }
}


class SampleCallable implements  Callable<String>{

    @Override
    public String call() throws Exception {
        System.out.println("this is from callable sysout");
        return "this is from callable interface";
    }
}