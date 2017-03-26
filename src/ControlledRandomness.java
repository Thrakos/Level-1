import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ControlledRandomness implements ActionListener {
	
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton redB = new JButton();
	JButton greenB = new JButton();
	JButton blueB = new JButton();
	JButton yellowB = new JButton();
	
	int buttonPressed;
	
	int displayState = 0;
	int getInputState = 1;
	int currentState = displayState;
	
	Random rand = new Random();
	int num = 0;
	String numbers = "";
	
	public static void main(String[] args) {
		
		ControlledRandomness cr = new ControlledRandomness();
		
		cr.setup();

	}
	
	void setup(){
		
		redB.setOpaque(true);
		greenB.setOpaque(true);
		blueB.setOpaque(true);
		yellowB.setOpaque(true);
		
		frame.add(panel);
		frame.setVisible(true);
		panel.setOpaque(true);
		panel.setBackground(Color.white);
		panel.add(redB);
		panel.add(greenB);
		panel.add(blueB);
		panel.add(yellowB);
		
		redB.setBackground(Color.white);
		greenB.setBackground(Color.white);
		blueB.setBackground(Color.white);
		yellowB.setBackground(Color.white);
		
		redB.addActionListener(this);
		greenB.addActionListener(this);
		blueB.addActionListener(this);
		yellowB.addActionListener(this);

		frame.pack();
		
		showSequence();
		
	}
	
	void showSequence(){
		for (int i = 0; i < 10; i++) {
			num = rand.nextInt(4);
			numbers += num;
			System.out.println(numbers);
			lightButton(num);
			currentState = getInputState;
		}
		}
	
	void lightButton(int i){
		if (i == 0) {
			redB.setBackground(Color.red);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			redB.setBackground(Color.white);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		if (i == 1) {
			greenB.setBackground(Color.green);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			greenB.setBackground(Color.white);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		if (i == 2) {
			blueB.setBackground(Color.blue);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			blueB.setBackground(Color.white);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		if (i == 3) {
			yellowB.setBackground(Color.yellow);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			yellowB.setBackground(Color.white);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == redB) {
			buttonPressed = 0;
		}
		if (e.getSource() == greenB) {
			buttonPressed = 1;
		}
		if (e.getSource() == blueB) {
			buttonPressed = 2;
		}
		if (e.getSource() == yellowB) {
			buttonPressed = 3;
		}
		
	}
	
}
