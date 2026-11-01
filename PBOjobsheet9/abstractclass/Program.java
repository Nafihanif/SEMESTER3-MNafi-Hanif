public class Program {
    public static void main(String[] args) {
        Kucing KucingKampung = new Kucing ();
        Ikan LumbaLumba = new Ikan ();
        // Hewan hewan = new Hewan(); errro because abstrack class 
                    
        Orang ani = new Orang("Ani");
        Orang budi = new Orang("Budi");

        ani.peliharaHewan(KucingKampung);
        budi.peliharaHewan(LumbaLumba);

        ani.ajakPeliharaanJalanJalan();
        budi.ajakPeliharaanJalanJalan();
    }
}
