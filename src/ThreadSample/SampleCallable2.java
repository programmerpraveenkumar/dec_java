package ThreadSample;


import java.util.concurrent.Callable;

class SampleCallable2 implements Callable<String> {
    private String message;
    public SampleCallable2(){
            this.message  = "default messgae";
    }
    public SampleCallable2(String message){
            this.message = message;
    }
    @Override
    public String call() throws Exception {
        System.out.println(this.message);
        Thread.sleep(1000);
        return "return from "+this.message;
    }
}