package Experiment5;

public class Manager extends Karyawan {
    public int tunjangan; 

    public Manager(){
    }
    public void tampilanDataManager(){
        super.tampilanDataKaryawan();
        System.out.println("Tunjangan     : " + tunjangan);
        System.out.println("Total Gaji    : " + (super.gaji + tunjangan));
    }
}
