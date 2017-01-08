import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ChuckleClicker implements ActionListener {

	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton joke = new JButton();
	JButton punchline = new JButton();

	public static void main(String[] args) {
		ChuckleClicker c = new ChuckleClicker();
		c.makeButtons();
	}

	public void makeButtons() {
		frame.add(panel);
		frame.setVisible(true);
		joke.setText("Joke");
		punchline.setText("Punchline");
		panel.add(joke);
		panel.add(punchline);
		frame.pack();
		joke.addActionListener(this);
		punchline.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == joke) {
			JOptionPane.showMessageDialog(null, "Why did the scarecrow win the Nobel Peace Prize?");
		}
		if (e.getSource() == punchline) {
			JOptionPane.showMessageDialog(null, "Because he was out standing in his field");
		}

	}
}
