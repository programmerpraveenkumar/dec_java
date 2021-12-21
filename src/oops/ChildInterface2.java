package oops;

public class ChildInterface2 implements SampleInterface {
    @Override
    public void printAge() {
        System.out.println("this is from interface");
    }
    @Override
    public void printName(){
        System.out.println("this is from printName");
    }

    public static  void  main(String args[]){
        ChildInterface2 obj = new ChildInterface2();
        obj.printAge();
        obj.printName();
    }
}
