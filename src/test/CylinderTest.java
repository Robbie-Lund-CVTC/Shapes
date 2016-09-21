package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import main.Constants;
import main.Cylinder;
import main.IMessageBox;

/**
 * The Class CylinderTest.
 */
public class CylinderTest {

	/** The diameter. */
	private float diameter = 0;

	/** The height. */
	private float height = 4;

	/** The radius. */
	private float radius = 3;
	
	private IMessageBox messageBox;

	/** The cylinder. */
	private Cylinder cylinder = new Cylinder(diameter, height, radius, messageBox);

	/**
	 * Test Cylinder constructor.
	 */
	@Test
	public void testCylinderConstructor() {
		float diameter = cylinder.diameter;
		float length = cylinder.height;
		float width = cylinder.radius;
		assertEquals(this.diameter, diameter, Constants.DELTA);
		assertEquals(this.height, length, Constants.DELTA);
		assertEquals(this.radius, width, Constants.DELTA);
	}

	/**
	 * Test diameter.
	 */
	@Test
	public void testDiameter() {
		float result = cylinder.diameter;
		assertEquals(diameter, result, Constants.DELTA);
	}

	/**
	 * Test height.
	 */
	@Test
	public void testHeight() {
		float result = cylinder.height;
		assertEquals(height, result, Constants.DELTA);
	}

	/**
	 * Test radius.
	 */
	@Test
	public void testRadius() {
		float result = cylinder.radius;
		assertEquals(radius, result, Constants.DELTA);
	}

	/**
	 * Test set diameter.
	 */
	@Test
	public void testSetDiameter() {
		cylinder.setDiameter(diameter);
		assertEquals(diameter, cylinder.diameter, Constants.DELTA);
	}

	/**
	 * Test get diameter.
	 */
	@Test
	public void testGetDiameter() {
		float result = cylinder.getDiameter();
		assertEquals(diameter, result, Constants.DELTA);
	}

	/**
	 * Test set height.
	 */
	@Test
	public void testSetHeight() {
		cylinder.setHeight(height);
		assertEquals(height, cylinder.height, Constants.DELTA);
	}

	/**
	 * Test get height.
	 */
	@Test
	public void testGetHeight() {
		float result = cylinder.getHeight();
		assertEquals(height, result, Constants.DELTA);
	}

	/**
	 * Test set radius.
	 */
	@Test
	public void testSetRadius() {
		cylinder.setRadius(radius);
		assertEquals(radius, cylinder.radius, Constants.DELTA);
	}

	/**
	 * Test get radius.
	 */
	@Test
	public void testGetRadius() {
		float result = cylinder.getRadius();
		assertEquals(radius, result, Constants.DELTA);
	}

	/**
	 * Test cylinder render.
	 */
	@Test
	public void testCylinderRender() {
		String result = cylinder.Render();
		String expected = "Diameter: " + cylinder.diameter + " Height: " + cylinder.height + " Radius: "
				+ cylinder.radius + " Volume: " + cylinder.Volume() + " Surface Area: " + cylinder.SurfaceArea();
		;
		assertEquals(expected, result);
	}

	/**
	 * Test surface area.
	 */
	@Test
	public void testSurfaceArea() {
		float result = cylinder.SurfaceArea();
		assertEquals(131.95, result, Constants.DELTA);
	}

	/**
	 * Test volume.
	 */
	@Test
	public void testVolume() {
		float result = cylinder.Volume();
		assertEquals(113.1, result, Constants.DELTA);
	}

}
