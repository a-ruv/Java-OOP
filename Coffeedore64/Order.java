import java.util.ArrayList;

public class Order {
    private String name;
    private boolean ready;
    private ArrayList<Item> items = new ArrayList<Item>();

    public Order(){
        this.name = "Guest";
        this.ready = false;
    }
    
    public Order(String name){
        this.name = name;
        this.ready = false;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public boolean getReady(){
        return ready;
    }

    public void setReady(boolean ready){
        this.ready = ready;
    }

    public ArrayList<Item> getItems(){
        return items;
    }

    public void setItems(ArrayList<Item> items){
        this.items = items;
    }
    
    public String getStatusMeessage(){
        if(ready){
            return "Your order is ready.";
        }
        else{
            return "Thank you for waiting. Your order will be ready soon.";
        }
    }

    public void addItem(Item item) {
        this.items.add(item);
    }

    public double getOrderTotal(){
        double total = 0;
        for (Item i : items) {
            total += i.getPrice();
        }
        return total;
    } 

    public void display(){
        System.out.printf("Customer Name: %s ", this.name);
        System.out.println();
        for (Item i : this.items) {
            System.out.println(i.getName() + " - $" + i.getPrice());
        }
        System.out.println("Total: $" + this.getOrderTotal());
    }
}