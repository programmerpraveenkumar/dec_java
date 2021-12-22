package ExceptionSamples;

/*
Exception management
try{
//error code
}catch(Exception e){
//catch the error
}finally{
}
 */
public class CustomExceptionImpl {
    public static void main(String args[]){
        CustomExceptionImpl obj =new CustomExceptionImpl();
        try{
            obj.checkAge(5);
        }catch (CustomException e){
                e.printStackTrace();
        }


    }
    public void checkAge(int age) throws CustomException{
            if(age >10){
                throw new CustomException("Age is greater than 10");
            }else{
                System.out.println("ok..");
            }
    }
}

