package polymorBuah;

public class Tesbuah {
    public static void main(String[] b) {
        Manusia Ilham = new Manusia();

        Apel myApel = new Apel();
        Pisang mygedang = new Pisang();
        Duren myDuren = new Duren();

        Ilham.MakanBuah(mygedang);
        Ilham.MakanBuah(myApel);
        Ilham.MakanBuah(myDuren);
    }
}
