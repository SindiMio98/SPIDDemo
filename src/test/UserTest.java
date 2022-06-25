import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class UserTest {

	@Test
	public void testUserCreation() {
		User testClass = new User();
		
		testClass.setName("Sindi");
		assertEquals("Sindi", testClass.getName());

		testClass.setSurame("Mio");
		assertEquals("Mio", testClass.getSurname());

	}

}