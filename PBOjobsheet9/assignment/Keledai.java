package assignment;

public class Keledai extends Binatang implements IHerbivora {
    private String suara;
    private String warnaBulu;

    public Keledai(String nama, int jmlkaki, String suara, String warnaBulu) {
        super(nama, jmlkaki);
        this.suara = suara;
        this.warnaBulu = warnaBulu;
    }

    @Override 
    public void displayMakan(){
        System.out.println("Type: Herbivore");
        System.out.println("Food: Plants");
    }

    @Override
    public void displayBinatang(){
        super.displayBinatang();
        System.out.println("Sound: " + this.suara);
        System.out.println("Fur Colour: " + this.warnaBulu);
    }

    public void displayData() {
        this.displayMakan();
        this.displayBinatang();
    }
}
