public class TestOrders {
    public static void main(String[] args) {
    
        // Menu items
    Item item1=new Item();
    Item item2=new Item();
    Item item3=new Item();
    Item item4=new Item();

    item1.name= " Mocha";
    item1.price=10;
    item2.name= "Latte";
    item2.price=8.5;
    item3.name="Drip Coffee";
    item3.price=5;
    item4.name="Capuccino";
    item4.price=6.5;
        
    Order order1=new Order();
    Order order2=new Order();
    Order order3=new Order();
    Order order4=new Order();
    
    order1.name="Cindhuri";
    order1.ready=true;

    order2.name="Jimmy";
    order2.items.add(item1);
    order2.total+=item1.price;
    order2.ready=true;

    order3.name="Noah";
    order3.items.add(item4);
    order3.total+=item4.price;

    order4.name= "Sam";
    order4.items.add(item2);
    order4.items.add(item2);
    order4.total+=item2.price;

        System.out.printf("Name: %s\n", order1.name);
        System.out.printf("Ready: %s\n", order1.ready);

        System.out.printf("Name: %s\n", order2.name);
        System.out.printf("Ready: %s\n", order2.ready);
        System.out.printf("Total: %s\n", order2.total);
        
        System.out.printf("Name: %s\n", order3.name);
        System.out.printf("Ready: %s\n", order3.ready);
        System.out.printf("Total: %s\n", order3.total);

        System.out.printf("Name: %s\n", order4.name);
        System.out.printf("Ready: %s\n", order4.ready);
        // System.out.printf("Total: %s\n", order4.total);
    }
}

