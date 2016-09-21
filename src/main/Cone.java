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
		return "Height: " + height + " Radius: " + radius + " Volume: " + Volume() + " Surface Area: " + SurfaceArea();
	}

	/**
	 * Calculates the surface area of a cone.
	 *
	 * @return the float
	 */
	public float SurfaceArea() {
		return (float) (Math.PI * radius * (radius + Math.sqrt(Math.pow(height, 2) + Math.pow(radius, 2))));
	}

	/**
	 * Calculates the volume of a cone.
	 *
	 * @return the float
	 */
	public float Volume() {
		return (float) (Math.PI * Math.pow(radius, 2) * height / 3);
	}

}
