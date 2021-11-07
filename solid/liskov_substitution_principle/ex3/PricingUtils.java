/*
* This is an example of a bad design pattern.
* We are asking if the Component has the same class.
* We should not ask but instead tell.
*/

import java.util.*;

public class PricingUtils {
  public static void main(String[] args) {
    Product p1 = new Product();
    Product p2 = new Product();
    Product p3 = new InHouseProduct();

    List<Product> productList = new ArrayList<>();
    productList.add(p1);
    productList.add(p2);
    productList.add(p3);
    for (Product product : productList) {
      // Here we need to ask if the product object is an instance of the InHouseProduct class.
      // We should avoid this when it is possible.
      if (product instanceof InHouseProduct) {
        // Here will are needing to downcast and this is a poor design pattern.
        ((InHouseProduct) product).applyExtraDiscount();
      }
      System.out.println("Product Discount: " + String.valueOf(product.getDiscount()));
    }
  }
}
