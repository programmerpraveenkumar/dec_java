package oops;

public class ChildAbstract extends AbstractClassSample {


    //abstract method override in child class
    @Override
    void printSomething() {
        System.out.println("Print something in child class(definition from abstract class)");

    }

    public static  void main(String args[]){
        ChildAbstract c = new ChildAbstract();
        c.printSomething();

        //object will crate for AbstractClassSample with child
        AbstractClassSample abs = new ChildAbstract();
        abs.printName();
    }
}
