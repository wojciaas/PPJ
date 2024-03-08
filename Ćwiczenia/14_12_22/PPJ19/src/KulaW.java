public class KulaW {
    private double r;
    public KulaW(Walec walec) {
        if(walec.getWysokosc() > walec.getPromien()*2){
            r = walec.getPromien();
        } else {
            r = walec.getWysokosc()/2;
        }
    }
    public KulaW(Kwadrat szescian){
        r = szescian.getBok()/2;
    }
    public double getR() {
        return r;
    }
}
