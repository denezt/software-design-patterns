// Refactoring: We have removed the tight coupling
// Responsibility: Handle core student profile data
import java.util.Date;

public class Student {
  private String studentId;
  private Date studentDOB;
  private String address;

  public void save(){
    // So now it is possible to change the underlining database.
    new StudentRepository().save(this);
  }

  public String getStudentId(){
    return studentId;
  }

  public void setStudentId(String studentId){
    // This can be changed without the need
    // to recompile all other files.
    // this.studentId = studentId + "_new";
    this.studentId = studentId;
  }
}
