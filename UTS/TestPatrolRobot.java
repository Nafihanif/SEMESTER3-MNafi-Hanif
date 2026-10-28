package UTS;

public class TestPatrolRobot {
    public static void main(String[] args) {
        Batteray Batteray = new Batteray(16000);
        PatrolBot pr = new PatrolBot("ASINO", 2046, 150,  Batteray);

        pr.increasePower();

        System.out.println("Nama Robot: " + pr.nama);
        System.out.println("CPU Speed: " + pr.CPUSpeed);
        System.out.println("Power: " + pr.Power);
        System.out.println("Battery Capacity: " + pr.baterry.Capacity);
    }
}
