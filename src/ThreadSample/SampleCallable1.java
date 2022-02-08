package ThreadSample;


import java.util.concurrent.Callable;

class SampleCallable1 implements Callable<String> {

    @Override
    public String call() throws Exception {
        Thread.sleep(1000);
        ///System.out.println("this is from callable sysout");
        return "return from thread callable";
    }
}