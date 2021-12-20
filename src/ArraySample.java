/*
Index array
	Storing the multiple values.
	using the index(position) values will be stored.
	always position will start with 0.

disadvantages:
    1.dynamic values cannot be add to array.
    2.sorting or custom methods cannot be add.
    3.due to this collections used in java
 */
public class ArraySample {
    public static void main(String args[]){
            int[] age = {10,15,45,48};//creating the array with values(0,1,2,3)
            System.out.println(age[3]);//value will be from position
            int [] age1 = new int[5];
            age1[0] = 45;
            age1[1] = 65;
            age1[3] = 95;
            age1[4] = 75;
            System.out.println(age1[1]);//value will be from position
        System.out.println(age1.length);
        System.out.println(age.length);
        System.out.println("-- array iteration--");//value will be from position
        for(int start = 0;start<age1.length;start++){
            System.out.println(age1[start]);//value will be from position
        }
        //array itertation(using index in for loop,,for each
    }
}

