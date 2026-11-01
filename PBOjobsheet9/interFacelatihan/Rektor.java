package interfacelatihan;

public class Rektor {
    public void beriSertifikatCumlaude(ICumlaude mahasiswCumlaude){
        System.out.println("I am the RECTOR, granting a cum laude award.");
        System.out.println("Congratulation! Please introduce yourself..");

        mahasiswCumlaude.lulus();
        mahasiswCumlaude.meraihIPKTinggi();

        System.out.println("-------------------------------------------------");
    }
    public void berisertifikatMawapres(IBerprestasi mahasiswaBerprestasi){
        System.out.println("I am the RECTOR, granting a MAWAPRES award.");
        System.out.println("Congratulations! How did you achieve this?");

        mahasiswaBerprestasi.menjuaraiKompetisi();
        mahasiswaBerprestasi.membuatPublikasiIlmiah();

        System.out.println("-------------------------------------------");
    }
}
