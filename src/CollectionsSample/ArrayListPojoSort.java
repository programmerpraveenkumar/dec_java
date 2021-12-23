package CollectionsSample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/*
<> diamond operator
arraylist uses array for storing data inside the JDK
position starts with 0 and increment by 1
 */
public class ArrayListPojoSort {
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

        SharePrice sp1 = list1.get(0);
        System.out.println(sp1.getCompanyName()+" "+sp1.getPrice());
        System.out.println("--for loop iteration--");
        for(SharePrice sp:list1){
            System.out.println(sp.getCompanyName()+" "+sp.getPrice());
        }
        System.out.println("------Name collection sorting---");
        Collections.sort(list1,new NameSorting());
        for(SharePrice sp:list1){
            System.out.println(sp.getCompanyName()+" "+sp.getPrice());
        }
        System.out.println("------Price collection sorting---");
        Collections.sort(list1,new PriceSorting());
        for(SharePrice sp:list1){
            System.out.println(sp.getCompanyName()+" "+sp.getPrice());
        }


    }
}

// comparator ->creating custom class for sorting.(interface)
class PriceSorting implements Comparator<SharePrice> {
    /*
        1->s1 is greater than s2
        0 -> both are same
        -1 ->s2 is greater than s1
     */
   @Override
    public int compare(SharePrice s1, SharePrice s2) {
       return Double.compare(s1.getPrice(),s2.getPrice());//default methods
//       if(s1.getPrice()> s2.getPrice()){
//           return 1;
//       }else if(s1.getPrice()<s2.getPrice()){
//           return -1;
//       }else{
//           return  0;
//       }
    }
}

// comparator ->creating custom class for sorting.(interface)
class NameSorting implements Comparator<SharePrice> {
    /*
        1->s1 is greater than s2
        0 -> both are same
        -1 ->s2 is greater than s1
     */
    @Override
    public int compare(SharePrice s1, SharePrice s2) {

        return s1.getCompanyName().compareToIgnoreCase(s2.getCompanyName());
//        if(s1.getPrice()> s2.getPrice()){
//            return 1;
//        }else if(s1.getPrice()<s2.getPrice()){
//            return -1;
//        }else{
//            return  0;
//        }
    }
}
