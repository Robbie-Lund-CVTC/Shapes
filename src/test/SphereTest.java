package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

<<<<<<< HEAD
import main.Constants;
import main.Sphere;

/**
 * The Class SphereTest.
 */
public class SphereTest {
=======
import main.Sphere;
import main.Constants;

class SphereTest {
>>>>>>> features/rruf7

	/** The diameter. */
	private float diameter = 10;

	/** The radius. */
	private float radius = 5;

	/** The sphere. */
	private Sphere sphere = new Sphere(diameter, radius);

	/**
<<<<<<< HEAD
	 * Test sphere constructor.
	 */
	@Test
	public void testSphereConstructor() {
=======
	 * Test Sphere constructor.
	 */
	@Test
	public void testConeConstructor() {
>>>>>>> features/rruf7
		float diameter = sphere.diameter;
		float radius = sphere.radius;
		assertEquals(this.diameter, diameter, Constants.DELTA);
		assertEquals(this.radius, radius, Constants.DELTA);
	}

	/**
<<<<<<< HEAD
	 * Test diameter.
=======
	 * Test Diameter.
>>>>>>> features/rruf7
	 */
	@Test
	public void testDiameter() {
		float result = sphere.diameter;
		assertEquals(diameter, result, Constants.DELTA);
	}

	/**
	 * Test radius.
	 */
	@Test
	public void testRadius() {
		float result = sphere.radius;
		assertEquals(radius, result, Constants.DELTA);
	}

	/**
	 * Test set diameter.
	 */
	@Test
	public void testSetDiameter() {
		sphere.setDiameter(diameter);
		assertEquals(diameter, sphere.diameter, Constants.DELTA);
	}

	/**
	 * Test get diameter.
	 */
	@Test
	public void testGetDiameter() {
		float result = sphere.getDiameter();
		assertEquals(diameter, result, Constants.DELTA);
	}

	/**
	 * Test set radius.
	 */
	@Test
	public void testSetRadius() {
		sphere.setRadius(radius);
		assertEquals(radius, sphere.radius, Constants.DELTA);
	}

	/**
	 * Test get radius.
	 */
	@Test
	public void testGetRadius() {
		float result = sphere.getRadius();
		assertEquals(radius, result, Constants.DELTA);
	}

	/**
	 * Test sphere render.
	 */
	@Test
<<<<<<< HEAD
	public void testSphereRender() {
=======
	public void testConeRender() {
>>>>>>> features/rruf7
		String result = sphere.Render();
		String expected = "Diameter: " + sphere.diameter + " Radius: " + sphere.radius + " Volume: " + sphere.Volume()
				+ " Surface Area: " + sphere.SurfaceArea();

		assertEquals(expected, result);
	}

	/**
	 * Test surface area.
	 */
	@Test
	public void testSurfaceArea() {
		float result = sphere.SurfaceArea();
		assertEquals(314.16, result, Constants.DELTA);
	}

	/**
	 * Test volume.
	 */
	@Test
	public void testVolume() {
		float result = sphere.Volume();
		assertEquals(523.6, result, Constants.DELTA);
	}

}
