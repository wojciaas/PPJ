public class Spawacz
    extends Osoba{
    private int stazPracy;
    public Spawacz(String imie, int stazPracy) {
        super(imie);
        this.stazPracy = stazPracy;
    }
    public String wyswietl(){
        return super.wyswietl() + ", staz pracy: " + stazPracy;
    }
}

