package UTS;
public class Robot {
    public String nama;
    public int CPUSpeed;
    public int Power;

    public void increasePower() {
        Power += 10;
    }

    public void reducePower() {
        Power -= 10;
    }
}