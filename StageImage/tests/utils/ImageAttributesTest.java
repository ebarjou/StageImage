package utils;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ImageAttributesTest {
	protected ImageAttributes ia;
	
	@Before
	public void setUp() throws Exception {
		ia = new ImageAttributes("a", 10);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		ia.setAngle(ia.getAngle()+5);
		ia.setPath(ia.getPath()+"b");
		assertEquals(ia.toString(), "[ab ; "+15.0+"°]");
	}

}
