/*
* We create this class and call it instead of
* creating an instance of SQLProductRepository and
* calling the instance directly.
*/

public class ProductFactory {
  public static ProductRepository create(){
    return new SQLProductRepository();
  }
}
