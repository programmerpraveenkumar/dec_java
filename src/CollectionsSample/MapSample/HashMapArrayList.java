package CollectionsSample.MapSample;

import java.util.ArrayList;
import java.util.HashMap;

/*
map will have key and value
key shoud not be duplicated.
value can be duplicate
insertion order wil not maintain
 */
public class HashMapArrayList {
    public static void main(String args[]) {
        HashMap<String,ArrayList<String>> obj = new HashMap<String,ArrayList<String>>();

        ArrayList<String> cityList1 = new ArrayList<String>();
        cityList1.add("city1-test");
        cityList1.add("city1-test1");
        cityList1.add("city1-test2");

        ArrayList<String> cityList2 = new ArrayList<String>();
        cityList2.add("city2-test");
        cityList2.add("city2-test1");
        cityList2.add("city2-test2");


        ArrayList<String> cityList3 = new ArrayList<String>();
        cityList3.add("city3-test");
        cityList3.add("city3-test1");
        cityList3.add("city3-test2");


        ///adding arraylist to map
        obj.put("city1",cityList1);
        obj.put("city2",cityList2);
        obj.put("city3",cityList3);

        System.out.println("for loop iteration");
        for(ArrayList<String> tmp:obj.values()){//map iteration
                for(String tmpList:tmp){//map's arraylist iteration.
                    System.out.println(tmpList);
                }
            System.out.println("-------------");
        }
    }
}

