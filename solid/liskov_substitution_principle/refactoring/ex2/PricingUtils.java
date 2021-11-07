/*
* This is an example of a good design pattern.
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
      // Here will are not required to typecast as we did in the original code.
      System.out.println("Product Discount: " + String.valueOf(product.getDiscount()));
    }
  }
}
