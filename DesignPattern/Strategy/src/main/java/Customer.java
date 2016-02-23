import java.util.ArrayList;
import java.util.List;

/**
 * Created by Кузнецов Юрий <kuznetsov_yura@mail.ru> on 2/22/2016 12:06 AM.
 */
public class Customer {
    private List<Double> drinks;
    private BillingStrategy strategy;

    public Customer(BillingStrategy strategy) {
        this.drinks = new ArrayList<>();
        this.strategy = strategy;
    }

    public void add(double price, int quantity) {
        drinks.add(strategy.getActPrice(price * quantity));
    }


    // Payment of bill
    public void printBill() {
        double sum = 0;
        for (Double i : drinks){
            sum += i;
        }
        System.out.println("Total due: " + sum);
        drinks.clear();
    }

    // Set strategy
    public void setStrategy(BillingStrategy strategy) {
        this.strategy = strategy;
    }
}
