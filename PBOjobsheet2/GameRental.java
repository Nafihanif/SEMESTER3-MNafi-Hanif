package PBOjobsheet2;

public class GameRental {
    public String DI_member;
    public String memeberName;
    public String gameName;
    public double pricePerDays;
    private int durationDay; 

    public GameRental(String DI_member, String memeberName, String gameName, double pricePerDays, int durationDay) {
        this.DI_member = DI_member;
        this.memeberName = memeberName;
        this.gameName = gameName;
        this.pricePerDays = pricePerDays;
        this.durationDay = durationDay;
    }

    public double calculateAmountToPay() {
        return this.pricePerDays * this.durationDay;
    }

    public void displayRentalData() {
        System.out.println("=== Detail Transaksi Rental ===");
        System.out.println("ID Transaksi : " + this.DI_member);
        System.out.println("Nama Member  : " + this.memeberName);
        System.out.println("Nama Game    : " + this.gameName);
        System.out.println("Lama Pinjam  : " + this.durationDay + " hari");
        System.out.println("Harga/Hari   : Rp " + this.pricePerDays);
        System.out.println("Total Bayar  : Rp " + calculateAmountToPay());
        System.out.println("-------------------------------");
    }
}
