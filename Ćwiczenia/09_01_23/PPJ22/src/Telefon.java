public class Telefon {
    String interfejsKomunikacyjny;
    String color;
    public Telefon(String interfejsKomunikacyjny, String color) {
        this.interfejsKomunikacyjny = interfejsKomunikacyjny;
        this.color = color;
    }

    void zadzwon(String numer){
        System.out.println(numer);
    }
    void wyswietlHistoriePolaczen(){
        System.out.println("brak historii");
    }
}
