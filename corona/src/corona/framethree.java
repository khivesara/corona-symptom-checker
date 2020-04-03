package corona;

import javax.swing.*;
import java.awt.*;
import javax.swing.event.*;
import java.awt.event.*;
import corona.content;
import corona.frametwo;
public class framethree extends JFrame{
	JButton button21;
	JButton button22;
public JButton button23;
	JButton button24;
	JButton button25;
	JLabel win3;
	Color defcolor = UIManager.getColor ( "Panel.background" );
	public framethree() {
		super("Diseasecheck");
		setLayout(null);
		button21 = new JButton("Yes");
		win3 = new JLabel("Did you or any of your family member travel across countries in recent?");
		button22 = new JButton("No");
		button23 = new JButton("Next");
		win3.setBounds(60, 40, 500, 30);
		button21.setBounds(150, 95, 100, 20);
		button22.setBounds(150, 125, 100, 20);
		button23.setBounds(360, 190, 70, 20);
		add(button21);
		add(win3);
		add(button22);
		add(button23);
		button21.addActionListener(
				new ActionListener() {
					private int flag;
			public void actionPerformed(ActionEvent event) {
				if(this.flag%2!=0) {
					button21.setBackground(defcolor); 	
				}
				else if(button22.getBackground()==Color.BLUE && this.flag%2==0)
				{	
					button22.setBackground(defcolor);
					button21.setBackground(Color.BLUE);
					corona.content.count+=3;
					button21.setEnabled(false);
					button22.setEnabled(true);		
				}	
				else if(this.flag%2==0) {
					corona.content.count+=3;
					button21.setBackground(Color.BLUE);
					button21.setEnabled(false);
				}
			}
				}
		);
		button22.addActionListener(
				new ActionListener() {
					private	int flag;
			public void actionPerformed(ActionEvent event) {
				if(this.flag%2!=0) {
					button22.setBackground(defcolor);
				}
				else if(button21.getBackground()==Color.BLUE && this.flag%2==0)
				{ 
					button22.setBackground(Color.BLUE);
					button22.setEnabled(false);
					button21.setEnabled(true);
					button21.setBackground(defcolor);
					corona.content.count-=3;
				}
				else if(this.flag%2==0){
					button22.setBackground(Color.BLUE);
					button22.setEnabled(false);
				}
			}	
				}
		);
		button23.addActionListener(
				new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				framethree.this.setVisible(false);
				frameinter e = new frameinter();
				e.setVisible(true);
				e.setBounds(700, 350, 530, 340);
				System.out.println(corona.content.count);
			}
				}
		);
	}
}

		
		