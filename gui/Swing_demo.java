package gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Swing_demo {
	
	//To create frmae Jframe class is used
	JFrame f;
	
	//to create Label Jlabel is used
	JLabel l1,l2,l3,l4;
	
	// to create button Jbutton is used
	JButton b1,b2,b3,b4;
	
	// to create Text box JTextfileld is used
	JTextField t1,t2,t3,t4;
	
	
	public Swing_demo() {      // Default constructor
	 
		f=new JFrame("Employee register");
		f.setVisible(true);   // to visible frame 
		f.setSize(400, 500);  // to set the size of the frame
		f.setLayout(null);
		f.setResizable(false);
		
		
		// Give name of each label
		l1=new JLabel("ID : ");
		l2=new JLabel("Email : ");
		l3=new JLabel("Phone : ");
		l4=new JLabel("Name : ");
	
        // add label to frame		
		f.add(l1);
		f.add(l2);
		f.add(l3);
		f.add(l4);
		
		// Set dimension of label in (x,y,width and height)
		l1.setBounds(50, 50, 50, 50);
		l2.setBounds(50, 100, 50, 50);
		l3.setBounds(50, 150, 50, 50);
		l4.setBounds(50, 200, 50, 50);
		
		// Give name of each text box
		t1=new JTextField(20);
		t2=new JTextField(20);
		t3=new JTextField(20);
	    t4=new JTextField(20);
	    
	    // add text box to frame		
	  	f.add(t1);
	  	f.add(t2);
	  	f.add(t3);
	  	f.add(t4);
		
	 // Set dimension of label in (x,y,width and height)
	    t1.setBounds(120, 65, 150, 30);
	 	t2.setBounds(120, 115, 150, 30);
	 	t3.setBounds(120, 165, 150, 30);
	 	t4.setBounds(120, 215, 150, 30);
	
		
		// Give name of each button
		b1=new JButton("insert");
		b2=new JButton("search");
		b3=new JButton("update");
		b4=new JButton("delete");
		
		// add button to frame		
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);
		
		// Set dimension of label in (x,y,width and height)
		b1.setBounds(50, 250, 100, 30);
		b2.setBounds(180, 250, 100, 30);
		b3.setBounds(50, 300, 100, 30);
		b4.setBounds(180, 300, 100, 30);
		
	}
	
	public static void main(String[] args) {
		new Swing_demo();
		
	}

}
