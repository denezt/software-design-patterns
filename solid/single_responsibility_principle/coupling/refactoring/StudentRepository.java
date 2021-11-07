// Responsibility: Handle Database Operations

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;

import java.io.ByteArrayOutputStream;
import java.io.ObjectOutputStream;

public class StudentRepository {

  public void save(Student student){
    // Serialize object into a string representation
    String objectStr = "";
    try {
      objectStr = this.serializeToString(this);
    } catch(Exception e) { }

    Connection connection = null;
    Statement stmt = null;
    try {
      Class.forName("com.mysql.jdbc.Driver");
      connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/MyDB","root","password");
      stmt = connection.createStatement();
      stmt.execute("INSERT INTO STUDENT VALUES ("+ objectStr +")");
    } catch(Exception e) {
      e.printStackTrace();
    }
  }

  public static String serializeToString(Object o) throws Exception {
    ByteArrayOutputStream bytes = new ByteArrayOutputStream();
    ObjectOutputStream stream = new ObjectOutputStream(bytes);
    stream.writeObject(o);
    stream.flush();
    return bytesToString(bytes.toByteArray());
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
