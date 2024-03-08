import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("PPJ 18\n");
        Scanner sc = new Scanner(System.in);

        //Zadanie 01
        {
            System.out.println("Zadanie 01");
            Person person = new Person();
            person.setName("Robert");
            person.setSurname("Kubica");
            person.setBirthyear(1984);
            System.out.println(person.getName());
            System.out.println(person.getSurname());
            System.out.println(person.getBirthyear());
            System.out.println();
        }

        //Zadanie 02
        {
            System.out.println("Zadanie 02");
            Fruit jablko = new Fruit("jablko");
            jablko.show();
        }

        //Zadanie 03
        {
            System.out.println("Zadanie 03");
            Donkey donkey = new Donkey(20);
            int counter = 0;
            while (!donkey.isFlying()) {
                donkey.addBaloon(new Balloon());
                counter++;
            }
            System.out.println("Ja latam!!!");
            System.out.println(counter + "\n");
        }

        //Zadanie 04
        {
            System.out.println("Zadanie 04");
            Donkey_Zadanie04 donkey = new Donkey_Zadanie04(20);
            while (!donkey.isFlying()) {
                donkey.addBaloon(new Balloon());
            }
            System.out.println("Ja latam!!!");
            System.out.println(donkey.getBalloonsLen() + "\n");
        }

        //Zadanie 05
        {
            System.out.println("Zadanie 05");
            Word slowo = new Word();
            do {
                System.out.print("Wprowadz znak aby dodac go do ciagu znakow: ");
                slowo.addChar(sc.next().charAt(0));
                System.out.print("Ciag znakow: ");
                slowo.show();
                System.out.println("Ilosc znakow w ciagu: " + slowo.length());
            } while (slowo.length() < 100);
            System.out.println("Brak miejsca w tablicy");
        }
    }
}