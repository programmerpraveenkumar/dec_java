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
public class DbConnectionSelectEmailAndpasword {
    public static void main(String args[]) {
        try{
            String email = "testemail2@gmail.com";
            String password = "test2pwd";

            Class.forName("com.mysql.cj.jdbc.Driver");//mysql driver from the exteranl jar
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jan_morning","root","");
            Statement stmt = con.createStatement();//create obj for execute the sql quries
            ResultSet resDb = stmt.executeQuery("select * from test where email ='testemail37@gmail.com' and password = 'test3pwd'");//execute the query with limit
            if(resDb.next()){
                System.out.println("user is exist.And user's id "+resDb.getString("id"));
            }else{
                System.out.println("user is not exist.Please provide the proper credentials");
            }
//            //below loop will execute till last data
//            while(resDb.next()) {
//                //access the data using columnname from the table
//                System.out.println(resDb.getInt("id") + " " + resDb.getString("name") + " " + resDb.getString("email"));
//            }
        }catch(Exception e){ System.out.println(e);}
    }
}
