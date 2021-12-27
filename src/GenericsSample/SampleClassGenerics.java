package GenericsSample;

public class SampleClassGenerics {
    public static void main(String args[]) {
        GenericMain<String> obj = new GenericMain<String>("test string");
        obj.printSomething();
        obj.printSomething("test");

        GenericMain<Integer> objInt = new GenericMain<>(1);
        objInt.printSomething();
        //objInt.printSomething("test");//Error  will come


        GenericMain<Boolean> objBool = new GenericMain<>(true);
        objBool.printSomething();
        objBool.printSomething(false);
        objBool.printSomething();


        GenericMain<Double> objdbl = new GenericMain<>(10.25);
        objdbl.printSomething();

    }

}


class GenericMain<T>{
    T val;
    public GenericMain(T val){
            this.val = val;
    }

    public void printSomething(T val){
        System.out.println(val);
    }

    public void printSomething(){
        System.out.println(this.val);
    }
}
