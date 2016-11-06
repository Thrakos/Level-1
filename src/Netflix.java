
public class Netflix {

	public Netflix() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Movie burnt = new Movie("Burnt", 2);
		Movie humanLand = new Movie("Human Land", 5);
		Movie servants = new Movie("Servants", 2);
		Movie doctorNormal = new Movie("Doctor Normal", 3);
		Movie slowness = new Movie("Slowness", 3);
		
		System.out.println(burnt.getTicketPrice());
		
		NetflixQueue queue = new NetflixQueue();
		
		queue.addMovie(burnt);
		queue.addMovie(slowness);
		queue.addMovie(doctorNormal);
		queue.addMovie(servants);
		queue.addMovie(humanLand);
	}
}
