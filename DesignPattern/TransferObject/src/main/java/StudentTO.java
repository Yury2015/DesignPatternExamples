/**
 * Created by Кузнецов Юрий <kuznetsov_yura@mail.ru> on 2/24/2016 9:14 PM.
 */
public class StudentTO {
    private String name;
    private int rollNo;

    public StudentTO(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }
}
