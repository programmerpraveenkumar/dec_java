package ThreadSample;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorinvokeAll {
    public static void main(String args[]) {
        //ExecutorService ser = Executors.newSingleThreadExecutor();//execute threads one by one
        //ExecutorService ser = Executors.newFixedThreadPool(5);//execute 5 threads.
        ExecutorService ser = Executors.newCachedThreadPool();//managed by JDK
        try{
            //below thread will return the string and store in future obj.
            List<SampleCallable2> obj = new ArrayList<SampleCallable2>();
            obj.add(new SampleCallable2("5 message"));
            obj.add(new SampleCallable2("first message"));
            obj.add(new SampleCallable2("this is 2nd list"));
            obj.add(new SampleCallable2("3 message"));
            obj.add(new SampleCallable2("4 message"));

            //ser.invokeAll(obj);//all the thread in the list will get executed.
            ser.invokeAny(obj);//execute any thread from the collection.

        }catch(Exception e){
            e.printStackTrace();
        }
        ser.shutdown();//ony then program will exit for executor service.
    }
}


