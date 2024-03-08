import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("PPJ 14");
        Scanner sc = new Scanner(System.in);

        //Zadanie 01
        {
            System.out.println("Zadanie 01");
            int[][] tab = {
                    {1, 0, 0, 0, 0},
                    {0, 1, 0, 0},
                    {0, 0, 1}
            };
            System.out.print("tab = {\n");
            for (int i = 0; i < tab.length; i++) {
                System.out.print("\t{");
                for (int j = 0; j < tab[i].length; j++) {
                    System.out.print(j < tab[i].length - 1 ? tab[i][j] + ", " : tab[i][j] + "}\n");
                }
            }
            System.out.print("}\n");
            int[] tab1D = new int[tab[0].length + tab[1].length + tab[2].length];
            System.out.print("tab1D = {");
            for (int i = 0, k = 0; i < tab.length; i++) {
                for (int j = 0; j < tab[i].length; j++) {
                    tab1D[k++] = tab[i][j];
                    System.out.print(k < tab1D.length ? tab1D[k - 1] + ", " : tab1D[k - 1] + "}\n");
                }
            }
        }

        //Zadanie 02
        {
            System.out.println("\nZadanie 02");

            float[][] arrFloat = new float[8][8];
            System.out.print("arrFloat = {\n");
            for (int i = 0; i < arrFloat.length; i++) {
                System.out.print("\t{");
                for (int j = 0; j < arrFloat[i].length; j++) {
                    arrFloat[i][j] = (float) (Math.random()*10);
                    System.out.print(j < arrFloat[i].length - 1 ? arrFloat[i][j] + ",\t" : arrFloat[i][j] + "}\n");

                }
            }
            System.out.println("}");
            //lewa przekatna i == j
            float sumaL = 0;
            //prawa przekatna i == (arrFloat.length - 1) - j
            float sumaP = 0;
            for (int i = 0; i < arrFloat.length; i++) {
                for (int j = 0; j < arrFloat[i].length; j++) {
                    if (i == j) sumaL += arrFloat[i][j];
                    if (i == (arrFloat.length - 1) - j) sumaP += arrFloat[i][j];
                }
            }
            System.out.println("Suma lewej przekatnej: " + sumaL);
            System.out.println("Suma prawej przekatnej: " + sumaP);
            System.out.println("Suma obydwu przekatnych: " + (sumaL + sumaP));
        }

        //Zadanie 03
        {
            System.out.println("Zadanie 03");
            int[][] rzutKostkami = new int[1][2];
            int kostkaPierwsza = 0;
            int kostkaDruga = 0;
            boolean play = true;
            instrukcje();

            while (play) {

            }
        }
    }
    public static void roll (int a, int b) {
        a = (int)((Math.random()*(6 - 1 + 1)) + 1);
        b = (int)((Math.random()*(6 - 1 + 1)) + 1);
    }

    public static void show (int a, int b) {
        System.out.println("Liczba oczek na pierwszej kostce: " + a);
        System.out.print("Liczba oczek na drugiej kostce: " + b);
    }

    public static void instrukcje () {
        System.out.println("Instrukcja:");
        System.out.println("(s)how -wyświetli  wszystkie  wyniki  losowania");
        System.out.println(" (r)oll -wykona kolejny  rzut kośćmi,  wynik  którego zostanie  dopisany  do tablicyprzechowującej  tablice  z wynikami  dotychczasowych  losowań");
    }
}
