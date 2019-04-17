import static org.junit.Assert.*;

import org.junit.Test;

public class testAddNumbers {

	@Test
	public void test() {
		JunitTesting ob = new JunitTesting();
		int result=ob.addNumbers(100,200);
		assertEquals(300,result);
		//fail("Not yet implemented");
	}

}
