package ExceptionSamples;



/*
throw->to throw error
throws->to declare the method as it may return the error
throwable->Parent class for all the exception.


throws->it may return the error from method.
if method is declared with throws,whereever it is being called shoud wrap with try and catch
 */
public class ThrowsException {
    public static void main(String args[]){
       // checkChildAge(15);//method may return erro..so need to wrap with try catch
        try{

            if(checkChildAge(15)){
                System.out.println("ok ..this is child");
            }
        }catch (Exception e){
            e.printStackTrace();
        }

        ThrowsException obj = new ThrowsException();
        try{
            //method may return erro..so need to wrap with try catch
            if(obj.addition(10,15)){
                System.out.println("ok ..");
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static  boolean checkChildAge(int age)throws Exception {
        if(age < 10){
            return true;
        }else{
            System.out.println("else is executed..");
            throw new Exception("this is not child");
        }
    }


    public  boolean addition(int num1,int num2 )throws Exception {
        int res  = num1+num2;
        if(res < 10){
            return true;
        }else{

            throw new Exception("Error number is greater 10");
        }
    }
}

