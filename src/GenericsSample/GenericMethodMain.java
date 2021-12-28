package GenericsSample;

public class GenericMethodMain {
    public static void main(String args[]) {
        GenericMethodMain main = new GenericMethodMain();
        main.printMessage("test");
        main.printMessage(1);
        main.printMessage(1.5);
        main.printMessage(true);
    }

    //method level generic
    public <k> void printMessage(k val){
        System.out.println(val);
    }
}
