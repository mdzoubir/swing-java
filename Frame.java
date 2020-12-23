import java.awt.*;

import javax.swing.*;


public class Frame extends JFrame{
	JPanel panel;
	JFrame  frame;
	Container c;
	JButton button;
	JLabel label;
	JLabel label2;
	JLabel label3;
	Frame(){
		frame= new JFrame();
		frame.setVisible(true);
		frame.setSize(500,500);
		frame.setLayout(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		c=frame.getContentPane();
		panel = new JPanel();
		c.add(panel);
		c.setLayout(new GridLayout(1,1));
		panel.setLayout(new BorderLayout());
		panel.setBorder(BorderFactory.createEmptyBorder(25, 25, 25, 25));
		panel.setBackground(Color.red);
		
		//text
		label3 = new JLabel();
		label3.setText("Le saviez-vous?");
		panel.add(BorderLayout.NORTH ,label3);
		label3.setFont(new Font("Comic Sans MS" , Font.PLAIN , 19));
		
		//button
		button = new JButton();
		button.setText("MONTRER UN AUTRE FAIT");
		button.setFont(new Font("Verdana", Font.BOLD, 15));
		panel.add(BorderLayout.SOUTH, button);
		
		
	}
	
}
