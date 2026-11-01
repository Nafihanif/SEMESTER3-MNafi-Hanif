package interfacelatihan;

public class Program {
    public static void main(String[] args){
        Rektor pakRektor = new Rektor();

        //Mahasiswa mhsBiasa = new Mahasiswa("Charline");
        Sarjana sarjanaCumlaude = new Sarjana("Dini");
        PascaSarjana masterCumlaude = new PascaSarjana("Elok");

        //pakRektor.beriSertifikatCumlaude(mhsBiasa);
        // pakRektor.beriSertifikatCumlaude(sarjanaCumlaude);
        // pakRektor.beriSertifikatCumlaude(masterCumlaude);

        pakRektor.berisertifikatMawapres(sarjanaCumlaude);
        pakRektor.berisertifikatMawapres(masterCumlaude);
    }
}
