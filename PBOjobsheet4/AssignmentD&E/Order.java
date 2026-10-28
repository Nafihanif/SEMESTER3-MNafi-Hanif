public class Order {
    private String orderId;
    private Customer customer;       
    private OrderItem[] items;       

    public Order(String orderId, Customer customer, String[] itemNames, double[] prices) {
        this.orderId = orderId;
        this.customer = customer;    

        this.items = new OrderItem[itemNames.length];
        for (int i = 0; i < itemNames.length; i++) {
            this.items[i] = new OrderItem(itemNames[i], prices[i]);
        }
    }

    public void printInvoice(ReceiptPrinter printer) {
        String text = "Order ID: " + orderId + "\n";
        text += "Customer: " + customer.getName() + "\n";
        text += "Items:\n";
        double total = 0;
        for (OrderItem item : items) {
            text += "- " + item.getItemName() + ": $" + item.getPrice() + "\n";
            total += item.getPrice();
        }
        text += "Total: $" + total + "\n";

        printer.print(text); 
    }

    private static class OrderItem {
        private final String itemName;
        private final double price;

        private OrderItem(String itemName, double price) {
            this.itemName = itemName;
            this.price = price;
        }

        private String getItemName() {
            return itemName;
        }

        private double getPrice() {
            return price;
        }
    }
}
