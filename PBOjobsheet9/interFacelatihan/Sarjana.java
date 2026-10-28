package interFacelatihan;

public class Sarjana extends Mahasiswa implements ICumlaude {
    public Sarjana(String nama) {
        super(nama);
    }

    @Override 
    public void lulus() {
        System.out.println("Ihave completed my UNDERGRADUATE THESIS");
    }

    @Override 
    public void meraihIPKTinggi(){
        System.out.println("MY GPA is above 3.51");
    }
}

