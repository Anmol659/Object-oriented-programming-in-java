package com.gsv.gui;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.dnd.DropTargetContext;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Action;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class ComboBox extends JFrame implements ActionListener {

	JComboBox comboTypesList=null;
	JTextArea jta= null;
	Container c=null;
	
	public ComboBox()
	{
		c= getContentPane();
		String[] comboTypes= {"J2SE","J2EE","struts","Hibernate","spring"};
		comboTypesList= new JComboBox(comboTypes);
		comboTypesList.setSelectedIndex(2);
		jta=new JTextArea(10,20);
		c.setLayout(new FlowLayout());
		c.add(comboTypesList);
		c.add(jta);
		
		comboTypesList.addActionListener(this);
		
		
		
	}
		public static void main(String[] args)
		{
			ComboBox jcb=new ComboBox();
			jcb.setVisible(true);
			jcb.setSize(300,300);
			
		}
	  

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JComboBox jcmbType=(JComboBox)e.getSource();
		String cmbType=(String) jcmbType.getSelectedItem();
		if(cmbType.equals("J2SE"));
		{
			jta.setText(cmbType);
			jta.setBackground(Color.CYAN);
		}
	}
	
	
	
	
	
}
