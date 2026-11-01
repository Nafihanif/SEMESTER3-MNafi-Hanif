package assignment;

public class Singa extends Binatang implements IKarnivora {
    private String suara;
    private String warnaBulu;

    public Singa(String nama, int jmlKaki, String suara, String warnaBulu) {
        super(nama, jmlKaki);
        this.suara = suara;
        this.warnaBulu = warnaBulu;
    }

    @Override
    public void displayMakan() {
        System.out.println("Type: Carnivore");
        System.out.println("Food: Meat");
    }

    @Override
    public void displayBinatang() {
        super.displayBinatang();
        System.out.println("Sound: " + this.suara);
        System.out.println("Fur Colour: " + this.warnaBulu);
    }

    public void displayData() {
        this.displayMakan();
        this.displayBinatang();
    }
}
