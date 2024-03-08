public class DrzewoIglaste
    extends DrzewoPPJ22 {
    int iloscIgiel;
    double dlugoscSzyszki;

    public DrzewoIglaste(boolean wiecznieZielone, int wysokosc, String przekrojDrzewa, int iloscIgiel, double dlugoscSzyszki) {
        super(wiecznieZielone, wysokosc, przekrojDrzewa);
        this.iloscIgiel = iloscIgiel;
        this.dlugoscSzyszki = dlugoscSzyszki;
    }

    @Override
    public String toString() {
        return "DrzewoIglaste {" +
                "\niloscIgiel: " + iloscIgiel +
                "\ndlugoscSzyszki: " + dlugoscSzyszki + " cm" +
                "\nwiecznieZielone: " + wiecznieZielone +
                "\nwysokosc: " + wysokosc + " m" +
                "\nprzekrojDrzewa: " + przekrojDrzewa +
                "\n}";
    }

    void zerwijOwoc() throws DrzewoBezOwocoweException{
        throw new DrzewoBezOwocoweException();
    }
}
