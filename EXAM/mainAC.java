package EXAM;

public class mainAC {
    public static void main(String[] args) {
        Compressor comp = new Compressor("R12", 1000);
        Remote rmt = new Remote ("English", 2);
        AirConditioner ac = new AirConditioner("Daikin", 2015, comp, rmt);

        System.out.println("AC Brand: " + ac.getBrand());
        System.out.println("Compressor capasity: " + ac.getMainCompressor().getCapacity());
        System.out.println("Remote language: " + ac.getMainRemote().getLanguage());

    }
}
