public class StringSample {
    public static void main(String args[]) {
        String name = "test";
        name = name+"test3";//immutable

        StringBuilder build = new StringBuilder("test");
        build.append("test3");

        StringBuffer buf = new StringBuffer("Test4");
        buf.append("test");

        System.out.println(name);//how object is getting printed
        System.out.println(buf);
        System.out.println(build);
    }
}
