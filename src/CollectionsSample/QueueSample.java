package CollectionsSample;

import java.util.PriorityQueue;
/*
First In First Out
 */

public class QueueSample {
    public static void main(String args[]) {
        PriorityQueue<String> obj = new PriorityQueue<>();
        obj.add("test");
        obj.add("test2");
        obj.add("test3");
        obj.add("test4");
        System.out.println(obj.peek());//return the first element
        System.out.println(obj);
        System.out.println(obj.poll());//return and remove the first element
        System.out.println(obj);
        System.out.println(obj.size());

    }
}
