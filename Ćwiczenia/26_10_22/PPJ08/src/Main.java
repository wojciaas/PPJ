public class Main {
    public static void main(String[] args) {
        System.out.println("PPJ08\n");

        //Zadanie 1
        System.out.println("Zadanie 1");
        for(int i = 1; i <= 10; i++){
            System.out.println(i);
        }
        System.out.println("\n");

        //Zadanie 2
        System.out.println("Zadanie 2");
        {
            int wrt = 2;
            for(int i = 1; i <= 10; i++){
                System.out.println(i * wrt);
            }
        }
        System.out.println("\n");

        //Zadanie 3
        System.out.println("Zadanie 3");
        {
            int counter = 5;
            while(counter < 0){
                System.out.println("Petla sie nie wykona");
            }

            do {
                System.out.println("Petla wykona sie przynajmniej raz");
            } while(counter < 0);
        }
        System.out.println("\n");

        //Zadanie 4
        System.out.println("Zadanie 4");
        {
            int przedzial1 = (int)(Math.random() * (10 - 0)) + 0;
            System.out.println(przedzial1);
            int przedzial2 = (int)(Math.random() * (15 - 2)) + 2;
            System.out.println(przedzial2);
            int przedzial3 = (int)(Math.random() * (31 - 5)) + 5;
            System.out.println(przedzial3);
            //[min, maks] (int) (Math.random() + r)
            //r = max - min + 1
            //(int)(Math.random() * (max - min + 1)) + min;
        }

        //Zadanie 5
        System.out.println("Zadanie 5");
        {
            java.util.Scanner scanner = new java.util.Scanner( System.in );
            int num1 = 0;
            int suma = 0;

            do {
                System.out.print("Wprowadz liczbe: ");
                num1 = scanner.nextInt( );
                suma += num1;
                System.out.println("Suma wprowadzonych liczb: " + suma);
            } while (num1 != 0);
            System.out.println("\n");
        }

        //Zadanie 6
        System.out.println("Zadanie 6");
        for (int i = 0; i < 10; i++) {
            System.out.println((i+1) + " element szeregu: " + (1/Math.pow(2,i)));
        }
        System.out.println("\n");

        //Zadanie 7
        System.out.println("Zadanie 7");
        {
            int dzien = 26;
            int miesiac = 10;
            int rok = 2020;
            int iloscDni = 0;
            for (int i = 1; i <= miesiac; i++) { // Pętla for inicjuje zmienną "i", która odpowiada za miesiące 1 - styczeń, 2 - luty itp. 
                if (i != miesiac) { //Następnie sprawdzany jest warunek, czy zmienna "i" odpowiedzialna za kolejne miesiące jest różna od wprowadzonego miesiąca:
                    switch (i) {
                        case 1, 3, 5, 7, 8, 10, 12:
                            iloscDni += 31;
                            break;
                        case 2:
                            if ((rok % 4 == 0) && ((rok % 100 != 0) || (rok % 400 == 0))) {
                                iloscDni += 29;
                            } else {
                                iloscDni += 28;
                            }
                            break;
                        default:
                            iloscDni += 30;
                            break;
                    }
                } else{
                    iloscDni += dzien;
                }
            }
            System.out.println("Ilosc dni ktore uplyneny od poczatku roku do " + dzien + "." + miesiac + "." + rok  + " to: " + iloscDni + "\n"); 
        }
        //Zadanie 8
        System.out.println("Zadanie 8");
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print((i+j) % 2 == 0? "*":" ");
            }
            System.out.println();
        }
    }
}