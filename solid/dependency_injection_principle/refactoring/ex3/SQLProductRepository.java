import java.util.Arrays;
import java.util.List;

public class SQLProductRepository implements ProductRepository {
  public List<String> getAllProductNames(){
    return Arrays.asList("soap","toothpaste");
  }
}
