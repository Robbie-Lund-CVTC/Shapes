package main;

/**
 * The Class Cone.
 */

/**
 * @author Fong L
 *
 */
public class Cone implements ICone {

	/** The height. */
	public float height;

	/** The radius. */
	public float radius;

	/**
	 * Instantiates a new cone.
	 *
	 * @param height
	 *            the height
	 * @param radius
	 *            the radius
	 */
	public Cone(float height, float radius) {
		this.height = height;
		this.radius = radius;
	}

	@Override
	public void setHeight(float height) {
		this.height = height;
	}

	@Override
	public float getHeight() {
		return height;
	}

	@Override
	public void setRadius(float radius) {
		this.radius = radius;
	}

	@Override
	public float getRadius() {
		return radius;
	}

	/**
	 * Render the cone and show its specifications.
	 *
	 * @return the string
	 */
	public String Render() {
		return "";
	}

	/**
	 * Calculates the surface area of a cone.
	 *
	 * @return the float
	 */
	public float SurfaceArea() {
		return 0;
	}

	/**
	 * Calculates the volume of a cone.
	 *
	 * @return the float
	 */
	public float Volume() {
		return 0;
	}

}
