import java.io.ByteArrayOutputStream;
import java.io.ObjectOutputStream;

public class MyUtils {

  public static String serializeToIntoAString(Object o) {
    String results = "";
    try {
      ByteArrayOutputStream bytes = new ByteArrayOutputStream();
      ObjectOutputStream stream = new ObjectOutputStream(bytes);
      stream.writeObject(o);
      stream.flush();
      results = bytesToString(bytes.toByteArray());
    } catch(Exception e) {
        e.printStackTrace();
    }
    return results;
  }

  private static String bytesToString(byte[] bytes) {
    StringBuffer result = new StringBuffer();
    for (int i = 0; i < bytes.length; i++) {
      result.append(bytes[i]);
      result.append(" ");
    }
    return result.toString();
  }
}
