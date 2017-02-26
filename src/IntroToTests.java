import static org.junit.Assert.*;

import org.junit.Test;

public class IntroToTests {

	@Test
	public void test() {
		Person2 p = new Person2();
		
		p.setName("Sam");
		p.setAge(19);
		p.setJob("Skater");
		p.setHeight(6.1);
		p.setBirthday("March 3rd");
		p.setKids(3);
		
		assertEquals("Sam", p.getName());
		assertEquals(19, p.getAge());
		assertEquals("Skater", p.getJob());
		assertEquals(6.1, p.getHeight(), 0.001);
		assertEquals("March 3rd", p.getBirthday());
		assertEquals(3, p.getKids());
		
	}

}
