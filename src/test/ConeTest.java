package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import main.Cone;
import main.Constants;

// TODO: Auto-generated Javadoc
/**
 * The Class ConeTest.
 */
public class ConeTest {

	/** The height. */
	private float height = 10;

	/** The radius. */
	private float radius = 5;

	/** The cone. */
	private Cone cone = new Cone(height, radius);

	/**
	 * Test cone constructor.
	 */
	@Test
	public void testConeConstructor() {
		float height = cone.height;
		float radius = cone.radius;
		assertEquals(this.height, height, Constants.DELTA);
		assertEquals(this.radius, radius, Constants.DELTA);
	}

	/**
	 * Test height.
	 */
	@Test
	public void testHeight() {
		float result = cone.height;
		assertEquals(height, result, Constants.DELTA);
	}

	/**
	 * Test radius.
	 */
	@Test
	public void testRadius() {
		float result = cone.radius;
		assertEquals(radius, result, Constants.DELTA);
	}

	/**
	 * Test set height.
	 */
	@Test
	public void testSetHeight() {
		cone.setHeight(height);
		assertEquals(height, cone.height, Constants.DELTA);
	}

	/**
	 * Test get height.
	 */
	@Test
	public void testGetHeight() {
		float result = cone.getHeight();
		assertEquals(height, result, Constants.DELTA);
	}

	/**
	 * Test set radius.
	 */
	@Test
	public void testSetRadius() {
		cone.setRadius(radius);
		assertEquals(radius, cone.radius, Constants.DELTA);
	}

	/**
	 * Test get radius.
	 */
	@Test
	public void testGetRadius() {
		float result = cone.getRadius();
		assertEquals(radius, result, Constants.DELTA);
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

	/**
	 * Test surface area.
	 */
	@Test
	public void testSurfaceArea() {
		float result = cone.SurfaceArea();
		assertEquals(254.16, result, Constants.DELTA);
	}

	/**
	 * Test volume.
	 */
	@Test
	public void testVolume() {
		float result = cone.Volume();
		assertEquals(261.8, result, Constants.DELTA);
	}

}
