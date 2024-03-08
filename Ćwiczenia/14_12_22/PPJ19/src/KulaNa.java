public class KulaNa {
    private double promien;
    public KulaNa(Kwadrat kwadrat){
        promien = kwadrat.getBok()*Math.sqrt(3)/2;
    }
    public KulaNa(Walec walec){
        promien = Math.sqrt(Math.pow(walec.getPromien()*2, 2) + Math.pow(walec.getWysokosc(), 2))/2;
    }

    public double getPromien() {
        return promien;
    }
}
