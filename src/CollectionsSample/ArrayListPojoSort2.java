package CollectionsSample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/*
<> diamond operator
arraylist uses array for storing data inside the JDK
position starts with 0 and increment by 1
 */
public class ArrayListPojoSort2 {
    public static void main(String args[]) {
        ArrayList<SharePrice> list1 = new ArrayList<SharePrice>();
        SharePrice amazon = new SharePrice();
        amazon.setCompanyName("Amazon");
        amazon.setPrice(10005.5);

        SharePrice microsoft = new SharePrice();
        microsoft.setCompanyName("Microsoft");
        microsoft.setPrice(455003.55);


        SharePrice tata = new SharePrice();
        tata.setCompanyName("TATA");
        tata.setPrice(4587.25);


        list1.add(microsoft);
        list1.add(tata);
        list1.add(amazon);
        Collections.sort(list1, new Comparator<SharePrice>() {
            @Override
            public int compare(SharePrice o1, SharePrice o2) {
              return  Double.compare(o1.getPrice(),o2.getPrice());
            }
        });


    }
}

