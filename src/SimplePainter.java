import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class SimplePainter extends JPanel implements MouseListener, KeyListener, MouseMotionListener {
	private static final long serialVersionUID = 1L;
	
	JFrame window;
	Color color = new Color(0, 0, 0);
	
	int dotSize = 50;
	int dotTransparent = 255;
	
	ArrayList<Dot> dots = new ArrayList<Dot>();

	public static void main(String[] args) {
		new SimplePainter();
	}

	public SimplePainter() {
		window = new JFrame();
		window.add(this);
		window.getContentPane().setPreferredSize(new Dimension(500, 500));
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);
		window.pack();

		run();
	}

	private void run(){
		// 1. Make the window respond to mouse clicks
		window.addMouseListener(this);
		// 2. Use the addDot() method to create a new dot at the mouse's x and y
		// position when the mouse is clicked. Call the repaint() method to
		// update the window.

		// 3. Make the window respond to keyboard presses
		window.addKeyListener(this);
		// 4. Use the changeDotColor(Color) method to change the dots color when
		// the number keys are pressed
		// 5. Add a key to make the dot color random

// 6. Implement the MouseMotionListener interface
		// 7. Draw a stream of dots when the mouse is clicked and dragged
		window.addMouseMotionListener(this);
	}

	public void paintComponent(Graphics g) {
		for (Dot d : dots) {
			d.draw(g);
		}
	}

	private void addDot(int x, int y) {
		dots.add(new Dot(x - 25, y - 44, dotSize, dotSize, color));
	}

	private void changeDotColor(Color c){
		color = c;
	}
	
	private class Dot {
		int x;
		int y;
		int width;
		int height;

		Color c = new Color(0, 0, 0);

		public Dot(int x, int y, int width, int height, Color c) {
			this.x = x;
			this.y = y;
			this.width = width;
			this.height = height;
			this.c = c;
		}

		public void draw(Graphics g) {
			g.setColor(c);
			g.fillRect(x, y, width, height);
		}

		public void setColor(Color c) {
			this.c = c;
		}
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		int mouseX = e.getX();
		int mouseY = e.getY();
		addDot(mouseX, mouseY);
		repaint();
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		if(e.getKeyCode()==KeyEvent.VK_1){
			changeDotColor(new Color(255, 255, 255, dotTransparent));
		}
		if(e.getKeyCode()==KeyEvent.VK_2){
			changeDotColor(new Color(0, 0, 0, dotTransparent));
		}
		if(e.getKeyCode()==KeyEvent.VK_3){
			changeDotColor(new Color(255, 0, 0, dotTransparent));
		}
		if(e.getKeyCode()==KeyEvent.VK_4){
			changeDotColor(new Color(221, 136, 52, dotTransparent));
		}
		if(e.getKeyCode()==KeyEvent.VK_5){
			changeDotColor(new Color(238, 238, 0, dotTransparent));
		}
		if(e.getKeyCode()==KeyEvent.VK_6){
			changeDotColor(new Color(0, 255, 0, dotTransparent));
		}
		if(e.getKeyCode()==KeyEvent.VK_7){
			changeDotColor(new Color(0, 0, 255, dotTransparent));
		}
		if(e.getKeyCode()==KeyEvent.VK_8){
			changeDotColor(new Color(255, 0, 255, dotTransparent));
		}
		if(e.getKeyCode()==KeyEvent.VK_9){
			Random r = new Random();
			changeDotColor(new Color(r.nextInt(255),r.nextInt(255),r.nextInt(255), dotTransparent));
		}
		if(e.getKeyCode()==KeyEvent.VK_0){
			changeDotColor(new Color(240,240,240));
		}
		if(e.getKeyCode()==KeyEvent.VK_UP){
			dotSize += 10;
		}
		if(e.getKeyCode()==KeyEvent.VK_DOWN){
			dotSize -= 10;
		}
		if(e.getKeyCode()==KeyEvent.VK_LEFT){
			dotTransparent -= 50;
		}
		if(e.getKeyCode()==KeyEvent.VK_RIGHT){
			dotTransparent += 50;
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		int mouseX = e.getX();
		int mouseY = e.getY();
		addDot(mouseX, mouseY);
		repaint();		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}

