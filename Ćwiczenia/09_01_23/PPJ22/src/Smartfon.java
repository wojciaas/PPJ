public class Smartfon
    extends Komorka{
    Osoba[] znajomi;

    public Smartfon(String interfejsKomunikacyjny, String color) {
        super(interfejsKomunikacyjny, color);
        znajomi = new Osoba[20];
    }

    void wyswietlHistoriePolaczen(){
        for (int i = 0; i < znajomi.length; i++) {
            for (int j = 0; j < super.historiaPolaczen.length; j++) {
                System.out.println(super.historiaPolaczen[j] == znajomi[j].numer ? znajomi[j] : historiaPolaczen[j]);
            }
        }
    }
}
