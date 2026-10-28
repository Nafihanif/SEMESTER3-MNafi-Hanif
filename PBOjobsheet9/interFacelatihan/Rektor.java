package interFacelatihan;

public class Rektor {
    public void beriSertifikatCumlaude(ICumlaude mahasiswCumlaude){
        System.out.println("I am the RECTOR, granting a cum laude award.");
        System.out.println("Congratulation! Please introduce yourself..");

        mahasiswCumlaude.lulus();
        mahasiswCumlaude.meraihIPKTinggi();

        System.out.println("-------------------------------------------------");
    }
}
