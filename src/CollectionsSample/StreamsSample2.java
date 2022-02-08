package CollectionsSample;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsSample2 {
    public static void objMap() {
        ArrayList<Person> obj = new ArrayList<Person>();
        obj.add(new Person(10,"test10"));
        obj.add(new Person(11,"test11"));
        obj.add(new Person(12,"test12"));
        obj.add(new Person(13,"test13"));
        obj.add(new Person(14,"test14"));
        obj.add(new Person(15,"test15"));
        obj.add(new Person(16,"test16"));

        List<Integer> o =obj.stream().map(tmp->tmp.getAge() - 5).collect(Collectors.toList());
        System.out.println(o);
    }

    public static void strAppend() {
        ArrayList<String> obj = new ArrayList<String>();
        obj.add("test");
        obj.add("test1");
        obj.add("test2");
        obj.add("test3");

        System.out.println(obj);
        List<String> o =obj.stream().map(str->str+"-test").collect(Collectors.toList());
        obj.stream().map(str->str+"-test").forEach(y-> System.out.println("stream loop "+y));
        System.out.println(o);
    }
    public static void intSquare() {
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
        List<Integer> o =obj.stream().map(num->2*num).collect(Collectors.toList());
        System.out.println(o);
    }


    public static void main(String args[]) {
        //intSquare();
        strAppend();
       // objMap();
        //intFilter();
    }
}
