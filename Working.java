
package librarymanagement;

import javax.swing.*;
import java.awt.*;
import javax.swing.border.EmptyBorder;
public class Working  
{
    public void work()
    {
        JFrame frame=new JFrame(); 
        JPanel panel = new JPanel();
        LoginForm ob= new LoginForm();
    
        JButton b1,b2;
        JLabel l;
        JTextField t;
        
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
     //  panel.setLayout( new BoxLayout(panel,BoxLayout.Y_AXIS));
     //  panel.setBorder(new EmptyBorder(new Insets(100, 150, 100, 150))); 
      
       l=new JLabel("Library Management");
       b1=new JButton("Admin Login");
       b2=new JButton("Student Login");
       
       l.setBounds(150, 30, 300, 40);
       b1.setBounds(70, 70, 300, 40);
       b2.setBounds(70, 120, 300, 40);
       
       frame.add(l);
       frame.add(b1);
       frame.add(b2);
       
     b1.addActionListener( ae->
     {
             ob.loginform();
     }
     );
      
   //  frame.add(panel);
     //frame.pack(); 


      
       frame.setSize(450, 450);
        frame.setLayout(null);
     frame.setVisible(true);
     
     
     
     
        
    }
    
}
