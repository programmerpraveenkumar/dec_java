package oops;
/*
Constructor
	method name same as classname.
	when object is create.this will be called .
    usage is .vairable initialize or any configuration can be loaded here.
 */
public class ConsSample {
    String name;//global or public(any methods can access or update the value)

    public  ConsSample(){
        name = "assign in constructor";//variable initialize in constructor
        System.out.println("this is constructor");
        System.out.println(" "+name);
    }
    //constructor overloading.
    public  ConsSample(String name){
        this.name = name ;//this always refer to global variable
        this.printName();
    }

    public void printName(){
        System.out.println(" from printName method -- "+this.name);
        this.name = "this is another update for this variable";//override the value of variable
    }

    public void printName2(){
        System.out.println(" from printName2 method -- "+this.name);
    }

    public static  void main(String args[]){
        ConsSample cons = new ConsSample();
        ConsSample cons2 = new ConsSample("rtest2");
       // new ConsSample2(); private constructor cannot able to create object
//        cons.printName();
//        cons.printName2();
    }
}


