import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class FancyWindow implements KeyListener {
	
	JFrame frame = new JFrame();
	
	public static void main(String[] args) {
		FancyWindow f = new FancyWindow();
		f.buildWindow();
	}
	void buildWindow(){
		frame.setVisible(true);
		frame.setSize(500, 500);
		frame.addKeyListener(this);
	}
	@Override
	public void keyTyped(KeyEvent e) {

		}
		
	
	@Override
	public void keyPressed(KeyEvent e) {
		if(e.getKeyCode()==KeyEvent.VK_ENTER){
			Random rand = new Random();
			frame.setSize(rand.nextInt(700), rand.nextInt(700));
		}		
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}
