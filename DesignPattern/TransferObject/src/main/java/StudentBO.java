import java.util.ArrayList;
import java.util.List;

/**
 * Created by Кузнецов Юрий <kuznetsov_yura@mail.ru> on 2/24/2016 11:22 PM.
 */
public class StudentBO {

    // list is working as a database
    List<StudentTO> students;

    public StudentBO() {
        students = new ArrayList<StudentTO>();
        StudentTO student1 = new StudentTO("Robert", 0);
        StudentTO student2 = new StudentTO("John", 1);
        students.add(student1);
        students.add(student2);
    }

    public void deleteStudent(StudentTO student) {
        students.remove(student.getRollNo());
        System.out.println("Student: Roll No " + student.getRollNo() + ", deleted from database");
    }

    // retrieve list of students from the database
    public List<StudentTO> getAllStudents() {
        return students;
    }

    public StudentTO getStudent(int rollNo) {
        return students.get(rollNo);
    }

    public void updateStudent(StudentTO student) {
        students.get(student.getRollNo()).setName(student.getName());
        System.out.println("Student: Roll No " + student.getRollNo() + ", updated in the database");
    }

}
