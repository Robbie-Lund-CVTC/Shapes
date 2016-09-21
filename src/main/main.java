package main;
import java.util.ArrayList;

public class main {
	
	public static ArrayList<IRenderer> shapes = new ArrayList<IRenderer>();
	
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
