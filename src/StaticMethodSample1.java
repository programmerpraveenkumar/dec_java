/*
for static methods no need to crate object.
static and non-static methods
 */
public class StaticMethodSample1 {
    static String name = "test";
    String name1 = "test";
    public static void main(String [] args){
        printSomething();//calling static mtehod wtihout object.
    }

    //static method
    public static void printSomething(){
        System.out.println(name);//without object can access static variable
        //System.out.println(name1);//Error --non-static variable cannot access from static mehtods.

       // printName();//error-non static method wil not call directly from the satic method
        StaticMethodSample1 obj = new StaticMethodSample1();
        obj.printName();;
    }
    ///non-static method
    public void printName(){
        System.out.println(name);//without object can access static variable
        printSomething();//static method does not need object.so it can be called from non-static
    }
}
