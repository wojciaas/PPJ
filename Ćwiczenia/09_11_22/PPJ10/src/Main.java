import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("PPJ 10\n");

        //Zadanie 01
        {
            System.out.println("\nZadanie 01");
            System.out.print("Wprowadz n aby policzyc rownania: ");
            int n = sc.nextInt();
            int sumLeft1 = 0;
            int sumRight1 = (n * (n + 1) * (n + 2))/3;
            int sumLeft2 = 0;
            int sumRight2 = (int) (Math.pow(-1, n-1) * n * (n + 1))/2;

            for (int i = 1; i <= n; i++) {
                sumLeft1 += i * (i + 1);
                sumLeft2 += Math.pow(-1, i-1) * Math.pow(i, 2);
            }

            System.out.println("SumLeft1 = " + sumLeft1 + "\tSumRight1 = " + sumRight1);
            System.out.println("SumLeft2 = " + sumLeft2 + "\tSumRight2 = " + sumRight2);
        }

        //Zadanie 02
        {
            System.out.println("\nZadanie 02");
            double[] tab = new double[10];

            System.out.println("Wszystkie wartosci tablicy:");
            for (int i = 0; i < tab.length; i++) {
                tab[i] = Math.random() * 101;
                System.out.println("Indeks tab[" + i + "]: " + tab[i]);
            }
            System.out.println("\nTylko parzyste indeksy: ");
            for (int i = 0; i < tab.length; i++) {
                if(i % 2 == 0){
                    System.out.println("Indeks tab[" + i + "]: " + tab[i]);
                }
            }
            System.out.println("\nTylko te elementy tablicy, których przekonwertowane na intwartości są nieparzyste:");
            for (double c : tab) {
                if((int)c % 2 != 0){
                    System.out.println(c);
                }
            }
        }

        //Zadanie 03
        {
            System.out.println("\nZadanie 03");
            char[] arr = new char[3];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = (char)(Math.random()*128);
            }
            char min = arr[0];
            int index = 0;

            for (int i = 0; i < arr.length; i++) {
                if(arr[i] < min) {
                    min = arr[i];
                    index = i;
                }
            }
            System.out.println("\n" + min + " ma najmniejsza wartosc i znajduje sie na indeksie arr[" + index + "]");
        }

        //Zadanie 04
        {
            System.out.println("\nZadanie 04");
            char[] arr;
            arr = new char[5];
            int iloscWystapien = 0;
            int zerosCounter = 0;
            for (int i = 0; i < arr.length; i++) {
                arr[i] = (char)((Math.random()*26)+65);
            }
            do {
                System.out.print("Wprowadz znak A-Z: ");
                char c = sc.next().charAt(0);
                for (int i = 0; i < arr.length; i++) {
                    if(arr[i] == c) {
                        arr[i] = '0';
                        iloscWystapien++;
                    }
                }
                System.out.println("Znak " + c + " wystapil " + iloscWystapien + " razy");
                zerosCounter += iloscWystapien;
                iloscWystapien = 0;
            } while(zerosCounter != arr.length);
        }

        //Zadanie 05
        {
            System.out.println("\nZadanie 05");

            //Kropka 1
            System.out.println("Kropka 1:");

            System.out.print("Wprowadz wielkosc 1 tablicy: ");
            int arr1Range = sc.nextInt();
            int[] arr1 = new int[arr1Range];

            System.out.print("Wprowadz wielkosc 2 tablicy: ");
            int arr2Range = sc.nextInt();
            int[] arr2 = new int[arr2Range];

            int smaller;
            int bigger;

            if (arr1.length < arr2.length) {
                smaller = arr1.length;
                bigger = arr2.length;
            } else {
                smaller = arr2.length;
                bigger = arr1.length;
            }

            System.out.print("Podaj cyfrę n do losowania z przedziału od 0 do n: ");
            int numRange = sc.nextInt() + 1;
            for (int i = 0; i < bigger; i++) {
                if(smaller == arr1.length && i < smaller) {
                    arr1[i] = (int)(Math.random()*numRange);
                } else if (smaller == arr2.length && i < smaller) {
                    arr2[i] = (int)(Math.random()*numRange);
                }

                if (bigger == arr1.length) {
                    arr1[i] = (int)(Math.random()*numRange);
                } else {
                    arr2[i] = (int)(Math.random()*numRange);
                }
            }

            System.out.print("arr 1 = { ");
            for (int c : arr1) {
                System.out.print(c + ", ");
            }
            System.out.print("}\narr2 = { ");
            for (int c : arr2) {
                System.out.print(c + ", ");
            }
            System.out.println("}\n");

            //Kropka 2

            System.out.println("Kropka 2: ");

            int[] arr3 = new int[bigger + smaller];
            for (int i = 0, j = 0; i < arr3.length; i++) {
                if(smaller == arr1.length && i < arr1.length) {
                    arr3[i] = arr1[i];
                } else if (smaller == arr2.length && i < arr2.length) {
                    arr3[i] = arr2[i];
                } else if (bigger == arr1.length) {
                    arr3[i] = arr1[j];
                    j++;
                } else {
                    arr3[i] = arr2[j];
                    j++;
                }
            }

            System.out.print("arr3 = { ");
            for (int c : arr3) {
                System.out.print(c + ", ");
            }
            System.out.println("}\n");

            //Kropka 3

            System.out.println("Kropka 3");
            int smallest = arr3[0];
            int biggest = arr3[0];
            for (int j : arr3) {
                if (j < smallest) {
                    smallest = j;
                } else if (j > biggest) {
                    biggest = j;
                }
            }

            int reapetedNumCounter = 0;

            for (int i = 0, k = 0; i < arr3.length; i++) {
                for (int j = i; j < arr3.length; j++) {
                    if (arr3[i] == arr3[j] && j != i) {
                        k++;
                    }
                }
            }

            //int[] arr4 = new int[biggest - smallest - 1 - repeatedCounter/2];

            System.out.println("Max: " + biggest + "\tMin: " + smallest);
            for(int c: arr3) {
                System.out.print(c + ", ");
            }
            System.out.println();
            System.out.println("Num of reapeted nums: " + reapetedNumCounter);
            //System.out.println(arr4.length);
        }

        //Zadanie 06
        {
            System.out.println("\nZadanie 06");
            int val = 0;
            char kierunek = '\u2191';
            char move;
            do {
                System.out.println("Znajdujesz sie teraz na " + kierunek);
                System.out.print("Wcsnij klawisz A lub D aby wybrac kierunek: ");
                move = sc.next().charAt(0);
                if ( move == 'D' || move == 'd') val++;
                if ( move == 'A' || move == 'a') val--;
                if ( val < 0 ) val += 4;
                if ( val > 3 ) val -= 4;

                kierunek = switch(val) {
                    case 0 -> '\u2191';
                    case 1 -> '\u2192';
                    case 2 -> '\u2193';
                    case 3 -> '\u2190';
                    default -> {
                        System.out.println("Wprowadzono nieprawidlowy znak. Nalezy A lub D aby wybrac kierunek.");
                        yield kierunek;
                    }
                };
            } while( move != 'Q');
        }
    }
}