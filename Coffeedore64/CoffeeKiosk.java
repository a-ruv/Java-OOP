import java.util.ArrayList;
public class CoffeeKiosk {
    ArrayList<Item> menu = new ArrayList<Item>();
    ArrayList<Order> orders = new ArrayList<Order>();

    public CoffeeKiosk(){

    }

    public void addMenuItem(String name, double price){
        Item newItem = new Item(name, price);
        menu.add(newItem);
        int index = menu.indexOf(newItem);
        newItem.setIndex(index);
    }

    public void displayMenu(){
        for(Item i : this.menu){
            System.out.println(i.getindex() + " " + i.getName() + "--$" + i.getPrice());
        }
    }

        public void newOrder() {
        System.out.println("Please enter customer name for new order:");
        String name = System.console().readLine();
        Order newOrder = new Order(name);
        displayMenu();
        System.out.println("Please enter a menu item index or q to quit:");
        String itemNumber = System.console().readLine();
        
        while(!itemNumber.equals("q")) {
            int i = Integer.parseInt(itemNumber);
            if(i < menu.size()){
                Item orderItem = menu.get(i);
                newOrder.addItem(orderItem);
            }
            else {
                System.out.println("Thats not on our menu.");
            }
            System.out.println("Please enter index of iteam or press q to exit");
            itemNumber = System.console().readLine();
        }
            newOrder.display();
            this.orders.add(newOrder);
    }
}