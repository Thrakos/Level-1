import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class RandomNumber{
	
	JFrame frame = new JFrame();
	JPanel panel =  new JPanel();
	JButton button = new JButton();
	
	Random rand = new Random();
	
	int number = 0;
	int timesPressed = 0;
	
	public static void main(String[] args) {
		RandomNumber rn = new RandomNumber();
		rn.setup();
	}
	
	void setup(){
		frame.add(panel);
		panel.add(button);
		button.addActionListener((e)->{
			number = rand.nextInt(101);
			timesPressed += 1;
			JOptionPane.showMessageDialog(null, number + ". That's so cool, right? You've pressed this button " + timesPressed + " times.");
		});
		frame.setVisible(true);
		button.setText("RANDOM NUMBER OMG SO COOOOLLLLL!!!!!!!!");
		frame.pack();
	}

}
