package corona;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;
public class content extends JFrame{
	public JButton button1;
	public JButton button2;
	public JButton button3;
	public JButton button4;
	public JButton button5;
	private JLabel win1;
	private JLabel show;
	public static int count=0;
	Color defcolor = UIManager.getColor ( "Panel.background" );
	
	public content() {
		super("Diseasecheck");
		setLayout(null);
		win1 = new JLabel("What is your age group?");
		button1 = new JButton("Below 15");
		button1.setBounds(150, 70, 100, 20);
		button2 = new JButton ("16 - 50");
		button3 = new JButton ("Above 51");
		button4 = new JButton("Next");
		win1.setBounds(130, 40, 300, 20);
		button2.setBounds(150, 100, 100, 20);
		button3.setBounds(150, 130, 100, 20);
		button4.setBounds(360, 190, 70, 20);
		add(win1);
		add(button1);
		add(button2);
		add(button3);
		add(button4);
		thehandler handler = new thehandler();
		button1.addActionListener(handler);
		button2.addActionListener(handler);
		button3.addActionListener(handler);
		button4.addActionListener(handler);
	}
	private class thehandler implements ActionListener{
		public void actionPerformed(ActionEvent event) {
			if(event.getSource()==button1) {
				if(button2.getBackground()==Color.BLUE) {
					button1.setBackground(Color.BLUE);
					button1.setEnabled(false);
					button2.setBackground(defcolor);
					button2.setEnabled(true);
					count =1;
				}	
			    else if(button3.getBackground()==Color.BLUE) {
					button1.setBackground(Color.BLUE);
					button1.setEnabled(false);
					button3.setEnabled(true);
					button3.setBackground(defcolor);
					count =1;
			    }
				else {
					button1.setBackground(Color.BLUE);
					button1.setEnabled(false);
					button3.setEnabled(true);
					button2.setEnabled(true);
					count =1;
				}
				button4.setEnabled(true);
			}
			else if(event.getSource()==button2)
			{
				if(button1.getBackground()==Color.BLUE) {
					button2.setBackground(Color.BLUE);
					button2.setEnabled(false);
					button1.setBackground(defcolor);
					button1.setEnabled(true);
					count =0;
				}	
			    else if(button3.getBackground()==Color.BLUE) {
					button2.setBackground(Color.BLUE);
					button2.setEnabled(false);
					button3.setEnabled(true);
					button3.setBackground(defcolor);
					count =0;
				}
				else {
					button2.setBackground(Color.BLUE);
					button2.setEnabled(false);
					button3.setEnabled(true);
					button1.setEnabled(true);
					count =0;
				}
				button4.setEnabled(true);
			}
			else if(event.getSource()==button3)
			{
				if(button1.getBackground()==Color.BLUE) {
					button3.setBackground(Color.BLUE);
					button3.setEnabled(false);
					button1.setEnabled(true);
					button1.setBackground(defcolor);
					count =1;
				}	
			    else if(button2.getBackground()==Color.BLUE) {
					button3.setBackground(Color.BLUE);
					button3.setEnabled(false);
					button2.setEnabled(true);
					button2.setBackground(defcolor);
					count =1;
				}
				else {
					button3.setBackground(Color.BLUE);
					button3.setEnabled(false);
					button2.setEnabled(true);
					button1.setEnabled(true);
					count =1;
				}
				button4.setEnabled(true);
			}
		}
	}
}



	
	
	
