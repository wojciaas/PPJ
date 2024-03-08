public class Main {
    public static void main(String[] args) {
        System.out.println("PPJ 23");

        //Zadanie 01
        {
            System.out.println("\nZadanie 01");
            Drzewo.Owoce();
        }

        //Zadanie 02
        {
            System.out.println("\nZadanie 02");
            System.out.print("Detektor dymu: ");
            try {
                DetektorDymu.sprawdz();
            } catch (Alarm alarm) {
                System.out.print(alarm.getMessage());
            }
            System.out.println();
        }

        //Zadanie 03
        {
            System.out.println("\nZadanie 03");
            DrzewoIglaste sosna = new DrzewoIglaste(true, 120, "trojkat", 69420, 12);
            DrzewoIglaste modrzew = new DrzewoIglaste(true, 92, "trojkat", 172345, 30);
            DrzewoLisciaste dab = new DrzewoLisciaste(false, 60, "okrag", 1);
            DrzewoLisciaste osik =  new DrzewoLisciaste(false, 45, "stozek", 1);
            DrzewoOwocowe morela = new DrzewoOwocowe(false, 30, "okrag", 1, "morela");
            DrzewoOwocowe sliwa =  new DrzewoOwocowe(false, 35, "okrag", 1, "sliwa");

            DrzewoPPJ22[] las = {sosna, modrzew, dab, osik, morela, sliwa};

            for(DrzewoPPJ22 drzewo : las){
                System.out.println(drzewo);

                try{
                    drzewo.zerwijOwoc();
                } catch (DrzewoBezOwocoweException ex) {
                    System.out.println(ex.getMessage());
                }
            }
        }

        //Zadanie 04
        {
            System.out.println("Zadanie 04");
            Rakieta rakieta = new Rakieta("Voyager 1");
            rakieta.zatankuj();
            try {
                rakieta.start();
            } catch(Exception ex){
                System.out.println(ex.getMessage());
            }
        }
    }
}