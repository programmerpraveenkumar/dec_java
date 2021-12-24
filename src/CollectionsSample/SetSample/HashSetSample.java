package CollectionsSample.SetSample;

import java.util.HashSet;
import java.util.Iterator;

/*
will not allow the duplicates
will not maintain the insertion order
 */
public class HashSetSample {

    public static void main(String args[]) {
        HashSet<String> obj = new HashSet<>();
        obj.add("test");
        obj.add("test1");
        obj.add("test2");
        obj.add("test");//duplicates will not be added.
        obj.add("test3");
        obj.add("test3");

        System.out.println("--for iteration--");
        System.out.println(obj.contains("test3"));//true
        obj.remove("test3");//remove
        System.out.println(obj.contains("test3"));//false
        for(String tmp:obj){
            System.out.println(tmp);
        }
        System.out.println("size of the hashset "+obj.size());
        System.out.println("--iterator---");
        //String[] tmpArray = (String[]) obj.toArray();//set to array
        Iterator<String> itr = obj.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
     //   System.out.println(obj);

    }
}
