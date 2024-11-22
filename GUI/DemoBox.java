import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;

public class DemoBox  extends JFrame implements ItemListener
{
   public static void main(String[] args) 
   {
	   DemoBox db  = new DemoBox();
	   db.setVisible(true);
	   db.setSize(1000, 1000);
	   db.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }
   
   JCheckBox cb1,cb2;
   JRadioButton jb1,jb2;
   ButtonGroup bg;
   JTextArea jta;
   Container c=null; 
   public DemoBox() 
   {
	  setLayout(new FlowLayout()); 
	 cb1 = new JCheckBox("JAVA");
	 cb2 = new JCheckBox("Python");
	 jb1  = new JRadioButton("C",true);
	 jb2  = new JRadioButton("CPP",false);
	 bg  = new ButtonGroup();
	 bg.add(jb1);
	 bg.add(jb2);
	 jta  = new JTextArea(5,5);
	 jta.setBackground(Color.white);
     jta.setForeground(Color.black);
     cb1.setForeground(Color.RED);
     cb2.setForeground(Color.RED);
	 c  = getContentPane();
	 
	 c.add(cb1);
	 c.add(cb2);
	 c.add(jb1);
	 c.add(jb2);
	 c.add(jta);
	 cb1.addItemListener(this);
	 cb2.addItemListener(this);
	 jb1.addItemListener(this);
	 jb2.addItemListener(this);
   }
	@Override
	public void itemStateChanged(ItemEvent e) 
	{
		String msg="";
		// TODO Auto-generated method stub
		if(cb1.isSelected())
		{
			msg  = msg +"\n"+cb1.getText();
		}
		if(cb2.isSelected())
		{
			msg  = msg +"\n"+cb2.getText();
		}
		jta.setText(msg);
		msg="Thanks for filling the box";
		
		
	}
} 

