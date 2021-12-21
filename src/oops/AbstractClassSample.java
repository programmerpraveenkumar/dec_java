package oops;
/*
Abstract class:
	cant create object .
	so can be used in inheritance.
	if any methods can be declared as abstract.definition has to done in child class.

Declaration and definition.
public void method();//declaration

public void method(){}//definition

 */
public abstract class AbstractClassSample {
    public int age = 45;
    public void printName(){
        System.out.println("this is from abstract method");
    }
    //abstract method declaration.
    abstract void printSomething();
}
