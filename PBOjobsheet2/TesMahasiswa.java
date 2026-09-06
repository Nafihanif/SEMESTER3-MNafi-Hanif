package PBOjobsheet2;

public class TesMahasiswa {
    public static void main (String args[]) {
        Mahasiswa mhs1=new Mahasiswa();
        mhs1.nim = 101;
        mhs1.name = "Lestari";
        mhs1.address = "Jl. Vinolia No 1A";
        mhs1.className = "1A";

        Mahasiswa mhs2 = new Mahasiswa();
        mhs2.nim = 102;
        mhs2.name = "Budi Santoso";
        mhs2.address = "Jl. Soekarno Hatta No 5";
        mhs2.className = "1A";

        Mahasiswa mhs3 = new Mahasiswa();
        mhs3.nim = 103;
        mhs3.name = "Siti Rahma";
        mhs3.address = "Jl. Veteran No 12";
        mhs3.className = "1B";

        mhs1.tampilanBiodata();
        mhs2.tampilanBiodata();
        mhs3.tampilanBiodata();
    }
}
