package PBOjobsheet3.Encap;
import java.util.Scanner;
public class TestLogistik {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        kontainer kontainerAlfa = new kontainer("REQ-9988", "PT. Maju Bersama", 5000);

        System.out.println("Nama Pemilik Kontainer: " + kontainerAlfa.getNamaPemilik());
        System.out.println("Kapasitas Maksimal: " + kontainerAlfa.getKapasitasMaksimal() + " kg");

        System.out.print("\nMasukkan berat muatan baru yang ingin ditambahkan (kg): ");
        double tambah1 = scanner.nextDouble();
        System.out.println("Memasukkan muatan baru seberat " + tambah1 + " kg...");
        kontainerAlfa.tambahMuatan(tambah1);
        System.out.println("Berat muatan saat ini: " + kontainerAlfa.getBeratMuatanSaatIni() + " kg");

        System.out.print("\nMasukkan berat muatan baru yang ingin ditambahkan (kg): ");
        double tambah2 = scanner.nextDouble();
        System.out.println("Memasukkan muatan baru seberat " + tambah2 + " kg...");
        kontainerAlfa.tambahMuatan(tambah2);
        System.out.println("Berat muatan saat ini: " + kontainerAlfa.getBeratMuatanSaatIni() + " kg");

        System.out.print("\nMasukkan berat muatan yang ingin diturunkan (kg): ");
        double turun1 = scanner.nextDouble();
        System.out.println("Membongkar muat/menurunkan barang seberat " + turun1 + " kg...");
        kontainerAlfa.turunkanMuatan(turun1);
        System.out.println("Berat muatan saat ini: " + kontainerAlfa.getBeratMuatanSaatIni() + " kg");

        System.out.print("\nMasukkan berat muatan yang ingin diturunkan (kg): ");
        double turun2 = scanner.nextDouble();
        System.out.println("Membongkar muat/menurunkan barang seberat " + turun2 + " kg...");
        kontainerAlfa.turunkanMuatan(turun2);
        System.out.println("Berat muatan saat ini: " + kontainerAlfa.getBeratMuatanSaatIni() + " kg");

        scanner.close();
    }
}
