package main;

// TODO: Auto-generated Javadoc
/**
 * The Class Cone.
 */

/**
 * @author Fong L
 *
 */
public class Cone extends Shape implements ICone, IRenderer {

	/** The height. */
	public float height;

	/** The radius. */
	public float radius;

	/**
	 * Instantiates a new cone.
	 *
	 * @param height            the height
	 * @param radius            the radius
	 * @param messageBox the message box
	 */
	public Cone(float height, float radius, IMessageBox messageBox) {
		super(messageBox);
		this.height = height;
		this.radius = radius;
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
		return height;
	}

	/**
	 * Sets the radius.
	 *
	 * @param radius
	 *            the new radius
	 */
	@Override
	public void setRadius(float radius) {
		this.radius = radius;
	}

	/**
	 * Gets the radius.
	 *
	 * @return the radius
	 */
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
	 * Calculate and return the surface area of a cone.
	 *
	 * @return the float
	 */
	@Override
	public float SurfaceArea() {
		return (float) (Math.PI * radius * (radius + Math.sqrt(Math.pow(height, 2) + Math.pow(radius, 2))));
	}

	/**
	 * Calculate and return the volume of a cone.
	 *
	 * @return the float
	 */
	@Override
	public float Volume() {
		return (float) (Math.PI * Math.pow(radius, 2) * height / 3);
	}

}
