package CollectionsSample;

import java.util.ArrayList;

/*
<> diamond operator
arraylist uses array for storing data inside the JDK
position starts with 0 and increment by 1
 */
public class ArrayListPojo2 {
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

        list1.add(amazon);
        list1.add(microsoft);
        list1.add(tata);

        SharePrice sp1 = list1.get(0);
        System.out.println(sp1.getCompanyName()+" "+sp1.getPrice());
        System.out.println("--for loop iteration--");
        for(SharePrice sp:list1){
            System.out.println(sp.getCompanyName()+" "+sp.getPrice());
        }


    }
}
