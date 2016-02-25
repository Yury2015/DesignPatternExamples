import java.util.List;

/**
 * Created by Кузнецов Юрий <kuznetsov_yura@mail.ru> on 2/25/2016 11:19 PM.
 */
public interface StudentDao {
    public List<Student> getAllStudents();
    public Student getStudent(int rollNo);
    public void updateStudent(Student student);
    public void deleteStudent(Student student);
}
