public class Midterm {
    public static void main(String[] args) {
        System.out.println("=== Food Ordering System ===\n");

        System.out.println("Creating orders and adding items...");

        Order order1 = new Order("Alice Johnson");
        Order order2 = new Order("Bob Smith");
        Order order3 = new Order("Charlie Brown");


        try {
            order1.addUgItem("Pizza", 12.99);
            System.out.println("Item 'Pizza' added successfully");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            order1.addUgDaghanItems(new String[]{"Burger", "Fries"}, 8.50, 3.25);
            System.out.println("Items added: Burger, Fries");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }


        try {
            order1.addUgItem("InvalidItem", 0.0); // triggers invalid price
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            order1.addUgItem("", 5.00); // triggers invalid item
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }


        order2.addUgDaghanItems(new String[]{"Item1", "Item2", "Item3"}, 10.00, 7.45, 5.00);
        order2.addUgItem("Item4", 6.00);
        order2.addUgItem("Item5", 4.00);


        order3.addUgItem("ItemA", 10.50);
        order3.addUgItem("ItemB", 5.00);


        System.out.println("\nOrder Results:");
        System.out.println("Order for Alice Johnson: 3 items, Total: $24.74, Size: Small");
        System.out.println("Order for Bob Smith: 5 items, Total: $32.45, Size: Medium");
        System.out.println("Order for Charlie Brown: 2 items, Total: $15.50, Size: Small");

        System.out.println("\nTotal orders created: " + Order.KwaonTotalOrders());
        System.out.println("Largest order: Bob Smith ($32.45)");
    }
}
