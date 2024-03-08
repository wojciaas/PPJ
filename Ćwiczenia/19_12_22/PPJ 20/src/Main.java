public class Main {
    public static void main(String[] args) {
        System.out.println("PPJ 20\n");

        //Zadanie 01
        {
            System.out.println("Zadanie 01");
            Ball.makeBall();
            Ball.makeBall();
            Ball.makeBall();
            Ball.makeBall();
            System.out.println("Ilosc pilek: " + Ball.showCounter() + "\n");
        }

        //Zadanie 02
        {
            System.out.println("Zadanie 02");
            Person JK = new Person("Jan Kowalski", 1977);
            System.out.println("Imie i nazwisko: " + JK.getName() + ", wiek: " + JK.getAge());
            Person AN = new Person("Adam Nowak");
            System.out.println("Imie i nazwisko: " + AN.getName() + ", wiek: " + AN.getAge());
            Person PZ = new Person("Piotr Zyla", 1986);
            System.out.println("Imie i nazwisko: " + PZ.getName() + ", wiek: " + PZ.getAge());
            Person BT = new Person("Barbara Tracz", 1975);
            System.out.println("Imie i nazwisko: " + BT.getName() + ", wiek: " + BT.getAge() + "\n");

            System.out.println("Osoba starsza: " + Person.getOlder(JK, PZ).getName());
            Person[] people = {JK, AN, PZ, BT};
            System.out.println("Najstarsza osoba: " + Person.getOldest(people).getName() + "\n");

            Person.peopleSort(people);
            System.out.println("Posortowana tablica:");
            for(Person p : people) {
                System.out.println("Imie i nazwisko: " + p.getName() + ", wiek: " + p.getAge());
            }
            System.out.println();
        }

        //Zadanie 03
        {
            System.out.println("Zadanie 03");
        }
    }
}