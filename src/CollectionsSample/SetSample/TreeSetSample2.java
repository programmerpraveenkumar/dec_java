package CollectionsSample.SetSample;

import java.util.Iterator;
import java.util.TreeSet;

/*
will not allow the duplicates
will not maintain the insertion order.But it will store in the ascending order.
 */
public class TreeSetSample2 {

    public static void main(String args[]) {
        TreeSet<Integer> obj = new TreeSet<Integer>();
        obj.add(16);
        obj.add(10);
        obj.add(1);
        obj.add(1);//will not allow for duplicates
        obj.add(15);
        obj.add(11);
        obj.add(13);


        System.out.println("--iterator---");
        Iterator<Integer> itr = obj.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }


    }
}
