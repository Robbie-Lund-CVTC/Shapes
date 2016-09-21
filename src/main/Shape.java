package main;

/**
 * The Class Shape.
 */
abstract class Shape {

	protected IMessageBox messageBox;
	
	/**
	 * Instantiates a new shape.
	 */
	public Shape(IMessageBox messageBox) {
		
		this.messageBox = messageBox;
		
	}

	/**
	 * Surface area.
	 *
	 * @return the float
	 */
	abstract public float SurfaceArea();

	/**
	 * Volume.
	 *
	 * @return the float
	 */
	abstract public float Volume();

}
