<<<<<<< HEAD
package main;

public class Sphere extends Shape implements ISphere {

	public float diameter;
	public float radius;

=======
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
>>>>>>> features/rruf7
	public Sphere(float diameter, float radius) {
		this.diameter = diameter;
		this.radius = radius;
	}

<<<<<<< HEAD
	@Override
=======
	
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
>>>>>>> features/rruf7
	public void setDiameter(float diameter) {
		this.diameter = diameter;
	}

<<<<<<< HEAD
	@Override
	public float getDiameter() {
		return diameter;
	}

	@Override
=======

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
>>>>>>> features/rruf7
	public void setRadius(float radius) {
		this.radius = radius;
	}

<<<<<<< HEAD
	@Override
	public float getRadius() {
		return radius;
	}

	public String Render() {
		return "Diameter: " + diameter + " Radius: " + radius + " Volume: " + Volume() + " Surface Area: "
				+ SurfaceArea();
	}

	@Override
	public float SurfaceArea() {
		return (float) (4 * Math.PI * Math.pow(radius, 2));
	}

	@Override
	public float Volume() {
		return (float) ((4 * Math.PI * Math.pow(radius, 3)) / 3);
=======

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
>>>>>>> features/rruf7
	}

}
