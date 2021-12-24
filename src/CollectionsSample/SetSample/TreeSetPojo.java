package CollectionsSample.SetSample;

import java.util.Iterator;
import java.util.TreeSet;

/*
will not allow the duplicates
will not maintain the insertion order.But it will store in the ascending order.
 */
public class TreeSetPojo {

    public static void main(String args[]) {
        TreeSet<State> obj = new TreeSet<State>();

        State tn = new State();
        tn.setName("Tamilnadu");
        tn.setPeopleCount(1000);

        State an = new State();
        an.setName("Andhra");
        an.setPeopleCount(500);

        State ka = new State();
        ka.setName("Karnataka");
        ka.setPeopleCount(150);

        //adding to treeset
        obj.add(tn);
        obj.add(an);
        obj.add(ka);
        Iterator<State> tmp =obj.iterator();
        while(tmp.hasNext()){
            State o = tmp.next();
            System.out.println(o.getName()+" "+o.getPeopleCount());
        }

    }
}
