package ThreadSample;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorinvokeAll3 {
    public static void main(String args[]) {
        ExecutorService ser = Executors.newSingleThreadExecutor();
        try{
            //below thread will return the string and store in future obj.
            List<Callable<String>> obj = new ArrayList<Callable<String>>();

            obj.add(new Callable<String>() {
                @Override
                public String call() throws Exception {
                    System.out.println("this is 1st callable");
                        return "first string";
                }
            });

            obj.add(new Callable<String>() {
                @Override
                public String call() throws Exception {
                    System.out.println("this is 2nd callable");
                    return "2nd string";
                }
            });

            obj.add(new Callable<String>() {
                @Override
                public String call() throws Exception {
                    System.out.println("this is callable");
                    return "3nd string";
                }
            });

            ser.invokeAll(obj);

        }catch(Exception e){
            e.printStackTrace();
        }
        ser.shutdown();//ony then program will exit for executor service.
    }
}


