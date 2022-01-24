import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class N1 extends JFrame implements ActionListener
{
		JLabel l1;
		 
		JButton b1,b2,b3,b4; 
		JPanel p1;
		
	public N1()
	{
		super(" Page-1 ");
		this.setSize(600,550);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		p1 = new JPanel();
		p1.setSize(new Dimension(400,350));
		p1.setBackground(Color.gray);
		p1.setLayout(null);
		
		l1 = new JLabel("AFTER RUNNING THE PROGRAM THERE WILL BE THREE OPTIONS ");
		l1.setFont(new Font("Serif",Font.BOLD,15));
		l1.setForeground(Color.black);
		l1.setBounds(30,30,550,50);
		p1.add(l1);
		 
		
		b1 = new JButton("Log In");
		b1.setFont(new Font("Comic Sans MS",Font.BOLD,20));
		b1.setForeground(Color.white);
		b1.setBackground(Color.red);
		b1.setBounds(60,120,100,75);
		b1.addActionListener(this);
		p1.add(b1);

		
		b2 = new JButton("Registration");
		b2.setFont(new Font("Comic Sans MS",Font.BOLD,20));
		b2.setForeground(Color.white);
		b2.setBackground(Color.green);
		b2.setBounds(190,120,180,75);
		b2.addActionListener(this); 
		p1.add(b2);	
		
		b3 = new JButton("Exit");
		b3.setFont(new Font("Comic Sans MS",Font.BOLD,20));
		b3.setForeground(Color.white);
		b3.setBackground(Color.black);
		b3.setBounds(380,120,100,75);
		b3.addActionListener(this); 
		p1.add(b3);


        b4 = new JButton("Back");
		b4.setFont(new Font("Comic Sans MS",Font.BOLD,20));
		b4.setForeground(Color.red);
		b4.setBackground(Color.green);
		b4.setBounds(450,400,80,30);
		b4.addActionListener(this); 
		p1.add(b4);		
		
        this.add(p1);		
        
	}
	
	
		public void actionPerformed(ActionEvent ae)
		{
			if(ae.getSource()==b1)
			{
			 
			}
			else if(ae.getSource()==b2)
			{
                N3 f3 = new N3();
				this.setVisible(false);
				f3.setVisible(true);
			}
			else if(ae.getSource()==b3)
			{
                //F31 f3 = new F31();
				//this.setVisible(false);
				//f3.setVisible(true);  
			}
			else if(ae.getSource()==b4)
			{
                N f3 = new N();
				this.setVisible(false);
				f3.setVisible(true);   
			}
		}
 


}














