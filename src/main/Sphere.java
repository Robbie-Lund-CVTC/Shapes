/**
 * 
 */
package main;

/**
 * @author Ryan
 *
 */
public class Sphere extends Shape implements ISphere{
	
	/* Diameter */
	public float diameter;
	
	/* Radius  */
	public float radius;

	/**
	 * Creates a new sphere
	 * 
	 * @param diameter - the diameter
	 * 
	 * @param radius - the radius
	 * 
	 */
	public Sphere(float diameter, float radius) {
		this.diameter = diameter;
		this.radius = radius;
	}

	
	/**
	 * Gets the diameter.
	 *
	 * @return the diameter
	 */
	public float getDiameter() {
		return diameter;
	}


	/**
	 * Sets the diamter.
	 *
	 * @param radius -the new diamter
	 *            
	 */
	public void setDiameter(float diameter) {
		this.diameter = diameter;
	}


	/**
	 * Gets the radius.
	 *
	 * @return the radius
	 */
	public float getRadius() {
		return radius;
	}


	/**
	 * Sets the radius.
	 *
	 * @param radius -the new radius
	 *            
	 */
	public void setRadius(float radius) {
		this.radius = radius;
	}


	/**
	 * Render the sphere and show its specifications.
	 *
	 * @return the string
	 */
	public String Render() {
		return "Diameter: " + diameter + " Radius: " + radius + " Volume: " + Volume() + " Surface Area: " + SurfaceArea();
	}
	

	/**
	 * Calculate and return the surface area of a sphere.
	 *
	 * @return the float
	 */
	@Override
	float SurfaceArea() {
		return (float)(4 * Math.PI * Math.pow(radius, 2));
	}

	/**
	 * Calculate and return the volume of a sphere.
	 *
	 * @return the float
	 */
	@Override
	float Volume() {
		return (float) (4/3 * Math.PI * Math.pow(radius, 3));
	}

}
