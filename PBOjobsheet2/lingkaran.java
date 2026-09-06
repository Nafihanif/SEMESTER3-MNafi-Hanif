package PBOjobsheet2;

public class lingkaran {
    public double phi;
    public double r;
    
    public double luasLingkaran() {
        return phi * r * r;
    }

    public double kelilingLingkaran() {
        return 2 * phi * r;
    }

    public static void main(String[] args) {
        lingkaran lingkaran1 = new lingkaran();
        lingkaran1.phi = 3.14;
        lingkaran1.r = 7;

        System.out.println("Luas Lingkaran: " + lingkaran1.luasLingkaran());
        System.out.println("Keliling Lingkaran: " + lingkaran1.kelilingLingkaran());
    }
}
