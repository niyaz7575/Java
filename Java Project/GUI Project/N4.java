import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class N4 extends JFrame implements ActionListener
{
		JLabel l1;
		 
		JButton b1,b2,b3,b4,b5; 
		JPanel p1;
		
	public N4()
	{
		super(" Page-4 ");
		this.setSize(600,550);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		p1 = new JPanel();
		p1.setSize(new Dimension(400,350));
		p1.setBackground(Color.gray);
		p1.setLayout(null);
		
		l1 = new JLabel("AFTER CREATING THE SHOP , WE  SEE THE MENU ");
		l1.setFont(new Font("Serif",Font.BOLD,15));
		l1.setForeground(Color.black);
		l1.setBounds(30,30,550,50);
		p1.add(l1);
		 
		
		b1 = new JButton("ADD PRODUCT");
		b1.setFont(new Font("Comic Sans MS",Font.BOLD,15));
		b1.setForeground(Color.white);
		b1.setBackground(Color.red);
		b1.setBounds(60,120,200,75);
		b1.addActionListener(this);
		p1.add(b1);

		
		b2 = new JButton("SELL");
		b2.setFont(new Font("Comic Sans MS",Font.BOLD,15));
		b2.setForeground(Color.white);
		b2.setBackground(Color.green);
		b2.setBounds(280,120,180,75);
		b2.addActionListener(this); 
		p1.add(b2);	
		
		b3 = new JButton("PRODUCT LIST");
		b3.setFont(new Font("Comic Sans MS",Font.BOLD,15));
		b3.setForeground(Color.black);
		b3.setBackground(Color.yellow);
		b3.setBounds(60,250,200,75);
		b3.addActionListener(this); 
		p1.add(b3);


        b4 = new JButton("EXIT");
		b4.setFont(new Font("Comic Sans MS",Font.BOLD,15));
		b4.setForeground(Color.white);
		b4.setBackground(Color.black);
		b4.setBounds(280,250,180,75);
		b4.addActionListener(this); 
		p1.add(b4);		
		
		
		b5 = new JButton("BACK");
		b5.setFont(new Font("Comic Sans MS",Font.BOLD,15));
		b5.setForeground(Color.red);
		b5.setBackground(Color.green);
		b5.setBounds(450,400,80,30);
		b5.addActionListener(this); 
		p1.add(b5);	
		
        this.add(p1);		
        
	}
	
	
		public void actionPerformed(ActionEvent ae)
		{
			if(ae.getSource()==b1)
			{
			 
			}
			else if(ae.getSource()==b2)
			{
                
			}
			else if(ae.getSource()==b3)
			{
                  
			}
			else if(ae.getSource()==b4)
			{
               
				
			}
			else if(ae.getSource()==b5)
			{
             N3 f = new N3();
		     this.setVisible(false);
			 f.setVisible(true);  
				
			}
		}
 


}
