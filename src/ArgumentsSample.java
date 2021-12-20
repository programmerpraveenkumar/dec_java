public class ArgumentsSample {
    public static void main(String [] args){
       ArgumentsSample argsObj = new ArgumentsSample();
        argsObj.addition(10,11);
        argsObj.addition(100,151);
        argsObj.subtraction(251,1500);
        int sub_ans = argsObj.subtractionReturnType(25   ,50);
        System.out.println(sub_ans);

        //below methods are pointing to same method with different arguments.
//        int addtin_overloading = argsObj.additionReturnType(10,12);
//        int addtin_overloading1 = ;
//        System.out.println(addtin_overloading);
//        System.out.println(addtin_overloading1);

        System.out.println( argsObj.additionReturnType(10,12));
        System.out.println(argsObj.additionReturnType(10,12,35));
    }

    //arguments with no-return type
    public void addition(int num1,int num){
        System.out.println(num+num1);//addition.
    }
    public void subtraction(int num1,int num){
        System.out.println(num-num1);//addition.
    }
    //arguments with return type
    public int subtractionReturnType(int num1,int num){
        return (num-num1);
    }
    //below is method overloading
    public int additionReturnType(int num1,int num){
        return (num+num1);
    }
    public int additionReturnType(int num1,int num,int num3){
        return (num+num1+num3);
    }


    //method overloading->same name, same return type only argument will be different
}
