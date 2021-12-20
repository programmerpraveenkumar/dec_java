public class Car {
// -- single line comment

/*
multi line comment
 */

//variable declaration.
    String drivername="test";
    String carname="hundai";
    String model_name="creata";

    //main method->doorway for java execution.
    //class wch has main method will be called as main class.
    public static void main(String args[]){
//        //variable declaration inside method.
//        String drivername="test";
//        String carname="hundai";
//        String model_name="creata";
//        //System.out.print("sample output from intellij");
//        System.out.println(drivername);//printing the variable in the console.
//        System.out.println(carname);//printing the variable in the console.
//        System.out.println(model_name);//printing the variable in the console.

        //object creation in java for hundai class.
        Hundai obj1 = new Hundai();
        System.out.println(obj1.country);
        System.out.println(obj1.profit);

    //object creation in java for maruthi class.
        Maruthi obj2 = new Maruthi();
        System.out.println(obj2.country);
        System.out.println(obj2.profit);



    }

}
