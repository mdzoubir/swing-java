import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JLabel;


public class Text extends Frame implements ActionListener{
	
	ArrayList<String> listMessage = new ArrayList<>();
	ArrayList<Color> color = new ArrayList<>();
	Text(){
		//text
		listMessage.add("Etre amoureux vous rend fainéant");
		listMessage.add("La biére ne fait pas prendre du vente");
		listMessage.add("Le muscle le plus puissant de corps est la langue");
		listMessage.add("L’ARBRE DU KIWI EST APPELÉ L’ACTINIDIA");
		//color
		color.add(Color.red);
		color.add(Color.black);
		color.add(Color.cyan);
		color.add(Color.darkGray);
		color.add(Color.green);
		color.add(Color.blue);
		color.add(Color.magenta);
		
		
		button.addActionListener(this);
		
		label2 = new JLabel("Etre amoureux vous rend fainéant");
		panel.add(BorderLayout.CENTER ,label2);
		label2.setFont(new Font("Comic Sans MS" , Font.PLAIN , 19));
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		Random rand = new Random();
	    int randomIndex = rand.nextInt(listMessage.size());
	    String randomElement = listMessage.get(randomIndex);
		label2.setText(randomElement);
		panel.add(BorderLayout.CENTER ,label2);
		
		
		int randomX = rand.nextInt(color.size());
	    Color randomE = color.get(randomX);
	    panel.setBackground(randomE);
	    button.setForeground(randomE);
	    
	    c.setBackground(randomE);
		
	}
}
