import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class N extends JFrame implements ActionListener 
{
		JLabel l1,l2,l3,l4,l5,l6,l7;
		JTextField t1,t2,t3,t4;
		JButton b1,b2; 
		JPanel p1;
		
	public N()
	{
		super("Home Page ");
		this.setSize(600,550);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		p1 = new JPanel();
		p1.setSize(new Dimension(600,550));
		p1.setBackground(Color.gray);
		p1.setLayout(null);
	
	
		
		l1 = new JLabel("Welcome To our  Project");
		l1.setFont(new Font("Serif",Font.BOLD,40));
		l1.setForeground(Color.black);
		l1.setBounds(60,90,600,40);
		p1.add(l1);
		 
		
		l2 = new JLabel("INVENTORY MANAGEMENT SYSTEM ");
		l2.setFont(new Font("Serif",Font.BOLD,23));
		l2.setForeground(Color.black);
		l2.setBounds(60,150,550,30);
		p1.add(l2); 
		 
		
		b1 = new JButton("Next");
		b1.setFont(new Font("Comic Sans MS",Font.BOLD,15));
		b1.setForeground(Color.black);
		b1.setBackground(Color.green);
		b1.setBounds(400,350,100,30);
		b1.addActionListener(this); 
		p1.add(b1);

		 
		 
		
        this.add(p1);		
        
	}
	
	public void actionPerformed(ActionEvent ae)
		{
			if(ae.getSource()==b1)
			{
			    N1 f3 = new N1();
				this.setVisible(false);
				f3.setVisible(true);  
			
			} 
			 
			
		} 
	
	 


}
