package com.fun.practice;


import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.util.Random;

import javax.swing.JPanel;

class Die extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int _value; // value that shows on face of die

	private int _diam = 9; // Diameter of spots

	private static Random random = new Random(); // random generator

	public Die() {

	setBackground(Color.RED);

	setPreferredSize(new Dimension(100,100));

	roll();

	}
	
   
	public int roll() {

	int val = random.nextInt(6) + 1; // Range 1-6

	setValue(val);

	return val;

	}

	public int getValue() {

	return _value;

	}

	public void setValue(int spots) {

	_value = spots;

	repaint(); // Value has changed, must repaint

	}
	public void paintComponent(Graphics g) {

	super.paintComponent(g); // required

	int w = getWidth();

	int h = getHeight(); // should use to resize spots too.

	switch (_value) {

	case 1: drawSpot(g, w/2, h/2);

	break;

	case 3: drawSpot(g, w/2, h/2);

	case 2: drawSpot(g, w/4, h/4);

	drawSpot(g, 3*w/4, 3*h/4);

	break;

	case 5: drawSpot(g, w/2, h/2);

	case 4: drawSpot(g, w/4, h/4);

	drawSpot(g, 3*w/4, 3*h/4);

	drawSpot(g, 3*w/4, h/4);

	drawSpot(g, w/4, 3*h/4);

	break;

	case 6: drawSpot(g, w/4, h/4);

	drawSpot(g, 3*w/4, 3*h/4);

	drawSpot(g, 3*w/4, h/4);

	drawSpot(g, w/4, 3*h/4);

	drawSpot(g, w/4, h/2);

	drawSpot(g, 3*w/4, h/2);

	break;

	}

	}

	private void drawSpot(Graphics g, int x, int y) {

	g.fillOval(x-_diam/2, y-_diam/2, _diam, _diam);

	}
	
	}

	