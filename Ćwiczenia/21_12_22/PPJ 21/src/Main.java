public class Main {
    public static void main(String[] args) {
        System.out.println("PPJ 21\n");

        //Zadanie 01
        {
            System.out.println("Zadanie 01");
            System.out.println("Rozwiazanie z wykorzystaniem tablicy:");
            MyStackTab tablica = new MyStackTab(4);
            tablica.pop();
            Student s1 = new Student(27932, "a");
            tablica.push(s1);
            Student s2 = new Student(21231, "b");
            tablica.push(s2);
            Student s3 = new Student(25232, "c");
            tablica.push(s3);
            Student s4 = new Student(27121, "d");
            tablica.push(s4);
            Student s5 = new Student(23873, "e");
            tablica.push(s5);
            tablica.pop();
            s1.show();
            s2.show();
            s3.show();
            s4.show();
            System.out.println("\nRozwiazanie z wykorzystaniem listy jednokierunkowej:");
            MyStackList list = new MyStackList(4);
            list.push(s1);
            list.push(s2);
            list.push(s3);
            list.push(s4);
            list.push(s5);
            System.out.println(list.pop());
            System.out.println(list.pop());
            System.out.println(list.pop());
            System.out.println(list.pop());
            System.out.println(list.pop()+"\n");
        }

        //Zadanie 02
        {
            System.out.println("Zadanie 02");
            Prostokat prostokat = new Prostokat(4.21,10.66);
            System.out.println(prostokat.toString());
            Prostopadloscian prostopadloscian = new Prostopadloscian(16.23, 3.61, 6.18);
            System.out.println(prostopadloscian.toString());
            Trojkat trojkat = new Trojkat(3.14, 7.2);
            System.out.println(trojkat.toString());
            Ostroslup ostroslup = new Ostroslup(3.13, 5.21, 8.54);
            System.out.println(ostroslup.toString());
            Graniastoslup graniastoslup = new Graniastoslup(4.19, 8.32, 9.45);
            System.out.println(graniastoslup.toString()+"\n");
        }

        //Zadanie 03
        {
            System.out.println("Zadanie 03");
            Osoba Grzegorz = new Osoba("Grzegorz");
            System.out.println(Grzegorz.wyswietl());
            Spawacz spawacz = new Spawacz(Grzegorz.getImie(), 6);
            System.out.println(spawacz.wyswietl()+"\n");
        }

        //Zadanie 04
        {
            System.out.println("Zadanie 04");
            Pojazd pojazd = new Pojazd("bialy");
            PojazdKolowy pojazdKolowy = new PojazdKolowy(pojazd.getColor(), 2);
            CiagnikSiodlowy ciagnikSiodlowy = new CiagnikSiodlowy(pojazdKolowy.getColor(), pojazdKolowy.getIloscOsi(), 24);
            ciagnikSiodlowy.rozpocznijJazde();
        }
    }
}