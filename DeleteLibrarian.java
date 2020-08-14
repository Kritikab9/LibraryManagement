
package librarymanagement;

import static java.lang.Integer.parseInt;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.*;
import java.awt.*;

public class DeleteLibrarian 
{
    public void deletelibrarian()
    {
        AdminSection ob = new AdminSection();
        JFrame frame = new JFrame();
        JLabel l1 = new JLabel("enter id ");
        JTextField t1= new JTextField();
        JButton b1 = new JButton("submit");
        JButton b2 = new JButton("back");
        
        
       l1.setBounds(70, 150, 300, 20);
      t1.setBounds(150, 150, 300, 20);
       b1.setBounds(180, 200, 170, 40);
         b2.setBounds(350, 350, 100, 30);
       
       frame.add(l1);
       frame.add(t1);
       frame.add(b1);
       frame.add(b2);
       
       
 
       b1.addActionListener(ae->
       { int id =parseInt(t1.getText());
         try
        {
             String url="jdbc:oracle:thin:@localhost:1521:xe"; 
            Connection con =DriverManager.getConnection(url,"system","kritika");
             Statement s=con.createStatement();
             s.executeUpdate("Delete from View_librarian where id ="+id+"");
        }
              catch(SQLException e)
            {
                System.out.println(e);
            }
             
                      
            JOptionPane.showMessageDialog(frame, "Librarian deleted succesfully","Message",JOptionPane.INFORMATION_MESSAGE);  
        });
       
        b2.addActionListener(ae->
        {
            ob.adminsection();
        });   

      
       frame.setSize(550, 550);
        frame.setLayout(null);
       frame.setVisible(true);
      
    }
            
    
}
