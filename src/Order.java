import java.util.ArrayList;

public class Order {
    private String customerName;
    private ArrayList<String> items;
    private ArrayList<Double> prices;
    private static int totalOrders = 0;

    public Order(String customerName) {
        this.customerName = customerName;
        this.items = new ArrayList<>();
        this.prices = new ArrayList<>();
        totalOrders++;
    }

    public void addUgItem(String item, double price) {
        if (price <= 0) {
            throw new IllegalArgumentException("Invalid price: must be greater than 0");
        }
        if (item == null || item.trim().isEmpty()) {
            throw new IllegalArgumentException("Invalid item: cannot be empty");
        }
        items.add(item);
        prices.add(price);
    }

    public void addUgDaghanItems(String[] items, double... prices) {
        if (items.length != prices.length) {
            throw new IllegalArgumentException("Items and prices count mismatch");
        }

        for (int i = 0; i < items.length; i++) {
            try {
                addUgItem(items[i], prices[i]);
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }

    public double KwaonTotalAmount() {
        double total = 0.0;
        for (double price : prices) {
            total += price;
        }
        return total;
    }

    public String KwaonOrderSize() {
        int count = items.size();
        if (count == 0) return "Empty order";
        if (count >= 1 && count <= 3) return "Small";
        if (count >= 4 && count <= 6) return "Medium";
        return "Large";
    }

    public static int KwaonTotalOrders() {
        return totalOrders;
    }

    public String KwaonCustomerName() {
        return customerName;
    }

    public int KwaonItemCount() {
        return items.size();
    }

    public String PakitaOrder() {
        return String.format("Order for %s: %d items, Total: $%.2f, Size: %s",
                customerName, KwaonItemCount(), KwaonTotalAmount(), KwaonOrderSize());
    }
}
