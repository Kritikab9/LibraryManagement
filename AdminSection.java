
package librarymanagement;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class AdminSection
{
    public  void adminsection()
    {
        Working ob2= new Working ();
         JFrame frame = new JFrame("Login Form");
         AddLibrarian ob = new AddLibrarian();
         DeleteLibrarian ob1 = new DeleteLibrarian();
        
        JButton b1 = new JButton ("Add Librarian");
        JButton b2 = new JButton("View Librarian");
        JButton b3 = new JButton("Delete Librarian");
        JButton b4 = new JButton("Logout");
        
        b1.setBounds(70, 20, 300, 40);
        b2.setBounds(70, 70, 300, 40);
        b3.setBounds(70, 120, 300, 40);
        b4.setBounds(70, 170, 300, 40);
           
         
        frame. add(b1);
        frame. add(b2);
        frame. add(b3);
        frame. add(b4);
         b1.addActionListener( ae->
        {
          ob. addlibrarian(); 
        });
        b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			ViewLibrarian.viewlibrarian();
			}
		});
         b3.addActionListener( ae->
        {
          ob1. deletelibrarian(); 
        });
          b4.addActionListener( ae->
        {
          ob2.work();
        });
       
       
     
      
      
       frame.setSize(450, 450);
        frame.setLayout(null);
        frame.setVisible(true);
          
    }
            
            
    
}
