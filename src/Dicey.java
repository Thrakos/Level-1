import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Dicey implements ActionListener {
	
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button = new JButton();
	Random random = new Random();
	
	public static void main(String[] args) {
		Dicey d = new Dicey();
		d.makeButton();
	}
	public void makeButton(){
		frame.add(panel);
		panel.add(button);
		button.setText("Roll");
		button.addActionListener(this);
		frame.setVisible(true);
		frame.pack();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		int x = random.nextInt(6) + 1;
		JOptionPane.showMessageDialog(null, x);
	}
	
}
