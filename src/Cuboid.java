
public class Cuboid {
	
	public float height;
	public float width;
	
	public float volume (float height, float width, float length) {
		float Volume;
		Volume = height * width * length;
		return Volume;
	}
	
	
	public float SurfaceArea(float height, float width, float length) {
		float SurfaceArea;
		SurfaceArea = 2 * width * length + 2 * length * height + 2 * height * width;
		return SurfaceArea;
		
	}
	
	public String Render (string render);
	
	System.out.println( helloString );
}
