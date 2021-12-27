package CollectionsSample;

import java.util.ArrayList;
import java.util.HashMap;

public class ListWithMap {
    public static void main(String args[]) {
        ArrayList<HashMap<String, String>> obj = new ArrayList<HashMap<String, String>>();

        HashMap<String,String> objMap1 = new HashMap<String,String>();
        objMap1.put("first_name","test firstname");
        objMap1.put("second_name","test secondname");
        objMap1.put("email"," email@gmail.com");

        HashMap<String,String> objMap2 = new HashMap<String,String>();
        objMap2.put("first_name","test firstname");
        objMap2.put("second_name","test secondname");
        objMap2.put("email"," email@gmail.com");

        HashMap<String,String> objMap3 = new HashMap<String,String>();
        objMap3.put("first_name","test firstname");
        objMap3.put("second_name","test secondname");
        objMap3.put("email"," email@gmail.com");

        obj.add(objMap1);
        obj.add(objMap2);
        obj.add(objMap3);
        for(HashMap<String, String> mapObj:obj){
            for(String t:mapObj.values()){
                System.out.println(t);
            }
            System.out.println("----");
        }
    }
}
