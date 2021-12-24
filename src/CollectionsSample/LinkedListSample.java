package CollectionsSample;

import java.util.LinkedList;
import java.util.Vector;

/*

 */
public class LinkedListSample {
    public static void main(String args[]) {
        LinkedList<String> obj = new LinkedList<String>();
        obj.add("first");//adding the element to the list position -0
        obj.add("second");//pos 1
        obj.add("third");//pos 2
        obj.add("four");//pos 3
        obj.add("four");//pos 4
        //to get the single element using position.
        System.out.println("from the position 2"+obj.get(2));
        //iteration for the list
        System.out.println("---for each iteration--");
        for(String t:obj){
            System.out.println(t);
        }
        System.out.println("size of the array list "+obj.size());
        for(int start = 0;start<obj.size();start++){
            System.out.println(obj.get(start));//value will be from position
        }
        System.out.println(obj.indexOf("second"));//will print the position of the element if exist.
        System.out.println(obj.indexOf("five"));//will print -1  if  not exist.
        System.out.println(obj.contains("four"));//if element is present,it ll return true.
        System.out.println(obj.contains("not-exist"));//if element is present,it ll return true.

    }
}
