package interFacelatihan;

public class Mahasiswa implements ICumlaude {
    protected String nama;

    public Mahasiswa (String nama){
        this.nama = nama;
    } 

    public void kuliahDikampus() {
        System.out.println("I am student, my name is " + this.nama);
        System.out.println("I attend Classes on campus.");
    }

    @Override
    public void lulus() {
        System.out.println("Mahasiswa lulus.");
    }

    @Override
    public void meraihIPKTinggi() {
        System.out.println("Mahasiswa meraih IPK tinggi.");
    }
}
