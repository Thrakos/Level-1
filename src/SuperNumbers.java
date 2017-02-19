import java.util.Random;

import javax.swing.JOptionPane;

public class SuperNumbers {
	public static void main(String[] args) {
		int totalTimesRan = 0;
		String numberS = JOptionPane.showInputDialog("Pick a number between 1 and 30");
		String numberS2 = JOptionPane.showInputDialog("Pick another number between 1 and 30");
		String numberS3 = JOptionPane.showInputDialog("Pick another number between 1 and 30");
		String numberS4 = JOptionPane.showInputDialog("Pick another number between 1 and 30");
		String numberS5 = JOptionPane.showInputDialog("Pick another number between 1 and 30");
		String numberS6 = JOptionPane.showInputDialog("Pick another number between 1 and 30");
		for (int i = 0; i < 10; i++) {

			int timesRan = 0;
			int aa = 0;
			int bb = 0;
			int cc = 0;
			int dd = 0;
			int ee = 0;
			int ff = 0;
			Random rand = new Random();

			int number = Integer.parseInt(numberS);
			int number2 = Integer.parseInt(numberS2);
			int number3 = Integer.parseInt(numberS3);
			int number4 = Integer.parseInt(numberS4);
			int number5 = Integer.parseInt(numberS5);
			int number6 = Integer.parseInt(numberS6);

			while (!(aa == number && bb == number2 && cc == number3 && dd == number4 && ee == number5
					&& ff == number6)) {
				aa = rand.nextInt(30) + 1;
				bb = rand.nextInt(30) + 1;
				cc = rand.nextInt(30) + 1;
				dd = rand.nextInt(30) + 1;
				ee = rand.nextInt(30) + 1;
				ff = rand.nextInt(30) + 1;
				timesRan += 1;
			}
			JOptionPane.showMessageDialog(null, "" + timesRan);
			totalTimesRan += timesRan;
		}
		int average = totalTimesRan / 10;
		JOptionPane.showMessageDialog(null, "Average: " + totalTimesRan);
	}

}
