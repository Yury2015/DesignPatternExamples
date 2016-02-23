/**
 * Created by Кузнецов Юрий <kuznetsov_yura@mail.ru> on 2/22/2016 2:29 PM.
 */
public class IteratorPatternDemo {
    public static void main(String[] args) {
        NameRepository nameRepository = new NameRepository();

        for (Iterator<String> iter = nameRepository.getIterator(); iter.hasNext();){
            String name = iter.next();
            System.out.println("Name: " + name);
        }

    }
}
