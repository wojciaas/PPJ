public class Ostroslup
    extends Trojkat{
    private double wysokosc;
    public Ostroslup(double bok, double wysokoscBoku, double wysokoscBryly){
        super(bok, wysokoscBoku);
        this.wysokosc = wysokoscBryly;
    }
    public double getPoleOstroslupa(){
        return 4 * getPoleTrojkata();
    }
    public double getObjOstroslupa(){
        return (double)1/3 * getPoleTrojkata() * wysokosc;
    }
    @Override
    public String toString() {
        return "Ostroslup {" +
                "bok = " + getBok() +
                ", wysokosc boku = " + getWysokosc() +
                ", wysokosc = " + wysokosc +
                ", Pole = " + getPoleOstroslupa() +
                ", Obj = " + getObjOstroslupa() +
                '}';
    }
}
