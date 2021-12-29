package ThreadSample;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorinvokeAll2 {
    public static void main(String args[]) {
        ExecutorService ser = Executors.newSingleThreadExecutor();
        try{
            //below thread will return the string and store in future obj.
            List<SampleCallable2> obj = new ArrayList<SampleCallable2>();

            SampleCallable2 s1 = new SampleCallable2("5 message");
            obj.add(s1);

            obj.add(new SampleCallable2("first message"));
            obj.add(new SampleCallable2("this is 2nd list"));
            obj.add(new SampleCallable2("3 message"));
            obj.add(new SampleCallable2("4 message"));
            obj.add(new SampleCallable2());
            
            List<Future<String>> resList = ser.invokeAll(obj);
            for(Future<String> fuRes:resList){
                System.out.println(fuRes.get());
            }


        }catch(Exception e){
            e.printStackTrace();
        }
        ser.shutdown();//ony then program will exit for executor service.
    }
}


