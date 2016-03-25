package com.fun.practice;

import javax.swing.*;

import java.awt.Toolkit;
import java.awt.event.*;
public class WelcomeNote extends JFrame {
	


	  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	WelcomeNote(){
		 
	 final   JFrame frame = new JFrame("Lucky Dice Welcomes You");
	   frame.setLocationRelativeTo(null);
	    frame.setIconImage(Toolkit.getDefaultToolkit().getImage("imag5.JPG"));
	    JButton button = new JButton("Name");
	    button.addActionListener(new ActionListener(){
	      public void actionPerformed(ActionEvent ae){
	    	  frame.setVisible(false);
	        String str = JOptionPane.showInputDialog(null, "Your good name pls : ", 
	"lucky", 1);
	       
	        if(str != null){
	        	
	          JOptionPane.showMessageDialog(null, "Welcome " + str.toUpperCase(), 
	"lucky", 1);
	       
	        }
	        else
	          JOptionPane.showMessageDialog(null, "You pressed cancel button.", 
	"lucky", 1);
                SetterandGetter st1=new SetterandGetter();
                      st1.setStr(str);
                    //  System.out.println(str);
	      }
	     
	    });
	    
	    JPanel panel = new JPanel();
	    panel.add(button);
	    frame.add(panel);
	  frame.setSize(280,100);
	  frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	    frame.setVisible(true);
	  }
	
   
}
