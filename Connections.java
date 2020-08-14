
package librarymanagement;
import java.sql.*;
import java.util.*;
public class Connections 
{
    

    public static void main(String[] args) 
    {
          String url="jdbc:oracle:thin:@localhost:1521:xe";
            try
        {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            System.out.println("driver loaded");
             Connection con =DriverManager.getConnection(url,"system","kritika");
             System.out.println("connection established");
             Statement s = con.createStatement();
            s.executeUpdate("create table View_librarian (id Number, name varchar2(20), password varchar2(20), email varchar2(20), address varchar2(20), city varchar2(20), contact varchar2(20) ");
             System.out.println("table view_librarian created");
             s.executeUpdate("create table view_books (id Number, callno varchar2(20), name varchar2(20) ,author varchar2(20) ,publisher varchar2(20) ,quantitiy Number ,issued Number ,added_date varchar2(20))" );
             System.out.println("table view_books created");
             s.executeUpdate("create table view_issued_books (id Number, bookcallno varchar2(20), studentid number, studentname varchar2(20), scontact Number, issuedate varchar2(20))");
             System.out.println("table view_issued_books created");
        
        }
            catch(SQLSyntaxErrorException e)    
         {
             Working o = new Working();
             o.work();
         }
           
            
            
          
        catch(Exception ex)
        {
            System.out.println(ex);
        }
        
    }       
    
}
