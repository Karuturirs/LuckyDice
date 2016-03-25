package com.fun.practice;


import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import javax.swing.border.TitledBorder;



class RollDicePanel extends JPanel{
	
	 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	Runnable r;

	private Die _left; 

	private Die _right;
    //SendPlay _play;
	RollDicePanel()
	{

		_left = new Die();

		_right = new Die();
		
      
	
		

	JButton rollButton = new JButton("Roll");

	rollButton.setFont(new Font("Sansserif", Font.PLAIN, 24));

	rollButton.addActionListener(new RollListener());

	JPanel dicePanel = new JPanel();

	dicePanel.setLayout(new GridLayout(1, 2, 4, 0));

	dicePanel.add(_left);

	dicePanel.add(_right);
	
  
	this.setLayout(new BorderLayout());

	this.add(rollButton, BorderLayout.NORTH);

	this.add(dicePanel , BorderLayout.CENTER);
	
	
	}
	public class RollListener extends JPanel implements ActionListener {

	/**
		 * 
		 */
		private static final long serialVersionUID = 1L;

	public void actionPerformed(ActionEvent e) {
		
		 Runnable r = new Runnable(){    
             public void run() {   
                 try {   
                     Thread.sleep( 2000 );   
                 }   
                 catch ( InterruptedException x ) {   
                     x.printStackTrace();   
                 }   
             }   
         };
         GetFrame GF=new GetFrame();
         JFrame jf=GF.getWindow();
		
		new ProcessingDialog( jf, "Roll", true, r );
		
	    

		 int _leftco= _left.roll();
		 int _rightco=_right.roll();
	         
		 Start st=new Start();
		 st.randomSum(_leftco,_rightco);
    
		 LuckyValue val=new LuckyValue();
		 val.score();
		 int x=val.trying();
		 System.out.println(x);
		
		 SetterandGetter st1=new SetterandGetter();
	     String str=st1.getStr().toUpperCase();

		 JOptionPane.showMessageDialog(null,"Hello "+ str +"\n your score is: "+x);

     
		}

	}
	public Component trying(){
		JPanel scorepanel = new JPanel();
		
		scorepanel.setBorder(new TitledBorder(""));
		
		JLabel label1 = new JLabel();
		
	
		label1.setText("ravisankar.k@polaris.co.in");
		
		scorepanel.add(label1,BorderLayout.CENTER);
		return scorepanel;
	}

}
