package DatabaseConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/*
servername->localhost or ipaddress(192.168.25.45)
username->root
password->""
portno->3306
database name -> jan_morning
 */
public class DbConnectionSelectJoin {
    public static void main(String args[]) {
        try{
            int page_toShow = 10;
            int  page_no = 0;
            int data_position = page_no*page_toShow;
            Class.forName("com.mysql.cj.jdbc.Driver");//mysql driver from the exteranl jar
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jan_morning","root","");
            Statement stmt = con.createStatement();//create obj for execute the sql quries
            //ResultSet resDb = stmt.executeQuery("select * from test limit 0,10");//execute the query in the mysql
                ResultSet resDb = stmt.executeQuery("select * from user as u join city as c on u.city_id =  c.id");//execute the query with limit
            //below loop will execute till last data
            while(resDb.next()) {
                //access the data using columnname from the table
                System.out.println(resDb.getInt("id") + " " + resDb.getString("name") + " " + resDb.getString("email"));
            }
        }catch(Exception e){ System.out.println(e);}
    }
}
