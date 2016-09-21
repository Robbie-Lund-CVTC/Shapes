package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import main.Cone;

/**
 * The Class ConeTest.
 */
public class ConeTest {

	/** The cone. */
	private Cone cone = new Cone(0, 0);;

	/**
	 * Test cone constructor.
	 */
	@Test
	public void testConeConstructor() {
		Float height = cone.height;
		Float radius = cone.radius;
		assertEquals(Float.valueOf(0), height);
		assertEquals(Float.valueOf(0), radius);
	}

	/**
	 * Test height.
	 */
	@Test
	public void testHeight() {
		Float result = cone.height;
		assertEquals(Float.valueOf(0), result);
	}

	/**
	 * Test radius.
	 */
	@Test
	public void testRadius() {
		Float result = cone.radius;
		assertEquals(Float.valueOf(0), result);
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
