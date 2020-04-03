package corona;
import javax.swing.*;
import java.awt.*;
import javax.swing.event.*;
import java.awt.event.*;
import corona.content;
import corona.frametwo;
import corona.framethree;

public class frameinter extends JFrame {
	JButton button41;
	JButton button42;
public JButton button43;
	JButton button44;
	JButton button45;
	JButton button46;
	JButton button47;
	JButton button48;
	JLabel win5; 
	Color defcolor = UIManager.getColor ( "Panel.background" );
	
	public frameinter() {
		super("Diseasecheck");
		setLayout(null);
		button41 = new JButton("Dififculty in breathing");
		win5 = new JLabel("Do you have any of the following health conditions?");
		button42 = new JButton("Asthma");
		button43 = new JButton("Diabetes");
		button44 = new JButton("Lung Diseases / issues");
		button45 = new JButton("Pregnancy");
		button46 = new JButton("Severe Health issues relating to above");
		button47 = new JButton("Other / None");
		button48 = new JButton("Next");
		win5.setBounds(120, 40, 500, 30);
		button41.setBounds(150, 80, 180, 20);
		button42.setBounds(150, 110, 100, 20);
		button43.setBounds(150, 140, 100, 20);
		button44.setBounds(150, 170, 180, 20);
		button45.setBounds(150, 200, 100, 20);
		button46.setBounds(150, 230, 255, 20);
		button47.setBounds(150, 260, 110, 20);
		button48.setBounds(375, 265, 70, 20);
		add(button41);
		add(win5);
		add(button42);
		add(button43);
		add(button44);
		add(button45);
		add(button46);
		add(button47);
		add(button48);
	
		button41.addActionListener(
				new ActionListener() {
			private int flag;
			public void actionPerformed(ActionEvent event) {
				if(this.flag%2!=0) {
					button41.setBackground(defcolor);
					corona.content.count--; 
					flag++;
				}
				else 
				{	corona.content.count+=1; 
					button41.setBackground(Color.BLUE);
					flag--;
				}			 
			}
				}
		);
		button42.addActionListener(
				new ActionListener() {
			private int flag;
			public void actionPerformed(ActionEvent event) {
				if(this.flag%2!=0) {
					button42.setBackground(defcolor);
					corona.content.count--; 
					flag++;
				}
				else 
				{	corona.content.count+=1; 
					button42.setBackground(Color.BLUE);
					flag--;
				}	
			}
				}
		);
		button43.addActionListener(
				new ActionListener() {
					private int flag;
			public void actionPerformed(ActionEvent event) {
				if(this.flag%2!=0) {
					button43.setBackground(defcolor);
					corona.content.count--; 
					flag++;
				}
				else 
				{	corona.content.count+=1; 
					button43.setBackground(Color.BLUE);
					flag--;
				}
			}		
				}
		);
		button44.addActionListener(
				new ActionListener() {
					private int flag;
			public void actionPerformed(ActionEvent event) {
				if(this.flag%2!=0) {
					button44.setBackground(defcolor);
					corona.content.count--; 
					flag++;
				}
				else 
				{	corona.content.count+=1; 
					button44.setBackground(Color.BLUE);
					flag--;
				}
			}	
				}
		);
		button45.addActionListener(
				new ActionListener() {
					private int flag;
			public void actionPerformed(ActionEvent event) {
				if(this.flag%2!=0) {
					button45.setBackground(defcolor);
					corona.content.count--; 
					flag++;
				}
				else 
				{	corona.content.count+=1; 
					button45.setBackground(Color.BLUE);
					flag--;
				}
			}
		}
		);
		button46.addActionListener(
				new ActionListener() {
					private int flag;
			public void actionPerformed(ActionEvent event) {
				if(this.flag%2!=0) {
					button46.setBackground(defcolor);
					corona.content.count--; 
					flag++;
				}
				else 
				{	corona.content.count+=1; 
					button46.setBackground(Color.BLUE);
					flag--;
				}
			}	
				}
		);
		button47.addActionListener(
				new ActionListener() {
					private int flag;
			public void actionPerformed(ActionEvent event) {
				if(this.flag%2!=0) {
					button47.setBackground(defcolor);
					flag++;
				}
				else 
				{	
					button47.setBackground(Color.BLUE);
					flag--;
				}
				
				System.out.println(corona.content.count);	//Wherever this is found, it isn't a problematic thing. It is just for my convenience. 
			}
				}
		);
		button48.addActionListener(
				new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				frameinter.this.setVisible(false);
				framefour f = new framefour();
				f.setVisible(true);
				f.setBounds(700, 350, 530, 340);
				System.out.println(corona.content.count);
			}
				}
		);
	}
}
