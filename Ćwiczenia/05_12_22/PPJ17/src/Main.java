public class Main {
    public static void main(String[] args) {
        System.out.println("PPJ 17");

        //Zadanie 01
        {
            System.out.println("\nZadanie 01");
            System.out.println("Fibonacci: " + fibR(45));
            System.out.println("Silnia: " + factR(12));
            System.out.println("NWD: " + gcdR(12125, 40643));
            int[] a = {3, 8, 2, 9, 7, 4};
            System.out.println("Max: " + maxElem(a, 0));
            System.out.println("Num even: " + numEven(a, 0));
        }

        //Zadanie 02
        {
            System.out.println("\nZadanie 02");
            int[] a = {3, 8, 2, 9, 7, 4};
            System.out.print("Tablica przed swapem: ");
            showArr1D(a);
            swap(a, 0, 4);
            System.out.print("Tablica po swapie: ");
            showArr1D(a);
        }

        //Zadanie 03
        {
            System.out.println("\nZadanie 03");
            int[] a = {3, 8, 2, 9, 7, 4};
            System.out.print("Tablica przed posortowaniem: ");
            showArr1D(a);
            bubleSortIt(a);
            System.out.print("Tablica po posortowaniu: ");
            showArr1D(a);
        }

        //Zadanie 04
        {
            System.out.println("\nZadanie 04");
            int[] a = {3, 8, 2, 9, 7, 4};
            System.out.print("Tablica przed posortowaniem: ");
            showArr1D(a);
            bubleSortRe(a);
            System.out.print("Tablica po posortowaniu: ");
            showArr1D(a);
        }

        //Zadanie 05
        {
            System.out.println("\nZadanie 05");
        }
    }
    public static int fibR(int n) {
        if(n >= 0 && n < 2){
            return n;
        } else {
            return fibR(n - 1) + fibR(n - 2);
        }
    }
    public static int factR(int n) {
        if(n > 1){
            return n * factR(n - 1);
        } else {
            return 1;
        }
    }
    public static int gcdR(int a, int b) {
        if(a == b) {
            return a;
        }
        if (a < b) {
            return gcdR(b - a, a);
        }
        return gcdR(a - b, b);
    }
    public static int maxElem(int[] arr, int from){
        if (from == arr.length - 1){
            return arr[arr.length - 1];
        } else {
            return Math.max(arr[from], maxElem(arr, from + 1));
        }
    }
    public static int numEven(int[] arr, int from) {
        if (from == arr.length) return 0;
        return (arr[from] % 2 == 0 ? 1 : 0) + numEven(arr, from + 1);
    }
    public static void swap(int[] tab, int source, int destination){
        int tmp = tab[destination];
        tab[destination] = tab[source];
        tab[source] = tmp;
    }
    public static void bubleSortIt(int[] tab){
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab.length - i - 1; j++) {
                if(tab[j] > tab[j + 1]){
                    swap(tab, j, j + 1);
                }
            }
        }
    }
    public static void bubleSortRe(int[] tab){
        bubleSortRe(tab, tab.length - 1);
    }
    public static void bubleSortRe(int[] tab, int len){
        for (int i = 0; i < len; i++) {
            if(tab[i] > tab[i + 1]) {
                swap(tab, i, i + 1);
            }
        }
        if(len > 0) {
            bubleSortRe(tab, len - 1);
        }
    }
    public static void printMonth(int m, int y){
        
    }
    public static void showArr1D(int[] tab) {
        System.out.print("{");
        for (int i = 0; i < tab.length; i++) {
            System.out.print(i < tab.length - 1 ? tab[i] + ", " : tab[i] + "}\n");
        }
    }
}