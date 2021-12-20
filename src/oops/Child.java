package oops;

//inherting the props from parent to child
public class Child  extends Parent{

    public static void main(String args[]){
        Child c = new Child();
        //using child class variable access parent
        System.out.println(c.name);//calling parent variebl
        c.printName();//calling parent method
    }
}
