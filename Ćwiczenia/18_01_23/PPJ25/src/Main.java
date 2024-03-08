import java.io.FileNotFoundException;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) {
        System.out.println("PPJ24");

        //Zadanie 01
        {
            System.out.println("Zadanie 01");

            try {
                PNWReader pnwReader = new PNWReader(new FileReader("PPJ25/src/zadanie1.txt"), 1);
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            }
        }
    }
}