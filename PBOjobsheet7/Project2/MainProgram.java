package Project2;

public class MainProgram {
    public static void main(String[] args) {
        // Dynamic Method Dispatch
        Manusia manusia1 = new Manusia();
        Manusia dosen1 = new Dosen();
        Manusia mahasiswa1 = new Mahasiswa();
        
        System.out.println("=== Pemanggilan Metode ===");
        
        // Memanggil metode pada objek parent
        manusia1.bernafas();
        manusia1.makan();
        
        System.out.println("--------------------------");
        
        // Memanggil metode pada objek Dosen (ter-override)
        dosen1.bernafas(); // dari superclass
        dosen1.makan();    // dari subclass (Overriding)
        // dosen1.lembur(); // Error: objek referensi Manusia tidak mengenali lembur() tanpa casting
        
        System.out.println("--------------------------");
        
        // Memanggil metode pada objek Mahasiswa (ter-override)
        mahasiswa1.bernafas(); // dari superclass
        mahasiswa1.makan();    // dari subclass (Overriding)
    }
}