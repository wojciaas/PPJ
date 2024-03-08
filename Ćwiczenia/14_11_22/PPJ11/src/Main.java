import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println("PPJ 11");
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();

        //Zadanie 01
        {
            System.out.println("\nZadanie 01");
            int[] arr = new int[(int)(Math.random()*(15-10+1))+10];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = (int)(Math.random()*(arr.length));
                for (int j = 0; j < i; j++) {
                    while(arr[i] == arr[j]) {
                        arr[i] = (int)(Math.random()*(arr.length));
                        j = 0;
                    }
                }
            }
            System.out.println("Size: " + arr.length);
            for(int a : arr) {
                System.out.print(a + " ");
            }
            System.out.println("\n");
            for (int i = arr.length - 1; i >= 0; i--) {
                System.out.print(i + "\t");
            }
            System.out.println();
            for (int i = 0; i < arr.length; i++) {
                for (int j = arr.length - 1; j >= 0; j--) {
                    System.out.print((arr[i] == j? "*" : ".") + "\t");
                }
                System.out.println();
            }
        }

        //Zadanie 02
        {
            System.out.println("\nZadanie 02");
            int[] tab = {3,1,2,2,1,3};
            boolean palindrom = true;
            for (int i = 0; i < tab.length; i++) {
                if(tab[i] != tab[tab.length-1-i]){
                    palindrom = false;
                    break;
                }
            }
            System.out.println(palindrom);
        }

        //Zadanie 03
        {
            System.out.println("\nZadanie 03");
            System.out.print("Wprowadz wielkosc tablicy: ");
            int size = sc.nextInt();
            int falseCounter = 0;
            int trueCounter = 0;
            boolean[] arrBooleans = new boolean[size];

            for (int i = 0; i < arrBooleans.length; i++) {
                arrBooleans[i] = rd.nextBoolean();
                if(arrBooleans[i] == true){
                    trueCounter++;
                } else {
                    falseCounter++;
                }
            }
            System.out.println("False: " + falseCounter + "\tTrue: " + trueCounter);
            System.out.print("\narrBooleans = ");
            for(boolean a:arrBooleans){
                System.out.print(a + " ");
            }

            boolean[] arrFalse = new boolean[falseCounter];
            boolean[] arrTrue = new boolean[trueCounter];

            System.out.print("\n\narrFalse = ");
            for (int i = 0; i < arrFalse.length; i++) {
                arrFalse[i] = false;
                System.out.print(arrFalse[i] + " ");
            }
            System.out.print("\n\narrTrue = ");
            for (int i = 0; i < arrTrue.length; i++) {
                arrTrue[i] = true;
                System.out.print(arrTrue[i] + " ");
            }


        }

        //Zadanie 04
        {
            System.out.println("\nZadanie 04");
            System.out.print("Podaj rozmiar tablicy: ");
            int size = sc.nextInt();
            long[] arrLongs = new long[size];
            for (int i = 0; i < size; i++) {
                arrLongs[i] = i;
            }
            for (long a : arrLongs) {
                System.out.print(a + " ");
            }
            for (int i = 0; i < arrLongs.length - 1; i++) {
                int index1 = (int)(Math.random()*(size-1));
                int index2 = (int)(Math.random()*(size-1));
                long val1 = arrLongs[index1];
                long val2 = arrLongs[index2];
                arrLongs[index1] = val2;
                arrLongs[index2] = val1;
                if(arrLongs[i] == arrLongs[i+1] + 1){
                    i = 0;
                }
            }
            /*int i = 0;
            do {
                int index1 = (int)(Math.random()*(size-1));
                int index2 = (int)(Math.random()*(size-1));
                long val1 = arrLongs[index1];
                long val2 = arrLongs[index2];
                arrLongs[index1] = val2;
                arrLongs[index2] = val1;
                i++;
                if(arrLongs[i] == arrLongs[i+1] + 1){
                    i=0;
                }
            } while ((arrLongs[i] != arrLongs[i+1] + 1) && i < (size - 1));*/
            System.out.println();
            for (long a : arrLongs) {
                System.out.print(a + " ");
            }
        }

        //Zadanie 05
        {
            System.out.println("\nZadanie 05");
            System.out.print("Wybierz kamien, papier lub nozyce: ");
            String playerChoice = sc.next();
            String[] choices = {"kamien", "papier", "nozyce"};
            int randomIndex = rd.nextInt(choices.length);
            String computerChoice = choices[randomIndex];
            System.out.println("\nWybor gracza: " + playerChoice + "\tWybor komputera: " + computerChoice);

            if(playerChoice.equals(computerChoice)) {
                System.out.println("Draw!");
            } else if ((playerChoice.equals("kamien") && computerChoice.equals("nozyce")) || (playerChoice.equals("papier") && computerChoice.equals("nozyce")) || (playerChoice.equals("nozyce") && computerChoice.equals("papier"))) {
                System.out.println("You win!");
            } else {
                System.out.println("Computer wins!");
            }
        }
    }
}