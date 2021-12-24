package CollectionsSample.SetSample;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

/*
will not allow the duplicates
will not maintain the insertion order.But it will store in the ascending order.
 */
public class TreeSetSample {

    public static void main(String args[]) {
        TreeSet<String> obj = new TreeSet<String>();
        obj.add("test8");
        obj.add("test9");
        obj.add("test2");
        obj.add("test1");
        obj.add("test3");//duplicates will not allow in treeset
        obj.add("test3");
        System.out.println("--iterator---");
        Iterator<String> itr = obj.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }


    }
}
