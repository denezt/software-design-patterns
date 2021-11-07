import java.util.List;

public class ProductCatalog {
  public void listAllProducts(){
    ProductRepository productRepository = ProductFactory.create();
    List<String> allProductNames = productRepository.getAllProductNames();
    // Displays Product Names
    for (String product : allProductNames) {
      System.out.println("Product: " + product);
    }
  }
}
