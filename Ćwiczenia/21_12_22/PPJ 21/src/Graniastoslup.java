public class Graniastoslup
    extends Trojkat {
    private double wysokosc;

    public Graniastoslup(double bok, double wysokoscBoku, double wysokoscBryly) {
        super(bok, wysokoscBoku);
        this.wysokosc = wysokoscBryly;
    }
    public double getPoleGran(){
        return 2 * getPoleTrojkata() * 3 * getBok() * wysokosc;
    }
    public double getObj(){
        return getPoleTrojkata() * wysokosc;
    }
    @Override
    public String toString() {
        return "Graniastoslup{" +
                "bok = " + getBok() +
                ", wysokosc podstawy = " + getWysokosc() +
                ", wysokosc bryly = " + wysokosc +
                ", Pole = " + getPoleGran() +
                ", Obj = " + getObj() +
                '}';
    }
}
