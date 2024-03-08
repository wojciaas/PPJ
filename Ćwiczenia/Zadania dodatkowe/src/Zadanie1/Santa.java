package Zadanie1;

public class Santa
    extends Osoba {
    private boolean isWorking;
    private String cityLocation;
    private String[] cityHistory;
    private static String[] naughtyKids;
    private Gift[] Gifts;
    void startWork(){
        if(isWorking) {
            System.out.println("Mikolaj juz pracuje");
        } else {
            isWorking = true;
        }
    }
    void stopWork(){
        if(Gifts.length != 0) {
            System.out.println("Nie wszystkie prezenty zostaly dostarczone");
        } else {
            isWorking = false;
        }
    }
    void giveGift(Child c){
        boolean isNaughty = false;
        for(String n : naughtyKids){
            if(n.equals(c.imie) && n.equals(c.nazwisko) && n.equals(c.dreamGift)){
                isNaughty = true;
            }
        }
        if (isNaughty){
            System.out.println("Dziecko znajduje sie na liscie niegrzecznych osob!");
        } else {
            if (Gifts.length != 0) {
                System.out.println(c.imie + " dziekuje za prezent");
                if(Gifts[Gifts.length - 1].content.equals(c.dreamGift)){
                    System.out.println(c.imie + " marzyl o tym prezencie");
                }
                Gift[] tmp = new Gift[Gifts.length - 1];
                for (int i = 0; i < tmp.length; i++) {
                    tmp[i] = Gifts[i];
                }
                Gifts = tmp;
            } else {
                System.out.println("Worek z prezentami jest pusty!");
            }
        }
    }
    void visitCity(String city){
        cityLocation = city;
        boolean isAppear = false;
        for (String c : cityHistory) {
            if (c.equals(city)) isAppear = true;
        }
        String[] tmp = new String[cityHistory.length + 1];
        for (int i = 0; i < cityHistory.length; i++) {
            tmp[i] = cityHistory[i];
        }
        cityHistory = tmp;
        cityHistory[cityHistory.length - 1] = cityLocation;
        if (isAppear){
            System.out.println("Juz odwiedzono to miasto");
        }
    }
    Gift findHeaviest(){
        if(Gifts.length == 0){
            System.out.println("noGiftsLeftException");
            return null;
        }
        Gift heaviest = Gifts[0];
        for (int i = 0; i < Gifts.length; i++) {
            if(Gifts[i].weight > heaviest.weight) {
                heaviest = Gifts[i];
            }
        }
        return heaviest;
    }
    void addGift(Gift g){
        Gift[] tmp = new Gift[Gifts.length + 1];
        for (int i = 0; i < Gifts.length; i++) {
            tmp[i] = Gifts[i];
        }
        Gifts = tmp;
        Gifts[Gifts.length - 1] = g;
    }
    void addGift(){
        Gift[] tmp = new Gift[Gifts.length + 1];
        for (int i = 0; i < Gifts.length; i++) {
            tmp[i] = Gifts[i];
        }
        Gifts = tmp;
        Gifts[Gifts.length - 1] = new Gift("Uścisk dłoni prezesa",0);
    }
}
