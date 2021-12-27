package CollectionsSample.MapSample;

import java.util.LinkedHashMap;
/*
key should not be duplicate
insertion order will be maintain.
 */
public class LinkedHashMapSample {
    public static void main(String args[]) {
        LinkedHashMap<String,String> obj = new LinkedHashMap<String,String>();
        obj.put("first_name","testname");
        obj.put("second_name","last name");
        obj.put("email","email@gmail.com");
        obj.put("email","testupdate@gmai.com");//value will overridden if key is duplicate.
        System.out.println(obj);
    }
}
