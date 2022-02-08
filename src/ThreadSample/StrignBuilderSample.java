package ThreadSample;

public class StrignBuilderSample extends Thread {
    //StringBuffer sb = new StringBuffer("Test3");
    StringBuilder sb = new StringBuilder("test");
    @Override
    public void run() {
        for(int i= 0;i<10;i++){
            appendValue("val "+i);
        }
    }

    public  void appendValue(String val){
        sb.append(val);
        System.out.println(sb);
    }
    public static void main(String args[]) {
        StrignBuilderSample sh = new StrignBuilderSample();
        sh.start();
        StrignBuilderSample sh2 = new StrignBuilderSample();
        sh2.start();
    }
}
