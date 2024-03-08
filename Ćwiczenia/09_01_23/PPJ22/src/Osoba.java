public class Osoba {
    String imie;
    String nazwisko;
    String numer;

    public Osoba(String imie, String nazwisko, String numer) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.numer = numer;
    }

    @Override
    public String toString() {
        return imie + " " + nazwisko + " " + numer + "\n";
    }
}
