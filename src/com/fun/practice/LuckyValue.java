package com.fun.practice;

import javax.swing.JOptionPane;

public class LuckyValue {
	static int score=25;
	

	public void score() 
	{
	 SetterandGetter set=  new SetterandGetter();
		int x=set.getDi();
		int luck=set.getUr();
		System.out.println("x="+x+"luck="+luck);
		
		if(luck==x)
		{
			if(luck==7){
			score+=10;
			}
			else{
				score+=5;
			}
		}
		else{
			
			if(luck!=0){
			score-=5;
			
			}
		}
		if (score>=50)
		{
			JOptionPane.showMessageDialog(null, "Congrats. you won");
			 System.exit(0);
		}
		if (score<=0){
			
		JOptionPane.showMessageDialog(null, "Bad luck...! ur score is zero.Try again");
	          System.exit(0);
	
		}
		  trying();
		  System.out.println("score is : "+score);
	}

	public int trying(){
		Scoregetter moon=new Scoregetter();
		moon.setSc(score);
		return score;
	}
}
