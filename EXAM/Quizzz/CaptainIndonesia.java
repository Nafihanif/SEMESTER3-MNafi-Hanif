public class CaptainIndonesia extends Hero {
    public int level;
    public CaptainIndonesia(String nama, int level) {
        this.nama = nama;
        this.level = level;
    }

    public void attack(KillAble ka) {
        ka.dead();
        System.out.println("by " + this.nama);
    }
}