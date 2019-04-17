import static org.junit.Assert.*;

import org.junit.Test;

public class testAddStrings {

	@Test
	public void test() {
		JunitTesting ob= new JunitTesting();
		String r =ob.addStrings("mudassir", "ali");
		assertEquals("mudassir ali",r);
		//fail("Not yet implemented");
	}

}
