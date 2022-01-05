package DatabaseConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
servername->localhost or ipaddress(192.168.25.45)
username->root
password->""
portno->3306
database name -> jan_morning
 */
public class DbConnectionInsert {
    public static void main(String args[]) {
       // insertMUltipleData();
        insertDataWithDate();
//        try{
//            Class.forName("com.mysql.cj.jdbc.Driver");//mysql driver from the exteranl jar
//            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jan_morning","root","");
//            Statement stmt = con.createStatement();//create obj for execute the sql quries
//            stmt.execute("insert into test(name,email,password)values('fromintellij','fromintellij@gmail.com','testpassword')");//execute the query in the mysql
//            con.close();
//            System.out.println("insert completed");
////            ResultSet rs=stmt.executeQuery("select * from emp");
////            while(rs.next())
////                System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));
//
//        }catch(Exception e){ System.out.println(e);}
    }

    public static void insertMUltipleData(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");//mysql driver from the exteranl jar
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jan_morning","root","");
            Statement stmt = con.createStatement();//create obj for execute the sql quries
            for(int i = 1;i<100;i++){
                String name = "test"+i;
                String email = "testemail"+i+"@gmail.com";
                String password  = "test"+i+"pwd";
                stmt.execute("insert into test(name,email,password)values('"+name+"','"+email+"','"+password+"')");
            }

            con.close();
            System.out.println("insert completed");
//            ResultSet rs=stmt.executeQuery("select * from emp");
//            while(rs.next())
//                System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));

        }catch(Exception e){ System.out.println(e);}
    }
    public static void insertDataWithDate(){
        try{
            String pattern = "yyyy-MM-dd";
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
            String date = simpleDateFormat.format(new Date());//current date
            System.out.println(date);
            Class.forName("com.mysql.cj.jdbc.Driver");//mysql driver from the exteranl jar
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jan_morning","root","");
            Statement stmt = con.createStatement();//create obj for execute the sql quries
            stmt.execute("insert into user(name,email,password,dob)values('testdob','testdob1@gmail.com','testdobpwd','"+date+"')");

            con.close();
            System.out.println("insert completed");
//            ResultSet rs=stmt.executeQuery("select * from emp");
//            while(rs.next())
//                System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));

        }catch(Exception e){ System.out.println(e);}
    }
}
