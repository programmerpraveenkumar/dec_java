package CollectionsSample.SetSample;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

/*
will not allow the duplicates
will maintain the insertion order
 */
public class LinkedHashSetSample {

    public static void main(String args[]) {
        LinkedHashSet<String> obj = new LinkedHashSet<>();
        obj.add("test");
        obj.add("test1");
        obj.add("test2");
        obj.add("test");//duplicates will not be added.
        obj.add("test3");
        obj.add("test4");
        System.out.println(obj.contains("test3"));//true
        //obj.remove("test3");//remove
        System.out.println(obj.contains("test3"));//false

        System.out.println("--for iteration--");
        for(String tmp:obj){
            System.out.println(tmp);
        }
        System.out.println("size of the LinkedHashSet "+obj.size());
        System.out.println("--iterator---");
        //String[] tmpArray = (String[]) obj.toArray();//set to array
        Iterator<String> itr = obj.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
     //   System.out.println(obj);

    }
}
