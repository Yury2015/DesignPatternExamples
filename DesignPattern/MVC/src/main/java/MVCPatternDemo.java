/**
 * Created by Кузнецов Юрий <kuznetsov_yura@mail.ru> on 2/26/2016 11:12 PM.
 */
public class MVCPatternDemo {

    public static void main(String[] args) {
        // fetch student record based on his roll no from the database
        Student model = retrieveStudentFromDatabase();

        // cteate a view : to write student details on console
        StudentView view = new StudentView();

        StudentController controller = new StudentController(model, view);
        controller.updateView();

        // update model data
        controller.setStudentName("John");

        controller.updateView();
    }


    private static Student retrieveStudentFromDatabase() {
        Student student = new Student();
        student.setName("Robert");
        student.setRollNo("10");
        return student;
    }
}
