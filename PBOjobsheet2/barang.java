package PBOjobsheet2;

public class barang {
    public String kodeBarang;
    public String namaBarang;
    public int hargaDasar;
    public float diskon;

    public int hitungHargaJual() {
        return (int) (hargaDasar - (hargaDasar * diskon));
    }

    public void tampilBarang() {
        System.out.println("Kode Barang : " + kodeBarang);
        System.out.println("Nama Barang : " + namaBarang);
        System.out.println("Harga Dasar : Rp " + hargaDasar);
        System.out.println("Diskon      : " + diskon * 100 + "%");
        System.out.println("Harga Jual  : Rp " + hitungHargaJual());
    }

    public static void main(String[] args) {
        barang barang1 = new barang();
        barang1.kodeBarang = "KPD-001";
        barang1.namaBarang = "Laptop";
        barang1.hargaDasar = 10000000;
        barang1.diskon = 0.1f;

        barang1.tampilBarang();
    }
}
