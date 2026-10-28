package interFacelatihan;

public class PascaSarjana extends Mahasiswa implements ICumlaude {
    public PascaSarjana(String nama){
        super (nama);
    }

    @Override
    public void lulus() {
        System.out.println("I have completed my MASTER'S THESIS"); 
    }

    @Override 
    public void meraihIPKTinggi() {
        System.out.println("mY gpa IS ABOVE 3.71");
    }
}
