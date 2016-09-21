package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import main.Cone;

/**
 * The Class ConeTest.
 */
public class ConeTest {

	/** The Constant DELTA. */
	private static final double DELTA = 0.1;

	/** The cone. */
	private Cone cone = new Cone(10, 5);

	/**
	 * Test cone constructor.
	 */
	@Test
	public void testConeConstructor() {
		float height = cone.height;
		float radius = cone.radius;
		assertEquals(10, height, DELTA);
		assertEquals(5, radius, DELTA);
	}

	/**
	 * Test height.
	 */
	@Test
	public void testHeight() {
		float result = cone.height;
		assertEquals(10, result, DELTA);
	}

	/**
	 * Test radius.
	 */
	@Test
	public void testRadius() {
		float result = cone.radius;
		assertEquals(5, result, DELTA);
	}

	/**
	 * Test cone render.
	 */
	@Test
	public void testConeRender() {
		String result = cone.Render();
		String expected = "Height: " + cone.height + " Radius: " + cone.radius + " Volume: " + cone.Volume()
				+ " Surface Area: " + cone.SurfaceArea();

		assertEquals(expected, result);
	}

	@Test
	public void testSurfaceArea() {
		float result = cone.SurfaceArea();
		assertEquals(254.16, result, DELTA);
	}

	@Test
	public void testVolume() {
		float result = cone.Volume();
		assertEquals(261.8, result, DELTA);
	}

}
