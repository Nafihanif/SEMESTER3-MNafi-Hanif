package polymorBuah;

public class Manusia {
    public void MakanBuah(Fruit x){
        if (x instanceof Apel) {
            System.out.println("Apel langsung dimakan !");
            ((Apel)x).TampilkanBiji();
        }
        if (x instanceof Duren) {
            System.out.println("Buka durian menggunakan linggis dulu !");
            ((Duren)x).TampilkanDuri();
        }
        else if (x instanceof Pisang) {
            System.out.println("Pisang dikupas terlebih dahulu !");
            ((Pisang)x).TampilkanKulit();
        }
        
        System.out.println("Rasanya " + x.Rasa);
        System.out.println("Water kapasistas " + x.Water);
    }
}
