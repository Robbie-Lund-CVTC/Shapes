package main;

/**
 * The Class Cylinder.
 */
public class Cylinder extends Shape implements ICylinder, IRenderer {

	/** The diameter. */
	public float diameter;

	/** The height. */
	public float height;

	/** The radius. */
	public float radius;

	/**
	 * Instantiates a new cylinder.
	 *
	 * @param diameter
	 *            the diameter
	 * @param height
	 *            the height
	 * @param radius
	 *            the radius
	 */
	public Cylinder(float diameter, float height, float radius) {
		this.diameter = diameter;
		this.height = height;
		this.radius = radius;
	}

	/**
	 * Sets the diameter.
	 *
	 * @param diameter
	 *            the new diameter
	 */
	@Override
	public void setDiameter(float diameter) {
		this.diameter = diameter;
	}

	/**
	 * Gets the diameter.
	 *
	 * @return the diameter
	 */
	@Override
	public float getDiameter() {
		return diameter;
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
	 * Render the cylinder and show its specifications
	 *
	 * @return the string
	 */
	public String Render() {
		return "Diameter: " + diameter + " Height: " + height + " Radius: " + radius + " Volume: " + Volume()
				+ " Surface Area: " + SurfaceArea();
	}

	/**
	 * Calculate and return the surface area of a cylinder.
	 *
	 * @return the float
	 */
	@Override
	public float SurfaceArea() {
		return (float) (2 * Math.PI * radius * height + 2 * Math.PI * Math.pow(radius, 2));
	}

	/**
	 * Calculate and return the volume of a cylinder.
	 *
	 * @return the float
	 */
	@Override
	public float Volume() {
		return (float) (Math.PI * Math.pow(radius, 2) * height);
	}

}
