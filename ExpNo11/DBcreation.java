package ExpNo11;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DBcreation {

    public static void main(String[] args) {
       try(Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306", "root", "");
         Statement stmt = conn.createStatement();){
           stmt.execute("CREATE DATABASE ebookshop");
           System.out.println("Done");
       }
       catch(Exception e){
           System.out.println(e);
       }
    }
    
}