public class MainAssignment {
    public static void main(String[] args) {
        Customer customer = new Customer("John Doe");
        ReceiptPrinter printer = new ReceiptPrinter("Epson Thermal");

        String[] itemNames = {"Laptop Stand", "Wireless Mouse"};
        double[] prices = {25.0, 15.0};

        Order order = new Order("ORD-101", customer, itemNames, prices);
        order.printInvoice(printer);
    }
}
