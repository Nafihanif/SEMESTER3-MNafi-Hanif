public class TesMain {

    public static void main(String[] args) {
        Gatotkaca g = new Gatotkaca("Gatots", 99);
        CaptainIndonesia ci = new CaptainIndonesia("Caps", 77);

        g.attack(new Evil());
        // g = new Gatotkaca("Gatots", 99);
        // attack = gatotkaca.attack(new Evil());
        ci.attack(new Evil());
        ci.attack(new Villain());

        // g.attack(new Evil());
        // ci.attack(new Evil());
        // ci.attack(new Villain());
    }
}