package CollectionsSample;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsSample {
    public static void objFilter() {
        ArrayList<Person> obj = new ArrayList<Person>();
       obj.add(new Person(10,"test10"));
        obj.add(new Person(11,"test11"));
        obj.add(new Person(12,"test12"));
        obj.add(new Person(13,"test13"));
        obj.add(new Person(14,"test14"));
        obj.add(new Person(15,"test15"));
        obj.add(new Person(16,"test16"));

        List<Person> o =obj.stream().filter(tmp->tmp.getAge() > 15).collect(Collectors.toList());
        System.out.println(o);
    }

    public static void intFilter() {
        ArrayList<Integer> obj = new ArrayList<Integer>();
        obj.add(1);
        obj.add(15);
        obj.add(16);
        obj.add(18);
        obj.add(19);
        obj.add(20);
        obj.add(21);
        obj.add(22);
        System.out.println(obj);
        List<Integer> o =obj.stream().filter(tmp->tmp > 15).collect(Collectors.toList());
        System.out.println(o);
    }
    public static void strFilter() {
        ArrayList<String> obj = new ArrayList<String>();
        obj.add("test");
        obj.add("test3");
        obj.add("test3");
        obj.add("test4");
        obj.add("test3");
        System.out.println(obj);
        for(String tmp:obj){
            if(tmp.equals("test4")){
                //remove the test4;
            }
        }

        List<String> o =obj.stream().filter(tmp->tmp!="test4").collect(Collectors.toList());
        System.out.println(o);
    }
     public static void strFilterStarts() {
        ArrayList<String> obj = new ArrayList<String>();
        obj.add("abctest");
        obj.add("zxcvtest3");
        obj.add("adtest3");
        obj.add("bbgtest4");
        obj.add("abvtest3");
        System.out.println(obj);
//        for(String tmp:obj){
//            if(tmp.equals("test4")){
//                //remove the test4;
//            }
//        }

        List<String> o =obj.stream().filter(tmp->tmp.startsWith("ab")).collect(Collectors.toList());
        System.out.println(o);
    }


    public static void main(String args[]) {
        strFilterStarts();
        //intFilter();
    }
}
