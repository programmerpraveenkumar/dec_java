package oops;

public class ChildAbstract2 extends AbstractClassSample {


    //abstract method override in child class
    @Override
    void printSomething() {
        System.out.println("asdfasdf)");
    }

    public static  void main(String args[]){
        ChildAbstract2 c = new ChildAbstract2();
        c.printSomething();
        System.out.println(c.age);

        //object will crate for AbstractClassSample with child
        AbstractClassSample abs = new ChildAbstract2();
        abs.printName();
    }
}
