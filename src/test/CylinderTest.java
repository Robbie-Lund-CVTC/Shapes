package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import main.Constants;
import main.Cylinder;

/**
 * The Class cylinderTest.
 */
public class CylinderTest {

	private float diameter = 5;

	private float height = 8;

	private float radius = 6;

	private Cylinder cylinder = new Cylinder(diameter, height, radius);

	@Test
	public void testcylinderConstructor() {
		float diameter = cylinder.diameter;
		float length = cylinder.height;
		float width = cylinder.radius;
		assertEquals(this.diameter, diameter, Constants.DELTA);
		assertEquals(this.height, length, Constants.DELTA);
		assertEquals(this.radius, width, Constants.DELTA);
	}

	@Test
	public void testDiameter() {
		float result = cylinder.diameter;
		assertEquals(diameter, result, Constants.DELTA);
	}

	@Test
	public void testHeight() {
		float result = cylinder.height;
		assertEquals(height, result, Constants.DELTA);
	}

	@Test
	public void testRadius() {
		float result = cylinder.radius;
		assertEquals(radius, result, Constants.DELTA);
	}

	@Test
	public void testSetDiameter() {
		cylinder.setDiameter(diameter);
		assertEquals(diameter, cylinder.diameter, Constants.DELTA);
	}

	@Test
	public void testGetDiameter() {
		float result = cylinder.getDiameter();
		assertEquals(diameter, result, Constants.DELTA);
	}

	@Test
	public void testSetHeight() {
		cylinder.setHeight(height);
		assertEquals(height, cylinder.height, Constants.DELTA);
	}

	@Test
	public void testGetHeight() {
		float result = cylinder.getHeight();
		assertEquals(height, result, Constants.DELTA);
	}

	@Test
	public void testSetRadius() {
		cylinder.setRadius(radius);
		assertEquals(radius, cylinder.radius, Constants.DELTA);
	}

	@Test
	public void testGetWidth() {
		float result = cylinder.getRadius();
		assertEquals(radius, result, Constants.DELTA);
	}

	@Test
	public void testCylinderRender() {
		String result = cylinder.Render();
		String expected = "";
		assertEquals(expected, result);
	}

	@Test
	public void testSurfaceArea() {
		float result = cylinder.SurfaceArea();
		assertEquals(0, result, Constants.DELTA);
	}

	@Test
	public void testVolume() {
		float result = cylinder.Volume();
		assertEquals(0, result, Constants.DELTA);
	}

}
