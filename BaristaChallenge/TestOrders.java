import java.util.ArrayList;
public class TestOrders {
    public static void main(String[] args) {
    
        // Menu items
    Item item1 = new Item("mocha", 2.0);    
    Item item2 = new Item("latte", 3.0);
    Item item3 = new Item("drip coffee", 2.5);
    Item item4 = new Item("capuccino", 3.5);
        // Order variables -- order1, order2 etc.
    Order order1 = new Order();   
    Order order2 = new Order();
    Order order3 = new Order("Noah");
    Order order4 = new Order("Sam");
    Order order5 = new Order("Joshua");
 
    order1.addItem(item1);
    order2.addItem(item4);

    System.out.println(order1.getStatusMeessage());

    order1.setReady(true);
    System.out.println(order1.getStatusMeessage());
    System.out.println(order1.getOrderTotal());

    order3.addItem(item1);
    order3.addItem(item4);
    order3.addItem(item2);
    order3.display();

    }
}