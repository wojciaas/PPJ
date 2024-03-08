public class Trojkat {
    private double bok;
    private double wysokosc;
    public Trojkat(double bok, double wysokosc) {
        this.bok = bok;
        this.wysokosc = wysokosc;
    }
    public double getBok() {
        return bok;
    }
    public double getWysokosc() {
        return wysokosc;
    }
    public double getPoleTrojkata(){
        return (double)1/2 * bok * wysokosc;
    }

    @Override
    public String toString() {
        return "Trojkat {" +
                "bok = " + bok +
                ", wysokosc = " + wysokosc +
                ", Pole = " + getPoleTrojkata() +
                '}';
    }
}
