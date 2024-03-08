public class DrzewoLisciaste
    extends Drzewo{
    int ksztaltLiscia;

    public DrzewoLisciaste(boolean wiecznieZielone, int wysokosc, String przekrojDrzewa, int ksztaltLiscia) {
        super(wiecznieZielone, wysokosc, przekrojDrzewa);
        this.ksztaltLiscia = ksztaltLiscia;
    }

    @Override
    public String toString() {
        return "Drzewo lisciaste {" +
                "\nksztalt liscia: " + ksztaltLiscia +
                "\nwiecznie zielone: " + (wiecznieZielone ? "tak" : "nie") +
                "\nwysokosc: " + wysokosc + " m" +
                "\nprzekroj drzewa: " + przekrojDrzewa +
                "\n}\n";
    }
}
