public class Main {
    public static void main(String[] args) {
        System.out.println("PPJ 22");

        //Zadanie 01
        {
            System.out.println("Zadanie 01");
            Drzewo drzewo = new Drzewo(true, 30, "okrag");
            System.out.println(drzewo);
        }

        //Zadanie 02
        {
            System.out.println("Zadanie 02");
            DrzewoIglaste iglak = new DrzewoIglaste(true, 42, "trojkat", 3131323, 10.6);
            System.out.println(iglak);
            DrzewoLisciaste lisciate = new DrzewoLisciaste(false, 21, "okrag", 3);
            System.out.println(lisciate);
            DrzewoOwocowe owocowe = new DrzewoOwocowe(false, 50, "owal", 3, "grucha");
            System.out.println(owocowe);
        }

        //Zadanie 03, 04, 05
        {
            System.out.println("Zadanie 03, 04, 05");
            Telefon[] telefony = {
                    new Telefon("Telefon", "szary"),
                    new Komorka("Komorka", "bialy"),
                    new Smartfon("Smartfon", "czarny")
            };
        }
    }
}