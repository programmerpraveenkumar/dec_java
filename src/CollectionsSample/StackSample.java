package CollectionsSample;

import java.util.PriorityQueue;
import java.util.Stack;
/*
    last in first out(lifo)
 */

public class StackSample {
    public static void main(String args[]) {
        Stack<String> obj = new Stack<>();
        obj.add("test");
        obj.add("test2");
        obj.add("test3");
        obj.add("test4");
        System.out.println(obj.peek());//return the last element
        System.out.println(obj);
        System.out.println(obj.pop ());//return and remove the last element
        System.out.println(obj);
        System.out.println(obj.size());
    }
}
