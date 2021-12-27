package CollectionsSample.MapSample;

import java.util.LinkedHashMap;
import java.util.TreeMap;

/*
key should not be duplicate
insertion order will not be maintain.but data will be sorted by ascending using key.
 */
public class TreeMapSample {
    public static void main(String args[]) {
        TreeMap<String,String> obj = new TreeMap<String,String>();
        obj.put("first_name","testname");
        obj.put("animal","lion");
        obj.put("second_name","last name");
        obj.put("email","email@gmail.com");

        obj.put("email","testupdate@gmai.com");//value will overridden if key is duplicate.
        //for store t
        System.out.println(obj);
    }
}
