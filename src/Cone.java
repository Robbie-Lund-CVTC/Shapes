import sun.reflect.generics.reflectiveObjects.NotImplementedException;

// TODO: Auto-generated Javadoc
/**
 * The Class Cone.
 */

/**
 * @author Fong L
 *
 */
public class Cone {
	
	/** The height. */
	public float height;
	
	/** The radius. */
	public float radius;
	
	/**
	 * Instantiates a new cone.
	 *
	 * @param height the height
	 * @param radius the radius
	 */
	public Cone(float height, float radius) {
		this.height = height;
		this.radius = radius;
	}
	
	/**
	 * Render the cone and show its specifications.
	 *
	 * @return the string
	 */
	public String Render(){
		throw new NotImplementedException();
	}
	
	/**
	 * Calculates the surface area of a cone.
	 *
	 * @return the float
	 */
	public float SurfaceArea() {
		throw new NotImplementedException();
	}
	
	/**
	 * Calculates the volume of a cone.
	 *
	 * @return the float
	 */
	public float Volume() {
		throw new NotImplementedException();
	}
	
}
