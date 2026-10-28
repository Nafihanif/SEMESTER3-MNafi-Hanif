package Trial;

public class PersegiPanjang {
    public int panjang;
    public int lebar;

    public PersegiPanjang(int p, int l) {
        this.panjang = p;
        this.lebar = l;
    }

    public int luas() {
        return panjang * lebar;
    }
}
