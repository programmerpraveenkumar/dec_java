package CollectionsSample;

import java.util.ArrayList;
import java.util.Collections;

/*
<> diamond operator
arraylist uses array for storing data inside the JDK
position starts with 0 and increment by 1
 */
public class ArrayListSort {
    public static void main(String args[]) {
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        list1.add(55);
        list1.add(10);
        list1.add(11);
        list1.add(45);
        Collections.sort(list1);//sort the list based on the data type.

        System.out.println(list1);
        StringSort();

    }

    public static void StringSort(){
        ArrayList<String> list1 = new ArrayList<String>();
        list1.add("zebra");
        list1.add("cat");
        list1.add("lion");
        list1.add("tiger");
        System.out.println(list1);
        Collections.sort(list1);//sort the list based on the data type.
        System.out.println(list1);
    }
}
