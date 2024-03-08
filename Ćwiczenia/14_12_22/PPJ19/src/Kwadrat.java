public class Kwadrat {
    private double bok;
    public Kwadrat(double bok) {
        this.bok = bok;
    }
    public void show() {
        System.out.println("Pole powierzchni kwadratu o dlugosci boku " + bok + " to " + Math.pow(bok, 2));
        System.out.println("Objetosc szescianu o boku " + bok + " to " + Math.pow(bok, 3));
        System.out.println();
    }

    public double getBok() {
        return bok;
    }
}
