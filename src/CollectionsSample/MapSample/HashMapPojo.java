package CollectionsSample.MapSample;

import java.util.HashMap;

/*
map will have key and value
key shoud not be duplicated.
value can be duplicate
insertion order wil not maintain
 */
public class HashMapPojo {
    public static void main(String args[]) {
        HashMap<String,CIty> obj = new HashMap<String,CIty>();

        CIty chennai = new CIty();
        chennai.setName("chennai");
        chennai.setId(100);

        CIty trichy = new CIty();
        trichy.setName("trichy");
        trichy.setId(101);

        CIty coimbatore = new CIty();
        coimbatore.setName("coimbatore");
        coimbatore.setId(110);

        CIty madurai = new CIty();
        madurai.setName("madurai");
        madurai.setId(120);

        obj.put("chennai",chennai);
        obj.put("trichy",trichy);
        obj.put("coimbatore",coimbatore);
        obj.put("madurai",madurai);

        System.out.println("to get the using key");
        CIty city = obj.get("coimbatore");
        System.out.println(city.getId()+" "+city.getName());

        System.out.println("-- for loop iteration--");
        for(CIty c:obj.values()){
            System.out.println(c.getId()+" "+c.getName());
        }





    }
}

