package CollectionsSample.SetSample;

import java.util.Iterator;
import java.util.TreeSet;

/*
will not allow the duplicates
will not maintain the insertion order.But it will store in the ascending order.
 */
public class TreeSetSample1 {

    public static void main(String args[]) {
        TreeSet<String> obj = new TreeSet<String>();
        obj.add("zebra");
        obj.add("animal");
        obj.add("cat");
        obj.add("lion");
        obj.add("jackal");//duplicates will not allow in treeset
        obj.add("test3");
        System.out.println("--iterator---");
        Iterator<String> itr = obj.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }


    }
}
