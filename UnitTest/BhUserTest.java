import static org.junit.Assert.*;

import org.junit.Test;

import customTools.DbUser;
import model.Bhuser;

public class BhUserTest {

	@Test
	public void getUserTest() {
		Bhuser user = DbUser.getUser(3);
		assertTrue(user.getBhuserid()==3);
			
	}
	
	@Test
	public void getUserTest2() {
		
		assertTrue(3==2);
			
	}

}
