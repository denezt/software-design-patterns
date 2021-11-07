import java.util.List;

public class ProductCatalog {
  private ProductRepository productRepository;

  public ProductCatalog(ProductRepository productRepository){
    this.productRepository = productRepository;
  }

  public void listAllProducts(){
    List<String> allProductNames = productRepository.getAllProductNames();
    // Displays Product Names
    for (String product : allProductNames) {
      System.out.println("Product: " + product);
    }
  }
}
