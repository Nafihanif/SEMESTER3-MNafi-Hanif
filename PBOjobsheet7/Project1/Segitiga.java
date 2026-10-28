package Project1;
public class Segitiga {
    private int sudut;
    
    public int totalSudut(int sudutA) {
        sudut = 180 - sudutA;
        return sudut;
    }
    
    public int totalSudut(int sudutA, int sudutB) {
        sudut = 180 - (sudutA + sudutB);
        return sudut;
    }
    
    public int keliling(int sisiA, int sisiB, int sisiC) {
        int keliling = sisiA + sisiB + sisiC;
        return keliling;
    }
    
    public double keliling(int sisiA, int sisiB) {

        double c = Math.sqrt(Math.pow(sisiA, 2) + Math.pow(sisiB, 2));
        return c;
    }
    
    public static void main(String[] args) {
        Segitiga s = new Segitiga();
        System.out.println("Total Sudut 1 parameter: " + s.totalSudut(90));
        System.out.println("Total Sudut 2 parameter: " + s.totalSudut(45, 45));
        System.out.println("Keliling 3 parameter   : " + s.keliling(10, 15, 20));
        System.out.println("Keliling 2 parameter   : " + s.keliling(3, 4));
    }
}