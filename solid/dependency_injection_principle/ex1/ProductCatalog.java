import java.util.List;

public class ProductCatalog {
  public void listAllProducts(){
    SQLProductRepository sqlProductRepository = new SQLProductRepository();
    List<String> allProductNames = sqlProductRepository.getAllProductNames();
    // Displays Product Names
    for (String product : allProductNames) {
      System.out.println("Product: " + product);
    }
  }
}
