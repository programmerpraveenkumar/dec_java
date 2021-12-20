public class MethodsInJava {
    /*
    access_specifier void method_Name(){} -- no return type
    access_specifier return_type method_Name(){} --> return type(object,primitive data)

    public void addition(){
        int num = 10;
        int num1 = 11;
        num+num1;//
    }

    access_specifer =>public,private,protected,default
     */
    //runtime args
    public static void main(String [] args){
        MethodsInJava obj = new MethodsInJava();
        obj.addition();//calling method
        //obj.getAge();
        System.out.println(obj.getAge());
        System.out.println(obj.getName());
    }
    //example for method without return type
    public void addition(){
        int num = 10;
        int num1 = 11;
        System.out.println(num+num1);//addition.
    }

    //example for method with return type
    public int getAge(){
        int num = 100;
        int num1 = 11;
        return num+num1;//always last line should be return;
    }

    public String getName(){
        return "sample name";
    }
    /*
    long
    double
    boolean
    char
    byte
    short
    any object
     */

}
