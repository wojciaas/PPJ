public class Main {
    public static void main(String[] args) {
        System.out.println("PPJ 19");
        System.out.println();

        //Zadanie 01
        {
            System.out.println("Zadanie 01");
            Kwadrat k1 = new Kwadrat(5);
            k1.show();
        }

        //Zadanie 02
        {
            System.out.println("Zadanie 02");
            Walec w1 = new Walec(3,7);
            w1.show();
        }

        //Zadanie 03
        {
            System.out.println("Zadanie 03");
            Kwadrat kwadrat = new Kwadrat(6);
            KulaW kulaW = new KulaW(kwadrat);
            System.out.println("Promien kuli w szescianie o boku " + kwadrat.getBok() + " jest rowny " + kulaW.getR());
            Walec walec = new Walec(4, 9);
            KulaW kulaW1 = new KulaW(walec);
            System.out.println("Promien kuli w walcu o promieniu podstawy " + walec.getPromien() + " oraz wysokosci " + walec.getWysokosc() + " jest rowny " + kulaW.getR());
            System.out.println();
        }

        //Zadanie 04
        {
            System.out.println("Zadanie 04");
            Kwadrat kwadrat = new Kwadrat(6);
            KulaNa kulaNa = new KulaNa(kwadrat);
            System.out.println("Promien kuli opisanej na postawie szescianu o boku " + kwadrat.getBok() + " jest rowny " + kulaNa.getPromien());
            Walec walec = new Walec(4, 9);
            KulaW kulaW1 = new KulaW(walec);
            System.out.println("Promien kuli opisanej na podstawie w walca o promieniu podstawy " + walec.getPromien() + " jest rowny " + kulaNa.getPromien());
            System.out.println();
        }

        //Zadanie 05
        {
            System.out.println("Zadanie 05");
            Dzem konstruktor1 = new Dzem("Truskawka",  50);
            System.out.println("Konstruktor 1");
            System.out.println("Smak: " + konstruktor1.getSmak() + "\twaga: " + konstruktor1.getWaga());
            System.out.println();
            Dzem konstruktor2 = new Dzem(40.0);
            System.out.println("Konstruktor 2");
            System.out.println("Smak: " + konstruktor2.getSmak() + "\twaga: " + konstruktor2.getWaga());
            System.out.println();
            Dzem konstruktor3 = new Dzem("Wisnia");
            System.out.println("Konstruktor 3");
            System.out.println("Smak: " + konstruktor3.getSmak() + "\twaga: " + konstruktor3.getWaga());
            System.out.println();
        }

        //Zadanie 06
        {
            System.out.println("Zadanie 06");
            Dzem dzem = new Dzem("truskawkowy", 50.0);
            Sloik sloik = new Sloik(dzem);
            System.out.println("Sloik jest teraz " + (sloik.czyOtwarty() ? "otwarty." : "zamkniety."));
            sloik.otworz();
            System.out.println("Sloik jest teraz " + (sloik.czyOtwarty() ? "otwarty." : "zamkniety."));
            sloik.zamknij();
            System.out.println("Sloik jest teraz " + (sloik.czyOtwarty() ? "otwarty." : "zamkniety."));
        }
    }
}