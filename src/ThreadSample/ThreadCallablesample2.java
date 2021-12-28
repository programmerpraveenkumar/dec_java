package ThreadSample;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ThreadCallablesample2 implements Callable<String> {

    public static void main(String args[]) {
        ThreadCallablesample2 obj = new ThreadCallablesample2();
        //Future<String> objFut = Executors.newCachedThreadPool();
    }


    @Override
    public String call() throws Exception {
        return "sample thread";//return the thread/
    }
}
