package CollectionsSample.MapSample;

import java.util.HashMap;

/*
map will have key and value
key shoud not be duplicated.
value can be duplicate
 */
public class HashMapSample {
    public static void main(String args[]) {
        HashMap<String,String> obj = new HashMap<String,String>();
        obj.put("first_name","testname");
        obj.put("second_name","last name");
        obj.put("email","email@gmail.com");
        obj.put("email","testupdate@gmai.com");//value will overridden if key is duplicate.
        System.out.println(obj);
    }
}

