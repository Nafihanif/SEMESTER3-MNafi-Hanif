package PBOjobsheet3.Bioskop;

public class TestBioskop {
    public static void main(String[] args) {
        Tiket tiket1 = new Tiket("Avengers: Endgame", -500000.0);

        System.out.println("Film: " + tiket1.getJudulFilm());
        System.out.println("Harga Tiket: " + tiket1.getHargaDasar());
        System.out.println("Status Lunas? " + (tiket1.isStatusPembayaran() ? "Lunas" : "Belum Lunas"));

        System.out.println("\nMemproses pembayaran...");
        tiket1.lakukanPembayaran();
        System.out.println("Status Lunas Terbaru? " + (tiket1.isStatusPembayaran() ? "Lunas" : "Belum Lunas"));

    }
}
