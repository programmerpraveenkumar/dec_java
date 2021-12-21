package oops;

public class ChildInterface implements SampleInterface,SampleInterface2 {
    @Override
    public void printAge() {
        System.out.println("this is from interface");
    }
    @Override
    public void printName(){
        System.out.println("this is from printName");
    }

    public static  void  main(String args[]){
        ChildInterface obj = new ChildInterface();
        obj.printAge();
        obj.printName();
        obj.printAge2();
        obj.printName2();
    }

    @Override
    public void printAge2() {
        System.out.println("this is from printAge 2 ");
    }

    @Override
    public void printName2() {
        System.out.println("this is from printName 2");
    }
}
