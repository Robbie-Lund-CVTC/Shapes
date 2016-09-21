package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import main.Constants;
import main.Cuboid;
import main.IMessageBox;

/**
 * The Class CuboidTest.
 */
public class CuboidTest {

	/** The height. */
	private float height = 5;

	/** The length. */
	private float length = 8;

	/** The width. */
	private float width = 6;
	
	private IMessageBox messageBox;

	/** The cuboid. */
	private Cuboid cuboid = new Cuboid(height, length, width, messageBox);

	/**
	 * Test cuboid constructor.
	 */
	@Test
	public void testCuboidConstructor() {
		float height = cuboid.height;
		float length = cuboid.length;
		float width = cuboid.width;
		assertEquals(this.height, height, Constants.DELTA);
		assertEquals(this.length, length, Constants.DELTA);
		assertEquals(this.width, width, Constants.DELTA);
	}

	/**
	 * Test height.
	 */
	@Test
	public void testHeight() {
		float result = cuboid.height;
		assertEquals(height, result, Constants.DELTA);
	}

	/**
	 * Test length.
	 */
	@Test
	public void testLength() {
		float result = cuboid.length;
		assertEquals(length, result, Constants.DELTA);
	}

	/**
	 * Test width.
	 */
	@Test
	public void testWidth() {
		float result = cuboid.width;
		assertEquals(width, result, Constants.DELTA);
	}

	/**
	 * Test set height.
	 */
	@Test
	public void testSetHeight() {
		cuboid.setHeight(height);
		assertEquals(height, cuboid.height, Constants.DELTA);
	}

	/**
	 * Test get height.
	 */
	@Test
	public void testGetHeight() {
		float result = cuboid.getHeight();
		assertEquals(height, result, Constants.DELTA);
	}

	/**
	 * Test set length.
	 */
	@Test
	public void testSetLength() {
		cuboid.setLength(length);
		assertEquals(length, cuboid.length, Constants.DELTA);
	}

	/**
	 * Test get length.
	 */
	@Test
	public void testGetLength() {
		float result = cuboid.getLength();
		assertEquals(length, result, Constants.DELTA);
	}

	/**
	 * Test set width.
	 */
	@Test
	public void testSetWidth() {
		cuboid.setWidth(width);
		assertEquals(width, cuboid.width, Constants.DELTA);
	}

	/**
	 * Test get width.
	 */
	@Test
	public void testGetWidth() {
		float result = cuboid.getWidth();
		assertEquals(width, result, Constants.DELTA);
	}

	/**
	 * Test cuboid render.
	 */
	@Test
	public void testCuboidRender() {
		String result = cuboid.Render();
		String expected = "Height: " + cuboid.height + " Length: " + cuboid.length + " Width: " + cuboid.width
				+ " Volume: " + cuboid.Volume() + " Surface Area: " + cuboid.SurfaceArea();

		assertEquals(expected, result);
	}

	/**
	 * Test surface area.
	 */
	@Test
	public void testSurfaceArea() {
		float result = cuboid.SurfaceArea();
		assertEquals(236, result, Constants.DELTA);
	}

	/**
	 * Test volume.
	 */
	@Test
	public void testVolume() {
		float result = cuboid.Volume();
		assertEquals(240, result, Constants.DELTA);
	}

}
