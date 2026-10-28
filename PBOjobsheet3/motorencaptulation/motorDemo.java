package PBOjobsheet3.motorencaptulation;

public class motorDemo {
    public static void main(String[] args) {
        motor Motor = new motor();
        Motor.printStatus();
        Motor.tambahKecepatan();
        Motor.printStatus();

        Motor.nyalakanMesin();
        Motor.printStatus();

        Motor.tambahKecepatan();
        Motor.printStatus();

        Motor.tambahKecepatan();
        Motor.printStatus();    

        Motor.tambahKecepatan();
        Motor.printStatus();

        Motor.matikanMesin();
        Motor.printStatus();
    }
}


