package interfacelatihan;

public class PascaSarjana extends Mahasiswa implements ICumlaude, IBerprestasi {
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

    @Override
    public void menjuaraiKompetisi() {
        System.out.println("I have won an INTERNATIONAL competition");
    }

    @Override
    public void membuatPublikasiIlmiah() {
        System.out.println("I have published in an INTERNATIONAL journal");
    }
}
