package corona;
import javax.swing.*;
import java.awt.*;
import javax.swing.event.*;
import java.awt.event.*;
import corona.content;
import corona.frametwo;
import corona.framethree;

public class framefour extends JFrame{
	JButton button31;
	JButton button32;
public JButton button33;
	JButton button34;
	JButton button35;
	JButton button36;
	JButton button37;
	JLabel win4;
	ButtonGroup group; 
	Color defcolor = UIManager.getColor ( "Panel.background" );
	public framefour() {
		super("Diseasecheck");
		setLayout(null);
		button31 = new JButton("Dififculty in breathing");
		win4 = new JLabel("Which of the following symtoms do you have?");
		button32 = new JButton("Cold");
		button33 = new JButton("Dry Cough");
		button34 = new JButton("Fever");
		button35 = new JButton("Body Pains");
		button36 = new JButton("Other / None");
		button37 =new JButton("Submit");
		win4.setBounds(120, 40, 500, 30);
		button31.setBounds(150, 80, 180, 20);
		button32.setBounds(150, 110, 100, 20);
		button33.setBounds(150, 140, 100, 20);
		button34.setBounds(150, 170, 100, 20);
		button35.setBounds(150, 200, 100, 20);
		button36.setBounds(150, 230, 110, 20);
		button37.setBounds(360, 235, 100, 20);
		add(button31);
		add(win4);
		add(button32);
		add(button33);
		add(button34);
		add(button35);
		add(button36);
		add(button37);
		button31.addActionListener(
				new ActionListener() {
					private int flag;
			public void actionPerformed(ActionEvent event) {
					if(this.flag%2!=0) {
					button31.setBackground(defcolor);
					corona.content.count--; 
					flag++;
				}
				else 
				{	corona.content.count+=1; 
					button31.setBackground(Color.BLUE);
					flag--;
				}
			}
				}
		);
		button32.addActionListener(
				new ActionListener() {
					private int flag;
			public void actionPerformed(ActionEvent event) {
				if(this.flag%2!=0) {
					button32.setBackground(defcolor);
					corona.content.count-=2; 
					flag++;
				}
				else 
				{	corona.content.count+=2; 
					button32.setBackground(Color.BLUE);
					flag--;
				}
			}
				}
		);
		button33.addActionListener(
				new ActionListener() {
					private int flag;
			public void actionPerformed(ActionEvent event) { 
				if(this.flag%2!=0) {
					button33.setBackground(defcolor);
					corona.content.count-=2; 
					flag++;
				}
				else 
				{	corona.content.count+=2; 
					button33.setBackground(Color.BLUE);
					flag--;
				}
					}
				}
		);
		button34.addActionListener(
				new ActionListener() {
					private int flag;
			public void actionPerformed(ActionEvent event) {
				if(this.flag%2!=0) {
					button34.setBackground(defcolor);
					corona.content.count-=2; 
					flag++;
				}
				else 
				{	corona.content.count+=2; 
					button34.setBackground(Color.BLUE);
					flag--;
				}
					}		
				}
		);
		button35.addActionListener(
				new ActionListener() {
					private int flag;
			public void actionPerformed(ActionEvent event) { 
				if(this.flag%2!=0) {
					button35.setBackground(defcolor);
					corona.content.count-=2; 
					flag++;
				}
				else 
				{	corona.content.count+=2; 
					button35.setBackground(Color.BLUE);
					flag--;
				}
					}	
				}
		);
		button36.addActionListener(
				new ActionListener() {
					private int flag;
			public void actionPerformed(ActionEvent event) {
				if(this.flag%2!=0) {
					button36.setBackground(defcolor);
					flag++;
				}
				else 
				{	 
					button36.setBackground(Color.BLUE);
					flag--;
				}
				System.out.println(corona.content.count);
					}
				}
		);
		button37.addActionListener(
				new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				System.out.println(corona.content.count);	
			if(corona.content.count==3) { 
		UIManager.put("OptionPane.background", Color.ORANGE);
		UIManager.put("Panel.background", Color.ORANGE);
		JOptionPane.showMessageDialog(null, "HIGHRISK! \n NO SYMPTOMS");
			}
			else if(corona.content.count>=4){
				UIManager.put("OptionPane.background", Color.RED);
				UIManager.put("Panel.background", Color.RED);
				JOptionPane.showMessageDialog(null, "HIGHRISK!  ");
			}
				else {
					UIManager.put("OptionPane.background", Color.WHITE);
					UIManager.put("Panel.background", Color.white);
					JOptionPane.showMessageDialog(null, "LOW RISK!");
				}
			}		
				}
		);

	}
}
