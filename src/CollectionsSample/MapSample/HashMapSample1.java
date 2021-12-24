package CollectionsSample.MapSample;

import java.util.HashMap;

/*
map will have key and value
key shoud not be duplicated.
value can be duplicate
 */
public class HashMapSample1 {
    public static void main(String args[]) {
        HashMap<Integer,String> pincodeCity = new HashMap<Integer,String>();
        pincodeCity.put(1454,"Chennai");
        pincodeCity.put(2500,"madurai");
        pincodeCity.put(628500,"trichy");
        pincodeCity.put(1500,"dindigul");

        System.out.println(pincodeCity);
        System.out.println(pincodeCity.get(628500));
        System.out.println("--for loop with values--");
        for(String tmp  :pincodeCity.values()){
            System.out.println(tmp);
        }
        System.out.println("--for loop with keys--");
        for(Integer tmp  :pincodeCity.keySet()){
            System.out.println(tmp+" "+pincodeCity.get(tmp));
        }
        System.out.println(pincodeCity.containsKey(2500));
        System.out.println(pincodeCity.size());
        System.out.println(pincodeCity);
        pincodeCity.remove(1500);
        System.out.println(pincodeCity);

    }
}

