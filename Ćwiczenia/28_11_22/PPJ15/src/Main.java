import javax.sound.midi.Soundbank;
import java.util.Scanner;
public class Main {
    public static void show (int number){
        System.out.println(number);
    }
    public static void modifyValue (int val){
        System.out.println("Wartosc dostarczonej zmiennej w metodzie: " + val);
        val *= 5;
        System.out.println("Wartosc zmodyfikowanej zmiennej w metodzie: " + val);
    }
    public static int findMax (int a, int b, int c){
        if(a < b && a < c){
            return a;
        }
        if (b < c){
            return b;
        }
        return c;
    }
    public static void charCounter(char[] arr){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != 0){
                int counter = 1;
                for (int j = i + 1; j < arr.length; j++) {
                    if(arr[i] == arr[j]){
                        counter++;
                        arr[j] = 0;
                    }
                }
                System.out.println(arr[i] + " wystapilo " + counter + " razy");
            }
        }
    }
    public static void tabsReturn (int[] tab1, int[] tab2, int val){
        int shorter = 0, longer = 0;
        System.out.print("Tablica 1: {");
        for (int i = 0; i < tab1.length; i++) {
            System.out.print(i < tab1.length - 1 ? tab1[i] + ", " : tab1[i] + "}\n");
        }
        System.out.print("Tablica 2: {");
        for (int i = 0; i < tab2.length; i++) {
            System.out.print(i < tab2.length - 1 ? tab2[i] + ", " : tab2[i] + "}\n");
        }
        if(tab1.length < tab2.length) {
            longer = tab2.length;
            shorter = tab1.length;
        } else if (tab1.length > tab2.length){
            longer = tab1.length;
            shorter = tab2.length;
        }
        if(val < 0 && (tab1.length != 0 && tab2.length != 0)){
            int[] firstPoint = new int[shorter];
            System.out.print("Tablica 1: {");
            for (int i = 0; i < shorter; i++) {
                firstPoint[i] = tab1[i] + tab2[i];
                System.out.print(i < shorter - 1 ? firstPoint[i] + ", " : firstPoint[i] + "}\n");
            }
        } else if (val > 0 && (tab1.length != 0 && tab2.length != 0)) {
            int[] secondPoint = new int[longer - shorter];
            if(longer == tab1.length){
                System.out.print("Tablica 1: {");
            } else if(longer == tab2.length){
                System.out.print("Tablica 2: {");
            }
            for (int i = 0, j = shorter + i; i < secondPoint.length; i++, j++) {
                if(longer == tab1.length){
                    secondPoint[i] = tab1[j];
                } else {
                    secondPoint[i] = tab2[j];
                }
                System.out.print(i < secondPoint.length - 1 ? secondPoint[i] + ", " : secondPoint[i] + "}\n");
            }
        } else if (tab1.length == tab2.length) {
            int[] zero = new int[0];
            System.out.print("Tablica pusta: {");
            for (int a : zero) {
                System.out.print(a);
            }
            System.out.print("}\n");
        }
    }
    public static void jestRowna (int arr1[][], int arr2[][]){
        boolean equals = true;
        if(arr1.length == arr2.length){
            for (int i = 0; i < arr1.length && equals; i++) {
                equals = arr1[i].length == arr2[i].length;
            }
            if(equals){
                for (int i = 0; i < arr1.length && equals; i++) {
                    for (int j = 0; j < arr1[i].length && equals; j++) {
                        equals = arr1[i][j] == arr2[i][j];
                    }
                }
            }
            if(equals){
                System.out.println(equals);
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("PPJ 15\n");
        Scanner sc = new Scanner(System.in);

        //Zadanie 01
        {
            System.out.println("Zadanie 01");
            System.out.print("Podaj cyfre do wyswietlenia: ");
            int num = sc.nextInt();
            show(num);
        }

        //Zadanie 02
        {
            System.out.println("\nZadanie 02");
            int wrt = 5;
            System.out.println("Wartosc w zmiennej wrt przed wywolaniem metody \"modifyValue\": " + wrt);
            modifyValue(wrt);
            System.out.println("Wartosc w zmiennej wrt po wywolaniu metody \"modifyValue\": " + wrt);
            // Metoda nie zmienia wartosci zadeklarowanych zmiennych w programie,
            // zmienia jedynie jej "kopie" do niej dostarczona
        }

        //Zadanie 03
        {
            System.out.println("\nZadanie 03");
            int wrt1 = 5;
            int wrt2 = 10;
            int wrt3 = 15;
            System.out.println("Wartosc minimalna: " + findMax(wrt2, wrt3, wrt1));
        }

        //Zadanie 04
        {
            System.out.println("\nZadanie 04");
            char[] alaMaKota = {'A', 'l', 'a', ' ', 'm', 'a', ' ', 'k', 'o', 't', 'a'};
            charCounter(alaMaKota);
        }

        //Zadanie 05
        {
            System.out.println("\nZadanie 05");
            int[] arr1 = new int[10];
            int[] arr2 = new int[4];
            int wrt = 1;

            for (int i = 0; i < arr1.length; i++) {
                arr1[i] = (int)((Math.random()*(20 - 1 + 1)) + 1);
            }
            for (int i = 0; i < arr2.length; i++) {
                arr2[i] = (int)((Math.random()*(20 - 1 + 1)) + 1);
            }
            System.out.print("Dlugosc tablicy 1: " + arr1.length + "\t");
            System.out.print("Dlugosc tablicy 2: " + arr2.length + "\t");
            System.out.print("Wartosc argumentu typu int: " + wrt + "\n");
            tabsReturn(arr1, arr2, wrt);
        }

        //Zadanie 06
        {
            System.out.println("\nZadanie 06");
            int[][] tab1 = {
                    {0, 0, 0, 0},
                    {1, 0, 1}
            };
            int[][] tab2 = {
                    {0, 0, 0, 0},
                    {1, 0, 1}
            };
            jestRowna(tab1, tab2);
        }
    }
}