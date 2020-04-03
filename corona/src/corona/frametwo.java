package corona;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
import javax.swing.*;
import corona.content;

public class frametwo extends JFrame {
	//JOptionPane.showMessageDialog(null, count);
	public JButton button11;
	public JButton button12;
	public JButton button13;
	JButton button14;
	JButton button15;
	JLabel win2;
	JLabel win22;
	Color defcolor = UIManager.getColor ( "Panel.background" );
		public frametwo() {
			super("Diseasecheck");
			setLayout(null);
			button11 = new JButton("Yes");
			win2 = new JLabel("Did you or any of your family member travel to nearby cities  ");
			win22 = new JLabel("using Public Transport?");
			button12 = new JButton("No");
			button13 = new JButton("Next");
			win2.setBounds(50, 40, 500, 30);
			win22.setBounds(50, 60, 500, 30);
			button11.setBounds(150, 98, 100, 20);
			button12.setBounds(150, 129, 100, 20);
			button13.setBounds(360, 190, 70, 20);
			add(button11);
			add(win2);
			add(button12);
			add(button13);
			add(win22);
			button11.addActionListener(
					new ActionListener() {
						private int flag; 
				public void actionPerformed(ActionEvent event) {
					if(this.flag%2!=0) {
						button11.setBackground(defcolor);
					}
					else if(button12.getBackground()==Color.BLUE && this.flag%2==0)
					{	
						button12.setBackground(defcolor);
						button11.setBackground(Color.BLUE);
						corona.content.count+=1;
						button11.setEnabled(false);
						button12.setEnabled(true);
					}
					else if(this.flag%2==0) {
						corona.content.count+=1;
						button11.setBackground(Color.BLUE);
						button11.setEnabled(false);
					}
				}			
					}
			);
			button12.addActionListener(
					new ActionListener() {
						private int flag;
				public void actionPerformed(ActionEvent event) { 
					if(this.flag%2!=0) {
						button12.setBackground(defcolor);
					}
					else if(button11.getBackground()==Color.BLUE && this.flag%2==0)
					{ 
						button12.setBackground(Color.BLUE);
						button12.setEnabled(false);
						button11.setEnabled(true);
						button11.setBackground(defcolor);
						corona.content.count--;	
					}
					else if(this.flag%2==0){
						button12.setBackground(Color.BLUE);
						button12.setEnabled(false);
					}
				}
					}
			);
			button13.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent event) {
					frametwo.this.setVisible(false);
					framethree e = new framethree();
					e.setVisible(true);
					e.setBounds(700, 350, 530, 340);
					System.out.println(corona.content.count);
				}
			}
			);
		}
}
