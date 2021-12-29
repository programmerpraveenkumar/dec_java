package CollectionsSample;

import java.util.ArrayList;
import java.util.Collections;

/*
<> diamond operator
arraylist uses array for storing data inside the JDK
position starts with 0 and increment by 1
 */
public class ArrayListPojo {
    public static void main(String args[]) {
        ArrayList<Person> list1 = new ArrayList<Person>();

        Person person0 = new Person();
        person0.setAge(10);
        person0.setName("test1");
        person0.setPhoneNo("545454");

        Person person1 = new Person();
        person1.setAge(11);
        person1.setName("test2");

        list1.add(person1);//adding object to arraylist
        list1.add(person0);//adding object to arraylist
        list1.add(person1);//adding object to arraylist
        list1.add(new Person(10,"test"));

        System.out.println("before sorting.---");
        for(Person tmp:list1){
            //System.out.println(tmp);
            System.out.println(tmp.getAge()+" "+tmp.getName());
        }
        Collections.sort(list1);

        Person personZero = list1.get(0);
        System.out.println("0th index "+personZero.getAge()+" "+personZero.getName()+" -- "+personZero.getPhoneNo());

        System.out.println(list1.size());
        System.out.println("--after sorting.---");

        for(Person tmp:list1){
            //System.out.println(tmp);
            System.out.println(tmp.getAge()+" "+tmp.getName());
        }
    }
}
