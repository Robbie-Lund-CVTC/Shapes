package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import main.Cone;

/**
 * The Class ConeTest.
 */
public class ConeTest {

	/** The Constant DELTA. */
	private static final double DELTA = 1e-15;

	/** The cone. */
	private Cone cone = new Cone(0, 0);

	/**
	 * Test cone constructor.
	 */
	@Test
	public void testConeConstructor() {
		float height = cone.height;
		float radius = cone.radius;
		assertEquals(0, height, DELTA);
		assertEquals(0, radius, DELTA);
	}

	/**
	 * Test height.
	 */
	@Test
	public void testHeight() {
		float result = cone.height;
		assertEquals(0, result, DELTA);
	}

	/**
	 * Test radius.
	 */
	@Test
	public void testRadius() {
		float result = cone.radius;
		assertEquals(0, result, DELTA);
	}

	/**
	 * Test cone render.
	 */
	@Test
	public void testConeRender() {
		String result = cone.Render();
		assertEquals("", result);
	}

}
