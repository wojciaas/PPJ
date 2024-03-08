public class Osoba {
    private String imie;
    public Osoba(String imie) {
        this.imie = imie;
    }
    public String wyswietl() {
        return "Imie: " + imie;
    }
    public String getImie() {
        return imie;
    }
}
