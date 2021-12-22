package ExceptionSamples;

/*
throw->will throw the error in the try block to catch.
 */
public class ThrowException {
    public static void main(String args[]){
        int childAge = 15;
        try{
            if(childAge < 10){
                System.out.println("ok..this is child");
            }else{
                throw new Exception("this is not child");//throwing the error
            }
        }catch(Exception e) {
            System.out.println("Error " + e);
        }
    }
}

