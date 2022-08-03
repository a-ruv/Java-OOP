import java.util.ArrayList;

public class TestOrders {
    public static void main(String[] args) {

        CoffeeKiosk coffeeKiosk = new CoffeeKiosk();
    
        coffeeKiosk.addMenuItem("mocha", 2.0);
        coffeeKiosk.addMenuItem("cappucino", 3.0);
        coffeeKiosk.addMenuItem("drip coffee", 2.5);
        coffeeKiosk.addMenuItem("latte", 3.5);
    
        coffeeKiosk.newOrder();
    }
}