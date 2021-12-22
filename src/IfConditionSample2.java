public class IfConditionSample2 {

    public static void main(String args[]){
//        int num = 3;
//        if(num <5){
//            System.out.println("this lesser than5");
//        }else if (num < 10){
//            System.out.println("this lesser than 10");
//        }else if(num<15){
//            System.out.println("this lesser than 15");
//        }else{
//            //else will be executed only when if condition is not satisfied
//            System.out.println("should be greater than 15");
//        }


        if(add(10,5) > 10){
            System.out.println("this is greater than 10 ");
        }else{
            System.out.println("this is less than 10 ");
        }

    }

    public static int add(int num1,int num2){
        return num1+num2;
    }

}
