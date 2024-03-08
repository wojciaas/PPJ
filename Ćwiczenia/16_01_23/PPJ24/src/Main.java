import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class Main {
    public static void main(String[] args) {
        System.out.println("PPJ 24");

        //Zadanie 01
        {
            System.out.println("Zadanie 01");
            Car car = new Car();
            double rand = Math.random();
            while (rand < 0) {
                try {
                    car.drive100km();
                } catch (NotEnoughGas ex) {
                    System.err.println(ex.getMessage());
                    car.fill();
                }
            }
        }

        //Zadanie 02
        {
            System.out.println("\nZadanie 02");
            try {
                FileInputStream strumienWe = new FileInputStream("PPJ24/src/test.txt");
                System.out.println(strumienWe.read());
            } catch (Exception e) {
                System.err.println(e.getMessage());
            }
        }

        //Zadanie 03
        {
            System.out.println("\nZadanie 03");
            try{
                FileInputStream strumienWe = new FileInputStream("PPJ24/src/test.txt");
                int help;
                while ((help = strumienWe.read()) != -1){
                    System.out.print((char)help);
                }
                System.out.println();
            } catch(Exception ex){
                System.err.println(ex.getMessage());
            }
        }

        //Zadanie 04
        {
            System.out.println("\nZadanie 04");
            try{
                MojSkaner skaner = new MojSkaner(new FileInputStream("PPJ24/src/test.txt"));
                System.out.println(skaner.odczytajSlowo());
                System.out.println(skaner.odczytajLinie());
            }catch (Exception ex){
                ex.printStackTrace();
            }

            try {
                MojSkaner skaner = new MojSkaner(new FileInputStream("PPJ24/src/test.txt"));
                System.out.println(skaner.odczytajLiczbeCalkowita());
                System.out.println(skaner.odczytajDodatniaLiczbeCalkowita());
            } catch (Exception c) {
                c.printStackTrace();
            }
        }
    }
}