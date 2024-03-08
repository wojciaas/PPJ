public class Drzewo{
    private static Owoc zerwijOwoc(){
        double owoc = Math.random();
        if (owoc < 0.33) return new Jablko();
        if (owoc < 0.66) return new Pomarancza();
        return new Gruszka();
    }
    static void Owoce(){
        Owoc[] owoce = new Owoc[100];
        double masa = 0;
        int index = 0;
        int jablka = 0;
        int pomarancze = 0;
        int gruszki = 0;

        while (masa < 5000){
            Owoc owoc = zerwijOwoc();
            masa += owoc.getMasa();
            owoce[index++] = owoc;
            switch (owoc.getNazwa()) {
                case "Jablko" -> jablka++;
                case "Pomarancza" -> pomarancze++;
                case "Gruszka" -> gruszki++;
            }
        }

        System.out.println("Jablka: " + jablka);
        System.out.println("Pomarancze: " + pomarancze);
        System.out.println("Gruszki: " + gruszki);
        System.out.println("Masa: " + masa);
    }
}
