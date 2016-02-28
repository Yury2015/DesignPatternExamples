/**
 * Created by Кузнецов Юрий <kuznetsov_yura@mail.ru> on 2/28/2016 12:59 PM.
 */
public class CompositeEntity {
    private CoarseGrainedObject cgo = new CoarseGrainedObject();

    public String[] getData() {
        return cgo.getData();
    }

    public void setData(String data1, String data2) {
        cgo.setData(data1, data2);
    }
}
