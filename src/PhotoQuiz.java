
// Copyright Wintriss Technical Schools 2013
import java.awt.Component;
import java.awt.Frame;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PhotoQuiz {

	public static void main(String[] args) throws Exception {
		Frame quizWindow = new Frame();
		quizWindow.setVisible(true);

		int score = 0;
		// 1. find an image on the internet, and put its URL in a String
		// variable (from your browser, right click on the image, and select
		// “Copy Image URL”)
		String imageUrl = "https://lh6.ggpht.com/0O-HefMHNwemt4gnJ4YfNq3xFaTBaiFcwIRiUpzDZ1KObI8ptEMgoHOSDiy_tumRWexz=w300";
		// 2. create a variable of type "Component" that will hold your image
		Component cookie;
		// 3. use the "createImage()" method below to initialize your Component
		cookie = createImage(imageUrl);
		// 4. add the image to the quiz window
		quizWindow.add(cookie);
		// 5. call the pack() method on the quiz window
		quizWindow.pack();
		// 6. ask a question that relates to the image
		String answer = JOptionPane.showInputDialog("Does this have chocolate chips?");
		// 7. print "CORRECT" if the user gave the right answer
		if (answer.equals("yes")) {
			JOptionPane.showMessageDialog(null, "CORRECT!");
			score += 1;
		} else {
			JOptionPane.showMessageDialog(null, "INCORRECT!");
		}
		// 8. print "INCORRECT" if the answer is wrong

		// 9. remove the component from the quiz window (you may not see the
		// effect of this until step 12)
		quizWindow.remove(cookie);
		// 10. find another image and create it (might take more than one line
		// of code)
		imageUrl = "http://www.slate.com/content/dam/slate/articles/video/video/2014/04/apple.jpg.CROP.promo-mediumlarge.jpg";
		Component apples;
		apples = createImage(imageUrl);
		// 11. add the second image to the quiz window
		quizWindow.add(apples);
		// 12. pack the quiz window
		quizWindow.pack();
		// 13. ask another question
		String answer2 = JOptionPane.showInputDialog("What color is the middle apple?");
		// 14+ check answer, say if correct or incorrect, etc.
		if (answer2.equals("red")) {
			JOptionPane.showMessageDialog(null, "CORRECT!");
			score += 1;
		} else {
			JOptionPane.showMessageDialog(null, "INCORRECT!");
		}
		JOptionPane.showMessageDialog(null, "Your score is " + score + "/2");
	}

	private static Component createImage(String imageUrl) throws MalformedURLException {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image
	// (imageComponent.addMouseMotionListener())
}
