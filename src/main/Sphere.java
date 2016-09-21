package main;

public class Sphere extends Shape implements ISphere {

	public float diameter;
	public float radius;

	public Sphere(float diameter, float radius) {
		this.diameter = diameter;
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
	public void setRadius(float radius) {
		this.radius = radius;
	}

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
	}

}
