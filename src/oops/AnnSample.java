package oops;



interface Sample{
    public void message();
}
public class AnnSample {

    public static  void main(String args[]){
        Sample s = new Sample(){
            @Override
            public void message() {
                System.out.println("sample message");
            }
        };
        s.message();//call the method
    }
}
