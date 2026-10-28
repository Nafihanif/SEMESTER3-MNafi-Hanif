package UTS;

public class PatrolBot extends Robot {
    public Batteray baterry;

    public PatrolBot(String nama, int CPUSpeed, int Power, Batteray baterry) {
        this.nama = nama;
        this.CPUSpeed = CPUSpeed;
        this.Power = Power;
        this.baterry = baterry;
    }

    public void increasePower(){
        this.Power += 20;
    }
}
