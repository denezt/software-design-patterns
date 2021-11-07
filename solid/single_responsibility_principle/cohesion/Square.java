public class Square {
  int side = 5;
  boolean higheResolutionMonitor = true;

  public int calculateArea(){
    return side * side;
  }

  public int calculatePerimeter(){
    return side * 4;
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
  }
}
