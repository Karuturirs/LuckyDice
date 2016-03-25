package com.fun.practice;
import java.awt.AWTException;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;


import java.awt.Toolkit;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


import javax.swing.ButtonGroup;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

public class SwingLayout extends JFrame{
    
	private static final long serialVersionUID = 1L;
	JLabel msgLabel,msg;
    int i=0;
  public SwingLayout() throws AWTException
  {
	  super("ravisankar.k@polaris.co.in");
	

	  setIconImage(Toolkit.getDefaultToolkit().getImage("imag5.JPG"));
	  setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
	  addWindowListener(new WindowAdapter()
	  {
		  	public void windowClosing(WindowEvent e)
		  	{
		  		System.exit(0);
		  	}
        });
        
 
            JPanel buttonPanel = new JPanel();
            buttonPanel.setBorder(new TitledBorder("Select sum of Dice"));
            final ButtonGroup entreeGroup = new ButtonGroup();
            buttonPanel.setLayout(new GridLayout(0, 1));
          
            JRadioButton radioButton;
            buttonPanel.add(radioButton = new JRadioButton("<7 (+5points or -5)"));
            radioButton.setActionCommand("6");
            entreeGroup.add(radioButton);
            buttonPanel.add(radioButton = new JRadioButton("==7 (+10points or -5)"));
            radioButton.setActionCommand("7");
            entreeGroup.add(radioButton);
            buttonPanel.add(radioButton = new JRadioButton(">7 (+5points or -5)"));
            radioButton.setActionCommand("8");
            entreeGroup.add(radioButton);
          
            
            JButton orderButton = new JButton("Submit");
            buttonPanel.add(orderButton);
          
            orderButton.addActionListener(new ActionListener() {
            	
                public void actionPerformed(ActionEvent ae) {
                try{
                	 System.out.println(" submitted ");
                 String entree =entreeGroup.getSelection().getActionCommand();
                 int t=Integer.parseInt(entree);      
                 SetterandGetter set=  new SetterandGetter();
                 set.setUr(t);
                 
                 }
            	 
                catch(Exception ex){
                	JOptionPane.showMessageDialog(null, "please select a value and submit" +
                			"and press Roll"); 
               	System.err.print("please select the sum\n");
               }
               
            	if(i==0){
            		new WelcomeNote();
            	
            	}
                i++;
               
                }
              });
           
            
           
              JPanel startpanel = new JPanel();
              startpanel.setBorder(new TitledBorder(""));
             

              msgLabel = new JLabel();
             msgLabel.setText("Score starts from 25. Be \"THE LUCKY\" by scoring 50. ");
             msgLabel.setFont(new Font("Bold", Font.CENTER_BASELINE, 10));
             msgLabel.setForeground(Color.blue);
              startpanel.add(msgLabel);
              
              
              JPanel start = new JPanel();
             // start.setBorder(new TitledBorder(""));
              msg = new JLabel();
             msg.setText(" Lucky Dice");
            msg.setFont(new Font("Courier New", Font.BOLD, 20));
             msg.setForeground(Color.red);

             
              start.add(msg);
             // msgLabel.setText(" ravisankar.k@polaris.co.in");
            //  startpanel.add(msgLabel);
             
              JPanel DIESpanel = new JPanel();
              DIESpanel.setBorder(new TitledBorder("Dice"));
              Dice dc=new Dice();
           
              DIESpanel.add(dc,BorderLayout.CENTER);
              
              JPanel p = new JPanel(new BorderLayout());
              p.setBorder(new EmptyBorder(20, 20, 20, 20));
              p.add(start, BorderLayout.NORTH);
              p.add(buttonPanel, BorderLayout.AFTER_LINE_ENDS);
              p.add(startpanel, BorderLayout.AFTER_LAST_LINE);
            
              p.add(DIESpanel, BorderLayout.CENTER);
        	  setResizable(false);
              setContentPane(p);
              pack();
              setVisible(true);
        	  

  }
 
  public static void main(String[] args) throws AWTException{
	 
		  
	  LuckyValue lt=  new LuckyValue();
	   new SwingLayout().setLocationRelativeTo(null);
	   System.out.println(lt);
	  

    }


} 