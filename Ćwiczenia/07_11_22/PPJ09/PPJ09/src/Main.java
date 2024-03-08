import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("PPJ09\n");

        //Zadanie 01
        {
            System.out.println("Zadanie 01");
            System.out.print("Podaj kwote do wydania: ");
            double kwota = sc.nextDouble();
            kwota *= 100;
            int piecsetZl = 0;
            int dwustuZl = 0;
            int stuZl = 0;
            int piecdziesiecioZl = 0;
            int dwudziestoZl = 0;
            int dziesiecioZl = 0;
            int piecioZl = 0;
            int dwuZl = 0;
            int jednoZl = 0;
            int piecdziesiecioGr = 0;
            int dwudziestoGr = 0;
            int dziesiecioGr = 0;
            int piecioGr = 0;
            int dwuGr = 0;
            int jednoGr = 0;

            while (kwota >= 50000) {
                kwota -= 50000;
                piecsetZl++;
            }
            System.out.println(piecsetZl + " * 500 zl");

            while (kwota >= 20000) {
                kwota -= 20000;
                dwustuZl++;
            }
            System.out.println(dwustuZl + " * 200 zl");

            while (kwota >= 10000) {
                kwota -= 10000;
                stuZl++;
            }
            System.out.println(stuZl + " * 100 zl");

            while (kwota >= 5000) {
                kwota -= 5000;
                piecdziesiecioZl++;
            }
            System.out.println(piecdziesiecioZl + " * 50 zl");

            while (kwota >= 2000) {
                kwota -= 2000;
                dwudziestoZl++;
            }
            System.out.println(dwudziestoZl + " * 20 zl");

            while (kwota >= 1000) {
                kwota -= 1000;
                dziesiecioZl++;
            }
            System.out.println(dziesiecioZl + " * 10 zl");

            while (kwota >= 500) {
                kwota -= 500;
                piecioZl++;
            }
            System.out.println(piecioZl + " * 5 zl");

            while (kwota >= 200) {
                kwota -= 200;
                dwuZl++;
            }
            System.out.println(dwuZl + " * 2 zl");

            while (kwota >= 100) {
                kwota -= 100;
                jednoZl++;
            }
            System.out.println(jednoZl + " * 1 zl");

            while (kwota >= 50) {
                kwota -= 50;
                piecdziesiecioGr++;
            }
            System.out.println(piecdziesiecioGr + " * 50 gr");

            while (kwota >= 20) {
                kwota -= 20;
                dwudziestoGr++;
            }
            System.out.println(dwudziestoGr + " * 20 gr");

            while (kwota >= 10) {
                kwota -= 10;
                dziesiecioGr++;
            }
            System.out.println(dziesiecioGr + " * 10 gr");

            while (kwota >= 5) {
                kwota -= 5;
                piecioGr++;
            }
            System.out.println(piecioGr + " * 5 gr");

            while (kwota >= 2) {
                kwota -= 2;
                dwuGr++;
            }
            System.out.println(dwuGr + " * 2 gr");

            while (kwota >= 1) {
                kwota -= 1;
                jednoGr++;
            }
            System.out.println(jednoGr + " * 1 gr");
        }

        //Zadanie 02
        {
            System.out.println("\nZadanie 02");
            System.out.println("Zadanie wykonywanie w kodzie zrodlowym");
            byte x = (byte) (Math.random() * 16);
            char znak = switch (x) {
                case 0 -> 0x00;
                case 1 -> 0x01;
                case 2 -> 0x02;
                case 3 -> 0x03;
                case 4 -> 0x04;
                case 5 -> 0x05;
                case 6 -> 0x06;
                case 7 -> 0x07;
                case 8 -> 0x08;
                case 9 -> 0x09;
                case 10 -> 0xA;
                case 11 -> 0xB;
                case 12 -> 0xC;
                case 13 -> 0xD;
                case 14 -> 0xE;
                case 15 -> 0xF;
                default -> 0;
            };
        }

        //Zadanie 03
        {
            System.out.println("\nZadanie 03");
            System.out.print("Podaj liczbe aby podniesc ja do potegi: ");
            int n = sc.nextInt();
            System.out.println(Math.pow(n, 2) + "\t" + Math.pow(n, 3) + "\t" + Math.pow(n, 4));
        }

        //Zadanie 04
        {   
            System.out.println("\nZadanie 04");
            System.out.print("Podaj rozmiar: ");
            int rozmiar = sc.nextInt();
            int size = (2 * rozmiar) + 1;
            System.out.println("Rozmiar = 2 * " + rozmiar + " + 1 = " + size);
            int puste = size - 1;

            for (int i = 0; i <= (size / 2) + 1; i++) {
                for (int j = 0; j < puste; j++) {
                    System.out.print(" ");
                }

                puste = puste - 1;

                for (int j = 0; j < 2 * i - 1; j++) {
                    System.out.print("*");
                }
                System.out.println("");
            }

            for (int i = size / 2; i > 0; i--) {
                for (int j = i; j < (size / 2) + rozmiar; j++) {
                    System.out.print(" ");
                }

                for (int j = 0; j < 2 * i - 1; j++) {
                    System.out.print("*");
                }
                System.out.println("");
            }
            
            // for(int j=0, k = 0; j<(2*size)+1; j++, k += j <= size ? 1 : -1) { 
            //     for (int i = 0; i < size - k; i++)
            //         System.out.print(" ");

            //     for(int i=0; i<1+(2*k); i++)
            //         System.out.print("*");

            //     System.out.println();
            // }
        }

        //Zadanie 05
        {
            System.out.println("\nZadanie 05");
            System.out.println("Podaj dwie liczby a i b ktore beda krancami przedzialu liczbowego takiego, ze a < b oraz a,b < 100");
            System.out.print("Podaj a: ");
            int a = sc.nextInt();
            System.out.print("Podaj b: ");
            int b = sc.nextInt();
            int los = (int)(Math.random()*100);
            int counterFails = 0;

            if(a < b && (a < 100 && b < 100)){
                while(los < a || los > b) {
                    System.out.println("Wylosowana liczba to: " + los + " i znajduje sie poza przedzialem [" + a + ", " + b + "]");
                    los = (int)(Math.random()*100);
                    counterFails++;
                }
                System.out.println("Wylosowana liczba to: " + los + " i znajduje sie w przedziale [" + a + ", " + b + "]\nLiczba nieudanych losowan: " + counterFails);
            } else {
                System.out.println("Warunek dla przedzialow nie zostal spelniony.");
            }
        }
    }
}