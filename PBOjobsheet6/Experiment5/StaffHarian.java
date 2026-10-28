package Experiment5;
public class StaffHarian extends Staff {
    private int jmlJamKerja;

    public StaffHarian() {
    }

    public StaffHarian(String nama, String alamat, String jk, int umur, int gaji, int lembur, int potongan, String telepon, String unitKerja, int jumlahJamKerja) {
        super(nama, alamat, jk, umur, gaji, lembur, potongan);
        this.jmlJamKerja = jumlahJamKerja;
    }

    public void tampilStaffHarian() {
        System.out.println("============= Data Staff Harian =============");
        super.tampilDataStaff();
        System.out.println("Jumlah Jam Kerja: " + jmlJamKerja);
        System.out.println("Gaji Bersih     : " + (gaji*jmlJamKerja + lembur - potongan));

    }
    
}
