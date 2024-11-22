package com.gsv.gui;

import java.awt.Color;
import java.awt.Container;

import javax.swing.JList;

public class ColorList {

	JList list;
	String[] listColorNames= {"J3SE","J2EE","struts","Hibernate","Spring"};
	Color[] listColorValues= {Color.CYAN, Color.BLUE, Color.green, Color.YELLOW, Color.WHITE};
	Container contentpane;
	ColorList()
	{
       super("Different Color List");
       contentpane=getContentPane();
       

		
		
	}
	
	
}
