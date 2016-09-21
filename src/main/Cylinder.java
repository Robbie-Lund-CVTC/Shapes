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
		return 0;
	}

	@Override
	public void setHeight(float height) {
		this.height = height;
	}

	@Override
	public float getHeight() {
		return 0;
	}

	@Override
	public void setRadius(float radius) {
		this.radius = radius;
	}

	@Override
	public float getRadius() {
		return 0;
	}

	public String Render() {
		return "";
	}

	@Override
	public float SurfaceArea() {
		return 0;
	}

	@Override
	public float Volume() {
		return 0;
	}

}
