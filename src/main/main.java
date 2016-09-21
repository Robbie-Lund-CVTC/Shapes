package main;
import java.util.ArrayList;

// TODO: Auto-generated Javadoc
/**
 * The Class main.
 */
public class main {
	
	/** The shapes. */
	public static ArrayList<IRenderer> shapes = new ArrayList<IRenderer>();
	
	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		
		IMessageBox messageBox = new MessageBox();

		Cylinder cylinder = new Cylinder(1, 2, 3, messageBox);
		Sphere sphere = new Sphere(4, 5, messageBox);
		Cone cone = new Cone(6, 7, messageBox);
		Cuboid cuboid = new Cuboid(7, 8, 9, messageBox);
		
		shapes.add(cylinder);
		shapes.add(sphere);
		shapes.add(cone);
		shapes.add(cuboid);
		
		for (IRenderer shape : shapes) {
			messageBox.show(shape.Render());
		}
		
	}

}
