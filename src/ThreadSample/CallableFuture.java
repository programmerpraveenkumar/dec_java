package ThreadSample;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class CallableFuture {
    public static void main(String args[]) {
        ExecutorService ser = Executors.newSingleThreadExecutor();
        try{
            //below thread will return the string and store in future obj.
            Future<String> thRes = ser.submit(new SampleCallable1());//both runnable and callable
            System.out.println(thRes.get(1000,TimeUnit.MILLISECONDS));//

        }catch(Exception e){
            e.printStackTrace();
        }
        System.out.println("this is last line");
        ser.shutdown();//ony then program will exit for executor service.
    }
}
