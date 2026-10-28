package EXAM;

public class Remote {
    private String Language;
    private int BateryNumber;

    public Remote(String Language, int BateryNumber){
        this.Language = Language;
        this.BateryNumber = BateryNumber;
    }

    public void setLanguage(String Language) {
        this.Language = Language;
    }

    public String getLanguage() {
        return Language;
    }

    public void setBateryNumber(int BateryNumber) {
        this.BateryNumber = BateryNumber; 
    }

    public int GetBateryNumber(){
        return BateryNumber;
    }

}
