public class Gatotkaca extends Hero {
    public int speed;

    public Gatotkaca(String nama, int speed) {
        this.nama = nama;
        this.speed = speed;
    }
    
    public void attack(KillAble ka) {
        ka.dead();
        System.out.println("by " + this.nama + " with speed " + this.speed);
    }
}
