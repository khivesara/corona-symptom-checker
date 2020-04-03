package corona;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import corona.content;
import corona.frametwo;
import corona.framethree;
public class cmain {
	public static void main(String args[])
	{
		content c = new content();
		c.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		c.setSize(500, 300);
		c.setBounds(700, 350, 530, 340);
		c.setVisible(true);
		c.button4.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent event) {
						if(c.button1.getBackground()==Color.BLUE || c.button2.getBackground()==Color.BLUE || c.button3.getBackground()==Color.BLUE)
						{	
							frametwo t = new frametwo();
							t.setVisible(true);
							t.setBounds(700, 350, 530, 340);
							System.out.println(corona.content.count);
							c.setVisible(false);
						}
						else {
							c.button4.setEnabled(false);
						}
					}
		}
		);
		System.out.println(corona.content.count);
	}
}
