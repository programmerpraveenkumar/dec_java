package CollectionsSample;

import java.util.ArrayList;

/*
<> diamond operator
arraylist uses array for storing data inside the JDK
position starts with 0 and increment by 1
 */
public class ArrayListSample3 {
    public static void main(String args[]) {
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        list1.add(45);
        list1.add(10);
        list1.add(11);
        list1.add(45);
        //lists1.add("test");


        System.out.println(list1.contains(45));
        System.out.println(list1.indexOf(11));
        System.out.println(list1);

    }
}
