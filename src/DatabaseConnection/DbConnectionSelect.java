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
public class DbConnectionSelect {
    public static void main(String args[]) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");//mysql driver from the exteranl jar
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jan_morning","root","");
           // Connection con2=DriverManager.getConnection("jdbc:mysql://192.168.15.6:3306/jan_morning_2","root","");
            Statement stmt = con.createStatement();//create obj for execute the sql quries

           ResultSet resDbCount = stmt.executeQuery("select count(id) as count from test");//execute the query in the mysql
           resDbCount.next();
           System.out.println("Total record "+resDbCount.getInt("count"));

             ResultSet resDb = stmt.executeQuery("select id,name,email from test limit 10,10");//execute the query in the mysql
            //below loop will execute till last data
            while(resDb.next()) {
                //access the data using columnname from the table
                System.out.println(resDb.getInt("id") + " " + resDb.getString("name") + " " + resDb.getString("email"));
            }
        }catch(Exception e){ System.out.println(e);}
    }
}
