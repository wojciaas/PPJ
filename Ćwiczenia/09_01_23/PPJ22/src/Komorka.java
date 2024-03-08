public class Komorka
    extends Telefon{
    String[] historiaPolaczen;

    public Komorka(String interfejsKomunikacyjny, String color) {
        super(interfejsKomunikacyjny, color);
        this.historiaPolaczen = new String[10];
    }

    void wyswietlHistoriePolaczen(){
        for (int i = 0; i < historiaPolaczen.length; i++) {
            System.out.println(historiaPolaczen[i] + "\n");
        }
    }
}
