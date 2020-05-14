package com.fun.practice;

import javax.swing.JOptionPane;

public class SetterandGetter {
	 static int ur;
	static int di;
	  static String str="Lucky";

	public String getStr() {
		return str;
	}
	public void setStr(String str) {
	   if(str==null){
		   SetterandGetter.str="Lucky";
	   }
	   else
		SetterandGetter.str = str;
		
	}
	public int getUr() {
		
		if(ur==0){
			JOptionPane.showMessageDialog(null, "please select a value and submit");
			
		}
		return ur;
	}
	public void setUr(int ur) {
		
		SetterandGetter.ur = ur;
		
	}
	public int getDi() {
		
		return di;
	}
	public void setDi(int di) {
		
		SetterandGetter.di = di;
	}
	}
