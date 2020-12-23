package saviez_vous;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Frame implements ActionListener{
	
	JPanel panel;
	JFrame  frame;
	JButton button;
	JLabel label;
	JLabel label2;
	JLabel label3;
	ArrayList<String> listMessage = new ArrayList<>();
	ArrayList<Color> color = new ArrayList<>();
	Frame(){
		panel = new JPanel();
		frame = new JFrame();
		frame.setVisible(true);
		frame.setSize(500,500);
		frame.setLayout(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		panel.setBounds(25, 25, 420, 400);
		frame.add(panel);
		//panel.setBackground(Color.black);
		panel.setLayout(new BorderLayout());
		
		
		
		//text
		listMessage.add("Etre amoureux vous rend fainéant");
		listMessage.add("La biére ne fait pas prendre du vente");
		listMessage.add("Le muscle le plus puissant de corps est la langue");
		listMessage.add("L’ARBRE DU KIWI EST APPELÉ L’ACTINIDIA");
		
		
		//title
		
		label3 = new JLabel();
		label3.setText("Le saviez-vous?");
		panel.add(BorderLayout.NORTH ,label3);
		label3.setFont(new Font("Comic Sans MS" , Font.PLAIN , 19));
		//button
		
		
		button = new JButton();
		button.setText("MONTRER UN AUTRE FAIT");
		button.setFont(new Font("Verdana", Font.BOLD, 15));
		panel.add(BorderLayout.SOUTH, button);
		button.addActionListener(this);
		
		
		label2 = new JLabel("Etre amoureux vous rend fainéant");
		panel.add(BorderLayout.CENTER ,label2);
		label2.setFont(new Font("Comic Sans MS" , Font.PLAIN , 19));
		
		
		
		color.add(Color.red);
		color.add(Color.black);
		color.add(Color.cyan);
		color.add(Color.darkGray);
		color.add(Color.green);
		
		panel.setBackground(Color.blue);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Random rand = new Random();
	    int randomIndex = rand.nextInt(listMessage.size());
	    String randomElement = listMessage.get(randomIndex);
		label2.setText(randomElement);
		panel.add(BorderLayout.CENTER ,label2);
		
		
		//color
		int randomX = rand.nextInt(color.size());
	    Color randomE = color.get(randomX);
	    frame.setBackground(randomE);
	}
}
