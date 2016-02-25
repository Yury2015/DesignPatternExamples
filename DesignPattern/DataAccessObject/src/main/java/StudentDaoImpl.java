import java.util.ArrayList;
import java.util.List;

/**
 * Created by Кузнецов Юрий <kuznetsov_yura@mail.ru> on 2/25/2016 11:25 PM.
 */
public class StudentDaoImpl implements StudentDao {

    // list is working as a database
    List<Student> students;

    public StudentDaoImpl() {
        students = new ArrayList<>();
        Student student1 = new Student("Robert", 0);
        Student student2 = new Student("Jogn", 1);
        students.add(student1);
        students.add(student2);
    }

    // retrive list of students from the database
    @Override
    public List<Student> getAllStudents() {
        return students;
    }

    @Override
    public Student getStudent(int rollNo) {
        return students.get(rollNo);
    }

    @Override
    public void updateStudent(Student student) {
        students.get(student.getRollNo()).setName(student.getName());
        System.out.println("Student: RollNo " + student.getRollNo() + ", updated in the database");
    }

    @Override
    public void deleteStudent(Student student) {
        students.remove(student.getRollNo());
        System.out.println("Student: RollNo " + student.getRollNo() + ", deleted from database");
    }
}
