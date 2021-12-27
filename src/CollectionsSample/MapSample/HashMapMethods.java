package CollectionsSample.MapSample;

import java.util.HashMap;

/*
map will have key and value
key shoud not be duplicated.
value can be duplicate
insertion order wil not maintain
 */
public class HashMapMethods {
    public static void main(String args[]) {
        HashMap<String,String> obj = new HashMap<String,String>();
        obj.put("first_name","testname");
        obj.put("second_name","last name");
        obj.put("email","email@gmail.com");

        System.out.println(obj.containsKey("second_name1"));///return true or false
        obj.putIfAbsent("mobile","464646464");//if key is alreay exist.it will not add.
        System.out.println(obj);
        //obj.clear();//clear the hashmap all the key with values.
        System.out.println(obj);
        System.out.println(obj.isEmpty());
        obj.remove("email");//remove base on the key
        System.out.println("after remove email"+obj);
        obj.remove("second_name","not name");//remove base on the key and value
        System.out.println(obj);
        obj.replace("first_name","update new name");
        System.out.println(obj);

    }
}

