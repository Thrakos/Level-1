import java.awt.Color;
import java.util.Random;

import info.gridworld.actor.Bug;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Location;
import info.gridworld.world.World;

public class GridWorld {
	public static void main(String[] args) {
		World world = new World();
		world.show();
		Bug bug = new Bug();
		Location location = new Location(2, 3);
		int rand = new Random().nextInt(8) + 1;
		int rand2 = new Random().nextInt(8) + 1;
		Location location3 = new Location(rand + 1, rand2);
		Flower flower = new Flower();
		world.add(location3, flower);
		Location location4 = new Location(rand - 1, rand2);
		world.add(location4, flower);
		for (int i = 0; i < 10; i++) {
			Location location10 = new Location(i, i);
			world.add(location10, flower);
		}
		for (int i = 0; i < 10; i++) {
			Location location5 = new Location(i, 9 - i);
			world.add(location5, flower);
		}
		world.show();
		world.add(location, bug);
		Bug bug2 = new Bug(Color.blue);
		Location location2 = new Location(rand, rand2);
		world.add(location2, bug2);
		bug2.turn();
		bug2.turn();
	}
}
