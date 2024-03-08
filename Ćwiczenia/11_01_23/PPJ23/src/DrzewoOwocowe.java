public class DrzewoOwocowe
    extends DrzewoLisciaste{
    String nazwaOwoca;

    public DrzewoOwocowe(boolean wiecznieZielone, int wysokosc, String przekrojDrzewa, int ksztaltLiscia, String nazwaOwoca) {
        super(wiecznieZielone, wysokosc, przekrojDrzewa, ksztaltLiscia);
        this.nazwaOwoca = nazwaOwoca;
    }

    @Override
    public String toString() {
        return "Drzewo owocowe {" +
                "\nnazwa owoca: " + nazwaOwoca +
                "\nksztalt liscia: " + ksztaltLiscia +
                "\nwiecznie zielone: " + (wiecznieZielone ? "tak" : "nie") +
                "\nwysokosc: " + wysokosc + " m" +
                "\nprzekroj drzewa: " + przekrojDrzewa +
                "\n}";
    }

    void zerwijOwoc(){
        System.out.println("Zerwany owoc: " + nazwaOwoca+"\n");
    }
}
