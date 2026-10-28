package id.ac.polinema.classrelation.experiment1;
public class Processor {
    private String brand;
    private Double cache;

    public Processor(String brand, double cache) {
    this.brand = brand;
    this.cache = cache;
    }  

    public Processor() {
    }

    public void setBrand(String brand) {
    this.brand = brand;
    }

    public String getBrand() {
    return brand;
    }

    public void setCache(double cache) {
    this.cache = cache;
    }

    public double getCache() {
    return cache;
    }

    public void info() {
    System.out.printf("Processor Brand = %s\n", brand);
    System.out.printf("Cache Memory = %.2f\n", cache);
    }
}
