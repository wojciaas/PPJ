public abstract class DrzewoPPJ22 {
    boolean wiecznieZielone;
    int wysokosc;
    String przekrojDrzewa;

    public DrzewoPPJ22(boolean wiecznieZielone, int wysokosc, String przekrojDrzewa) {
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
                "\n}";
    }

    void zerwijOwoc() throws DrzewoBezOwocoweException {
        throw new DrzewoBezOwocoweException();
    }
}
