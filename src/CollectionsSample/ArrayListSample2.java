package CollectionsSample;

import java.util.ArrayList;

/*
<> diamond operator
arraylist uses array for storing data inside the JDK
position starts with 0 and increment by 1
 */
public class ArrayListSample2 {
    public static void main(String args[]) {
        ArrayList<String> list1 = new ArrayList<String>();
        list1.add("first");//adding the element to the list position -0
        list1.add("second");//pos 1
        System.out.println(list1.size());
        ArrayList<String> list2 = new ArrayList<String>();
        list2.add("first");//adding the element to the list position -0
        list2.add("second");//pos 1
        list1.addAll(list2);//merge the two arraylist into 1
        System.out.println("after adding");
        System.out.println(list1.size());
    }
}
