package EXAM;
public class AirConditioner {
    private String brand;
    private int yearprod;
    private Compressor MainCompressor;
    private Remote MainRemote;

    public AirConditioner(String brand, int yearprod, Compressor MainCompressor, Remote MainRemote) {
        this.brand = brand;
        this.yearprod = yearprod;
        this.MainCompressor = MainCompressor;
        this.MainRemote = MainRemote;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setYearpord(int yearprod) {
        this.yearprod = yearprod;
    }

    public int getYearprod() {
        return yearprod;
    }

    public void setMainCompressor(Compressor MainCompressor) {
        this.MainCompressor = MainCompressor;
    }

    public Compressor getMainCompressor() {
        return MainCompressor;
    }

    public void setMainRemote(Remote MainRemote) {
        this.MainRemote = MainRemote;
    }

    public Remote getMainRemote() {
        return MainRemote;
    }
}
