package main;

public class Cylinder extends Shape implements ICylinder {

	public float diameter;
	public float height;
	public float radius;

	public Cylinder(float diameter, float height, float radius) {
		this.diameter = diameter;
		this.height = height;
		this.radius = radius;
	}

	@Override
	public void setDiameter(float diameter) {
		this.diameter = diameter;
	}

	@Override
	public float getDiameter() {
		return diameter;
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

	public String Render() {
		return "Diameter: " + diameter + " Height: " + height + " Radius: " + radius + " Volume: " + Volume()
				+ " Surface Area: " + SurfaceArea();
	}

	@Override
	public float SurfaceArea() {
		return (float) (2 * Math.PI * radius * height + 2 * Math.PI * Math.pow(radius, 2));
	}

	@Override
	public float Volume() {
		return (float) (Math.PI * Math.pow(radius, 2) * height);
	}

}
