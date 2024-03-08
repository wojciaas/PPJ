import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Main {
    public static void main(String[] args) {
        System.out.println("PPJ 16");

        //Zadanie 01
        {
            System.out.println("\nZadanie 01");
            int[][] arr= calculateSquares(120, 120, 12);
            show2D(arr);
        }

        //Zadanie 02
        {
            System.out.println("\nZadanie 02");
            show1D(splitToDigits(1192232));
        }

        //Zadanie 03
        {
            System.out.println("\nZadanie 03");
            System.out.println(isArmstrongNumber(2137));
        }

        //Zadanie 04
        {
            System.out.println("\nZadanie 04");
            char[] arr = {'A', 'n', 'n', 'n'};
            System.out.println(isPalindrom(arr));
        }

        //Zadanie 05
        {
            System.out.println("\nZadanie 05");
            String slowo = "kajak";
            char[] arr = slowo.toCharArray();
            showPal(arr, 0, isPalindrom(arr, 0));
            System.out.println("\n");
        }

        //Zadanie 06
        {
            System.out.println("Zadanie 06");
            int size = 3;
            size *= 2;
        }
    }

    //Metody
    public static int[][] calculateSquares(int screenWidth, int screenHeight, int side){
        int width = screenWidth/side,
            height = screenHeight/side,
            index = 0;
        int[][] arr = new int[width * height][2];

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                arr[index][0] = i * side;
                arr[index][1] = j * side;
                index++;
            }
        }
        return arr;
    }
    public static int[] splitToDigits(int val){
        int size = 0,
            wrt = val,
            index;
        while(wrt > 0) {
            wrt /= 10;
            size++;
        }
        int[] res = new int[size];
        for (int i = size - 1; i >= 0; i--) {
            res[i] = val % 10;
            val /= 10;
        }
        return res;
    }
    public static boolean isArmstrongNumber(int num){
        int[] cyfry = splitToDigits(num);
        int sum = countPowerOfDig(cyfry);
        return sum == num;
    }
    public static int countPowerOfDig(int[] cyfry){
        int sum = 0;
        for (int i = 0; i < cyfry.length; i++) {
            sum += Math.pow(cyfry[i], cyfry.length);
        }
        return sum;
    }
    public static boolean isPalindrom(char[] tab){
        return isPalindrom(tab, 0);
    }
    public static boolean isPalindrom(char[] tab, int index){
        if(Character.toLowerCase(tab[index]) == Character.toLowerCase(tab[tab.length - 1 - index])){
            if (index < tab.length / 2){
                return isPalindrom(tab, ++index);
            } else {
                return true;
            }
        }
        return false;
    }
    public static void showPal(char[] tab, int index, boolean isPal){
        if(isPal){
            System.out.print(tab[tab.length / 2 - index - 1]);
            if (index + 1 < tab.length / 2){
                showPal(tab, index + 1, isPal);
            }
            System.out.print(tab[tab.length / 2 + index + (tab.length % 2 != 0 ? 1 : 0)]);
        } else {
            System.out.print("Slowo nie jest palindromem.");
        }
    }
    public static void show2D (int[][] tab){
        System.out.println("Tablica: {");
        for (int i = 0; i < tab.length; i++) {
            System.out.print("\t{");
            for (int j = 0; j < tab[i].length; j++) {
                System.out.print(j < tab[i].length - 1 ? tab[i][j] + ", " : tab[i][j] + "}\n");
            }
        }
        System.out.println("}");
    }
    public static void show1D (int[] tab){
        System.out.print("Tablica: {");
        for (int i = 0; i < tab.length; i++) {
            System.out.print(i < tab.length - 1 ? tab[i] + ", " : tab[i] + "}\n");
        }
    }
}