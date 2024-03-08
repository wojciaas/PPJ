public class Walec {
    private double promien;
    private double wysokosc;
    public Walec(double promien, double wysokosc) {
        this.promien = promien;
        this.wysokosc = wysokosc;
    }
    public void show(){
        System.out.println("Pole podstawy walca o promieniu " + promien + " to " + Math.PI * Math.pow(promien, 2));
        System.out.println("Objetosc walca o promieniu " + promien + " oraz wysokosci " + wysokosc + " to " + Math.PI * Math.pow(promien, 2) * wysokosc);
        System.out.println();
    }

    public double getPromien() {
        return promien;
    }

    public double getWysokosc() {
        return wysokosc;
    }
}
