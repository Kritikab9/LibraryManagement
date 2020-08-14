
package librarymanagement;
import javax.swing.*;
import java.awt.*;
import static java.lang.Integer.parseInt;
import java.sql.*;


public class AddLibrarian 
{
    public void addlibrarian()
    {
         String url="jdbc:oracle:thin:@localhost:1521:xe"; 
         AdminSection ob = new AdminSection();
        JFrame frame = new JFrame();
        JLabel l = new JLabel("Add Librarian");
       
         JLabel l1 = new JLabel("Name");
         JLabel l2 = new JLabel("Password");
         JLabel l3 = new JLabel("Em..");
         JLabel l4 = new JLabel("Address");
         JLabel l5 = new JLabel("City");
         JLabel l6 = new JLabel("Contact no");
          JLabel l7=new JLabel("Id");
         JButton b1=new JButton("Add Librarian");
         JButton b2=new JButton("Back");
         JTextField t1=new JTextField();
         JPasswordField t2=new JPasswordField();
         JTextField t3=new JTextField();
         JTextField t4=new JTextField();
         JTextField t5=new JTextField();
         JTextField t6=new JTextField();
         JTextField t7= new JTextField();
         
         l.setBounds(260, 80, 300, 20);
         l7.setBounds(70, 110, 300, 20);
         l1.setBounds(70, 150, 300, 20);
         l2.setBounds(70, 190, 300, 20);
         l3.setBounds(70, 230, 300, 20);
         l4.setBounds(70,270, 300, 20);
         l5.setBounds(70, 310, 300, 20);
         l6.setBounds(70, 350, 300, 20);
         t1.setBounds(150, 150, 300, 20);
         t2.setBounds(150, 190, 300, 20);
         t3.setBounds(150, 230, 300, 20);
         t4.setBounds(150, 270, 300, 20);
         t5.setBounds(150, 310, 300, 20);
         t6.setBounds(150, 350, 300, 20);
         t7.setBounds(150, 110, 300, 20);
         b1.setBounds(180, 380, 170, 40);
         b2.setBounds(200, 470, 100, 30);
         
         
          
        frame.add(l);
        frame.add(l1);
        frame.add(l2);
        frame.add(l3);
        frame.add(l4);
        frame.add(l5);
        frame.add(l6);
        frame.add(l7);
        frame.add(t1);
        frame.add(t2);
        frame.add(t3);
        frame.add(t4);
        frame.add(t5);
        frame.add(t6);
        frame.add(t7);
        frame.add(b1);
        frame.add(b2);
        
        b1.addActionListener(ae->
                
        {
            int id =parseInt(t7.getText());
            String name=t1.getText();
            String pass=t2.getText();
            String em=t3.getText();
            String addr=t4.getText();
            String city=t5.getText();
            String cont=t6.getText();
             try
        {
            Connection con =DriverManager.getConnection(url,"system","kritika");
             Statement s=con.createStatement();
             s.executeUpdate("Insert into View_librarian values ("+id+",'"+name+"','"+pass+"','"+em+"','"+addr+"','"+city+"','"+cont+"')");
        }
              catch(SQLException e)
            {
                System.out.println(e);
            }
             
                      
            JOptionPane.showMessageDialog(frame, "Librarian added succesfully","Message",JOptionPane.INFORMATION_MESSAGE);  
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
