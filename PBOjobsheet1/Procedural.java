package PBOjobsheet1;
public class Procedural {
    public static void main(String[] args) {
        String itemName1 = "Coffee";
        float price1 = 120000.0f;
        int quality1 = 3;

        String itemName2 = "Sugar";
        float price2 = 30000.0f;
        int quality2 = 1;

        System.out.println(itemName1 + ": " + total(price1, quality1));
        System.out.println(itemName2 + ": " + total(price2, quality2));
    }

    static float total(float price, int quality) {
        return price * quality;
    }
}
