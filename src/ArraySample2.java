/*
Index array
	Storing the multiple values.
	using the index(position) values will be stored.
	always position will start with 0.
 */
public class ArraySample2 {
    public static void main(String args[]){
           String[] name = {"test","test1","test2"};
        System.out.println("printing from 0th position "+name[0]);
        for(int start = 0;start<name.length;start++){
            System.out.println(name[start]);//value will be from position
        }
        //array itertation(using index in for loop,,for each
    }
}

