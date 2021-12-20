
public class StaticMethodSample2 {

    public static void main(String [] args){

        AnotherClass.static_name = "test";//callign static variable.

        AnotherClass sample = new AnotherClass();
        sample.name = "updating name";


        AnotherClass sample1 = new AnotherClass();
        sample1.name = "updating name for object2";//update in object
        sample1.name = "updating 2";//update in object

        sample.name = "update for sample object";
        AnotherClass.static_name = "test static update";//update in static

        System.out.println(AnotherClass.static_name);//print static value.
        System.out.println(sample.name);
        System.out.println(sample1.name);

    }
}

class AnotherClass{
    public static String static_name = "testname";
    public String name = "testname";
}



