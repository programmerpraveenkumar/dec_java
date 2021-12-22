package ExceptionSamples;
/*
    1.for custom exception.class should extends wth Exception.
    2.child class constructor should call parent class constructor with super() method

 */
public class CustomException extends  Exception {
        public CustomException(String message){
            //can send to error to manager or client
            //will write the error in file
            super(message);//parent class constructor
        }
}
