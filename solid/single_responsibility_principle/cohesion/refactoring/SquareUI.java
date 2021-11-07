// Responsilibity: Rendering images of squares
public class SquareUI {
	boolean higheResolutionMonitor = true;

	private void debugger(Object o){
		System.out.println(o);
	}

	public void draw(){
		if (higheResolutionMonitor){
			// Render a high resolution image of a square
		} else {
			// Render a normal image of a square
		}
	}

	public void rotate(int degree){
		// Rotate the image of the square clockwise to
		// the required degree and re-render
		int rotate = 0;
		System.out.println("Rotating Square: " + String.valueOf(degree) + " times.");
	}
}
