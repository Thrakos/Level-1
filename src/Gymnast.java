
public class Gymnast {

	String name;
	int skill;

	public Gymnast(String name) {
		this.name = name;
		skill = 0;
	}

	public void doBackhandsprings(int amount) {
		if (amount <= 0) {
			System.out.println("Coach: YOU NEED TO DO AT LEAST TWO!!");
			skill += 1;
		} else if (amount >= 2 && amount <= 5 && skill == 1) {
			System.out.println("You failed and broke your arm");
		} else if (amount >= 2 && amount <= 5 && skill < 3 && skill > 1) {
			System.out.println("Coach: FASTER");
			skill += 2;
		} else if (amount >= 2 && amount <= 5 && skill >= 3) {
			System.out.println("Coach: good");
			skill += 3;
		} else if (amount > 5 && skill <= 3) {
			System.out.println("You failed and broke your arm");
		} else if (amount > 5 && skill > 3 && skill <= 5) {
			System.out.println("Coach: meh");
			skill += 3;
		} else if (amount > 5 && skill > 5) {
			System.out.println("Coach: Good Job!");
			skill += 5;
		}
	}

	public void doADiveroll() {
		if (skill <= 2) {
			System.out.println("You failed and broke your neck");
		} else if (skill > 3 && skill <= 5) {
			System.out.println("Coach: meh");
			skill += 2;
		} else if (skill > 5) {
			System.out.println("Coach: Good!");
			skill += 3;
		}
	}

	public void doFrontTucks(int amount) {
		if (amount <= 2 && skill <= 3) {
			System.out.println("You failed and broke your leg");
		} else if (amount <= 2 && skill > 3 && skill <= 5) {
			System.out.println("Coach: meh");
			skill += 3;
		} else if (amount <= 2 && skill > 5) {
			System.out.println("Coach: okay...");
			skill += 5;
		} else if (amount > 2 && skill <= 4) {
			System.out.println("You failed and broke your leg");
		} else if (amount > 2 && skill > 4 && skill <= 6) {
			System.out.println("Coach: meh");
		}
	}

	public static void main(String[] args) {

	}
}
