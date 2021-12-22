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
public class Exception1 {
    public static void main(String args[]){
        try{
            int[] age = {10,15,45,48};//creating the array with values(0,1,2,3)
            System.out.println(age[5]);//value will be from position
        }catch(Exception e){
            System.out.println("Error "+e);
            //e.printStackTrace();
        }
//        int[] age = {10,15,45,48};//creating the array with values(0,1,2,3)
//        System.out.println(age[5]);//value will be from position
        System.out.println("this is last line");

    }
}

