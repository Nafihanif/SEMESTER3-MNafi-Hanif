package id.ac.polinema.classrelation.experiment1;
public class MainExperiment1 {
    public static void main(String[] args) {
        Processor p = new Processor("Inter i5", 3);
        Laptop l = new Laptop("Thinkpad", p);
        l.info();

        System.out.println();
        Processor p1 = new Processor();
        p1.setBrand("intel i5");
        p1.setCache(4);
        Laptop l1 = new Laptop();
        l1.setProc(p1);
        l1.info();

        System.out.println();
        Laptop l2 = new Laptop("Thinkpad", new Processor("Intel i5", 3));
        l2.info();
    }
}
