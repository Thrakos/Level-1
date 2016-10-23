import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PigLatinUI implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button = new JButton();
	JTextField textbox1 = new JTextField();
	JTextField textbox2 = new JTextField();
	PigLatinTranslator translator = new PigLatinTranslator();

	public static void main(String[] args) {
		PigLatinUI UI = new PigLatinUI();

	}

	public PigLatinUI() {

		frame.setVisible(true);
		frame.add(panel);
		panel.add(textbox1);
		panel.add(button);
		panel.add(textbox2);
		button.addActionListener(this);
		frame.pack();
		button.setText("translate");
		frame.setTitle("Pig Latin Translator");
		textbox1.setColumns(30);
		textbox2.setColumns(30);
		textbox2.setEditable(false);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		 
		textbox2.setText(translator.translate(textbox1.getText()));
	}

}
