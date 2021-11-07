# Cohesion

## Cohesion is the degree to which the various parts of a software component are related.

* Higher Cohesion helps attain better adherence to the Single Responsilibity Principle

``` java
// These two methods have are related to each other
public int calculateArea(){
  return side * side;
}

public int calculatePerimeter(){
  return side * 4;
}
```

``` java
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
```
