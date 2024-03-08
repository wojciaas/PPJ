import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        System.out.println("PPJ 12");
        Scanner sc = new Scanner(System.in);

/*        //Zadanie 01
        {
            System.out.println("\nZadanie 01");
            int[] arr = {153, 333, 370, 515, 407, 80};

            for (int i = 0; i < arr.length; i++) {
                int tmp = arr[i];
                int suma = 0;
                int numsCounter = 0;

                while(tmp != 0){
                    numsCounter++;
                    tmp /= 10;
                }
                tmp = arr[i];
                while(tmp != 0) {
                    suma += Math.pow(tmp % 10, numsCounter);
                    tmp /= 10;
                }

                if(suma == arr[i]){
                    System.out.println("Liczba " + arr[i] + " jest liczba narcystyczna");
                }
            }
        }

        //Zadanie 02
        {
            System.out.println("\nZadanie 02");
            int[] arr = {1, 5, 8, 2, 6};
            int max = arr[0];

            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i + 1] > max) {
                    max = arr[i + 1];
                }
            }
            for(int val : arr) {
                System.out.print(val + "\t");
            }
            System.out.println();
            for (int i = max; i != 0; i--) {
                for (int j = 0; j < arr.length; j++) {
                    System.out.print(arr[j] < i ? " \t" : "*\t");
                }
                System.out.println();
            }
        }
        
        //Zadanie 03
        {
            System.out.println("\nZadanie 03");
            byte[] arr = new byte[9];
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] == 0 ? i + 1 : arr[i] == 1 ? "O" : "X");
                System.out.print((i % 3 == 2) ? "\n" : " ");
            }
        }

        //Zadanie 04
        {
            System.out.println("\nZadanie 04");
            System.out.print("Podaj wielkosc tablicy: ");
            int size = sc.nextInt();
            System.out.print("Podaj pierwszy element tablicy liczb calkowitych: ");
            int firstElement = sc.nextInt();
            int[] arr = new int[size];
            for (int i = 0, k = firstElement; i < arr.length; i++, k++) {
                arr[i] = k;
            }
            for(int a : arr){
                System.out.print(a + " ");
            }
            for (int i = 1; i < arr.length; i++) {
                int tmp = arr[i];
                arr[i] = arr[i - 1];
                arr[i - 1] = tmp;
            }
            System.out.println();
            for(int a : arr){
                System.out.print(a + " ");
            }
        }*/

        //Zadanie 05
        {
            System.out.println("\nZadanie 05");
            System.out.print("Podaj rozmiar tablicy: ");
            int size = sc.nextInt();
            int[] A, B, C;
            A = new int[size];
            B = new int[size];
            for (int i = 0; i < A.length; i++) {
                A[i] = (int)(Math.random()*11);
                if()
            }
            for (int i = 0; i < A.length; i++) {
                A[i] = (int)(Math.random()*11);
            }

            System.out.print("A = ");
            for(int a : A) {
                System.out.print(a + " ");
            }
            System.out.print("\nB = ");
            for(int a : B) {
                System.out.print(a + " ");
            }
        }
    }
}