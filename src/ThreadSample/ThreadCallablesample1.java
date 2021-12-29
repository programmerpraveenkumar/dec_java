package ThreadSample;

import java.util.concurrent.*;

public class ThreadCallablesample1 {

    public static void main(String args[]) throws ExecutionException, InterruptedException {
        ExecutorService ser = Executors.newSingleThreadExecutor();
    try{
        //below thread will return the string and store in future obj.
        Future<String> thRes = ser.submit(new SampleCallable1());//both runnable and callable
        System.out.println(thRes.get());//hold the program execution till it recvs the result from the callable interface
        System.out.println("this is last line");
    }catch(Exception e){
        e.printStackTrace();
    }
    ser.shutdown();//ony then program will exit for executor service.

    }
}


