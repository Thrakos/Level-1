import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class NumberFun implements ActionListener {
	
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton add = new JButton();
	JButton subtract = new JButton();
	JButton random = new JButton();
	JLabel num = new JLabel();
	int number = 5;
	Random rand = new Random();
	
	public static void main(String[] args) {
		
		NumberFun number = new NumberFun();
		number.setup();
		
	}
	public void setup(){
		
		frame.add(panel);
		panel.add(add);
		panel.add(subtract);
		panel.add(random);
		panel.add(num);
		add.setText("Add");
		subtract.setText("Subtract");
		random.setText("Randomize");
		num.setText("" + number);
		frame.setVisible(true);
		frame.pack();
		
		add.addActionListener(this);
		subtract.addActionListener(this);
		random.addActionListener(this);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == add){
			number += 1;
		}
		if(e.getSource() == subtract){
			number -= 1;
		}
		if(e.getSource() == random){
			number = rand.nextInt(10000);
		}
		num.setText("" + number);
		frame.pack();
	}
}
