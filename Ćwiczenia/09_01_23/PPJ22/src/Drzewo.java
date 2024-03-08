public class Drzewo {
    boolean wiecznieZielone;
    int wysokosc;
    String przekrojDrzewa;

    public Drzewo(boolean wiecznieZielone, int wysokosc, String przekrojDrzewa) {
        this.wiecznieZielone = wiecznieZielone;
        this.wysokosc = wysokosc;
        this.przekrojDrzewa = przekrojDrzewa;
    }

    @Override
    public String toString() {
        return "Drzewo {\n" +
                "wiecznie zielone: " + (wiecznieZielone ? "tak" : "nie") +
                "\nwysokosc: " + wysokosc + " m" +
                "\nprzekroj drzewa: " + przekrojDrzewa +
                "\n}\n";
    }
}
