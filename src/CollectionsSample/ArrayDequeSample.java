package CollectionsSample;

import java.util.ArrayDeque;

/*
    ArrayDequeSample
        both fifo and lifo apply
 */
public class ArrayDequeSample {
    public static void main(String args[]) {
        ArrayDeque<String> obj = new ArrayDeque<String>();
        obj.add("test");
        obj.add("test3");
        obj.add("test4");
        obj.add("test5");
        System.out.println("peek "+obj.peek());
        System.out.println(obj);
        System.out.println("poll "+obj.poll());
        System.out.println(obj);
        System.out.println("peek first "+obj.peekFirst());
        System.out.println("peek last "+obj.peekLast());
        System.out.println("poll last "+obj.pollLast());
        System.out.println(obj);
    }
}
