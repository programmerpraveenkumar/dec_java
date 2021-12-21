package oops;

//inherting the props from parent to child
//multiple inheritance not allowed.(one child can have only one parent)
//multilevel inheritance allowed

/*
Inheritance
Class
Abstract class ->
	cant able to create object
	so can be  used in inheritance using extends.
	if any methods declared as abstract ,should have definition in child class.
	multiple inheritance cannot be allowed.

Interface:
	cant able to create object
	so can be  used in inheritance using implements.
	only method declaration can be allowed.no definition. So definition can be allowed in child class.
	multiple implementation or inheritance allowed.

 */
public class Child  extends Parent{
    public void printChild(){
        System.out.println("this is from child");
    }

    @Override
    public void printName() {
        System.out.println("this is child print name");
    }

    public static void main(String args[]){
        Child c = new Child();
        //using child class variable access parent
        System.out.println(c.name);//calling parent variable
        System.out.println(c.name2);//calling from grand parent(parent2)
        c.printChild();//can access child method
        c.printName();//calling parent method
        //polymorphism
        Parent p = new Child();//using child class can create obj for parent .
        p.printName();

        Parent pa = new Parent();
        pa.printName();

//        Parent2 p2 = new Child();//using child class can create obj for parent .
//        p.printName();
        //p.name
    }
}
