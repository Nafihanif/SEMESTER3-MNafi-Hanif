public class ReceiptPrinter {
    private String model;

    public ReceiptPrinter(String model) {
        this.model = model;
    }

    public void print(String text) {
        System.out.println("[" + model + " Printer Output]");
        System.out.println(text);
    }
}
