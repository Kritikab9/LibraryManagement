
package librarymanagement;
import javax.swing.*;
import java.awt.*;

public class LoginForm 
{
    public void loginform()
    {
 AdminSection ob = new AdminSection();
 JLabel l1, l2, l3;
 JTextField t1,t2;
 JButton b1;

 
  JFrame frame = new JFrame("Login Form");
  l1 = new JLabel("Login Form");
  l1.setForeground(Color.blue);
  l1.setFont(new Font("Serif", Font.BOLD, 20));

     
  l2 = new JLabel("Username");
  l3 = new JLabel("Password");
  t1 = new JTextField();
  t2 = new JPasswordField();
  b1 = new JButton("Login");

  l1.setBounds(100, 30, 400, 30);
  l2.setBounds(80, 70, 200, 30);
  l3.setBounds(80, 110, 200, 30);
  t1.setBounds(150, 70, 200, 30);
  t2.setBounds(150, 110, 200, 30);
  b1.setBounds(100, 160, 100, 30);

  frame.add(l1);
  frame.add(l2);
  frame.add(t1);
  frame.add(l3);
  frame.add(t2);
  frame.add(b1);
  
  b1.addActionListener( ae->
  {
          String id = t1.getText();
          String pass = t2.getText();
          
          if(id.equals("admin") && pass.equals("admin123"))
          {
             ob. adminsection();
          }
          else
          {
              JOptionPane.showMessageDialog(frame, "incorrect id or password","ERROR",JOptionPane.ERROR_MESSAGE);
       
              
          }
   }        
              );

  
      
       frame.setSize(550, 500);
     frame.setLayout(null);
      frame.setVisible(true);

    }
    
    
}
