/*
for static methods no need to crate object.
static and non-static methods
 */
public class StaticMethodSample {

    public static void main(String [] args){
        printSomething();//calling static mtehod without object.
    }

    //static method
    public static void printSomething(){
        System.out.println("this is in static method");//addition.
       // printName();//error-non static method wil not call directly from the satic method
    }
    ///non-static method
    public void printName(){
        printSomething();//static method does not need object.so it can be called from non-static
    }
}
