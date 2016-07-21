package utils;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.opencv.features2d.KeyPoint;

import algorithm.MatchlistToPoint3D;

/*
 * Test MatchList et MatchListToPoint3D
 */
public class MatchListTest {
	protected MatchList			m;
	protected KeyPoint			kp1, kp2;
	protected List<Point3D>		list;
	
	@Before
	public void setUp() throws Exception {
		m = new MatchList();
		kp1 = new KeyPoint();
		kp2 = new KeyPoint();
		list = new ArrayList<Point3D>();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		kp1.pt.x = 10;
		kp1.pt.y = 0;
		kp2.pt.x = 30;
		kp2.pt.y = 0;
		m.addIn1(kp1);
		m.addIn2(kp2);
		/*
		 * TODO ajouter angle
		 */
		list = MatchlistToPoint3D.convert(m);
		assertEquals(list.get(0).y, 0.0, 0.1);
		assertEquals(list.get(0).x, 20.0, 0.1);
		assertEquals(list.get(0).z, 0.0, 0.1); /* TODO à corriger avec le calcul de la profondeur des points */
	}

}
