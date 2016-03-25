package com.fun.practice;



public class Start  {

public int randomSum(int x,int y) {
	
	
		int a=x;
		int b=y;
			
	int c=a+b;
	System.out.println("Dice sum is :"+c);
	if(c==7)
	{
		
	  	
	}
	
	else if(c<7)
	{
		c=6;
		
	}
	else
	{
		c=8;
		
	}
	 SetterandGetter set=  new SetterandGetter();
	 set.setDi(c);
	return c;

	}

	

}
