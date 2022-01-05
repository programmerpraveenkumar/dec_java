package DatabaseConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/*
servername->localhost or ipaddress(192.168.25.45)
username->root
password->""
portno->3306
database name -> jan_morning
 */
public class DbConnectionDelete {
    public static void main(String args[]) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");//mysql driver from the exteranl jar
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jan_morning","root","");
            Statement stmt = con.createStatement();//create obj for execute the sql quries
            stmt.execute("delete from test where id = 5");//execute the updated query in the mysql
            con.close();
            System.out.println("delete completed");

        }catch(Exception e){ System.out.println(e);}
    }
}
