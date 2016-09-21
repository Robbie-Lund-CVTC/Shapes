package main;

/**
 * The Class Cuboid.
 */
public class Cuboid extends Shape implements ICuboid {

	/** The height. */
	public float height;

	/** The length. */
	public float length;

	/** The width. */
	public float width;

	/**
	 * Instantiates a new cuboid.
	 *
	 * @param height
	 *            the height
	 * @param length
	 *            the length
	 * @param width
	 *            the width
	 */
	public Cuboid(float height, float length, float width) {
		this.height = height;
		this.length = length;
		this.width = width;
	}

	/**
	 * Sets the height.
	 *
	 * @param height
	 *            the new height
	 */
	@Override
	public void setHeight(float height) {
		this.height = height;
	}

	/**
	 * Gets the height.
	 *
	 * @return the height
	 */
	@Override
	public float getHeight() {
		return 0;
	}

	/**
	 * Sets the length.
	 *
	 * @param length
	 *            the new length
	 */
	@Override
	public void setLength(float length) {
		this.length = length;
	}

	/**
	 * Gets the length.
	 *
	 * @return the length
	 */
	@Override
	public float getLength() {
		return 0;
	}

	/**
	 * Sets the width.
	 *
	 * @param width
	 *            the new width
	 */
	@Override
	public void setWidth(float width) {
		this.width = width;
	}

	/**
	 * Gets the width.
	 *
	 * @return the width
	 */
	@Override
	public float getWidth() {
		return 0;
	}

	/**
	 * Render the cuboid and show its specifications
	 *
	 * @return the string
	 */
	public String Render() {
		return "";
	}

	/**
	 * Calculate and return the surface area of a cuboid.
	 *
	 * @return the float
	 */
	@Override
	public float SurfaceArea() {
		return 0;
		// return 2 * width * length + 2 * length * height + 2 * height * width;
	}

	/**
	 * Calculate and return the volume of a cuboid.
	 *
	 * @return the float
	 */
	@Override
	public float Volume() {
		return 0;
		// return height * width * length;
	}

}
