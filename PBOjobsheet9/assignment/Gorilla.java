package assignment;

public class Gorilla extends Binatang implements IKarnivora, IHerbivora{
    private String suara;
    private String warnaBulu;

    public Gorilla(String nama, int jmlKaki, String suara, String warnaBulu) {
        super(nama, jmlKaki);
        this.suara = suara;
        this.warnaBulu = warnaBulu;
    }

    @Override
    public void displayMakan() {
        System.out.println("Type: Carnivore + Herbivore");
        System.out.println("Food: Meat + Plants");
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
