public
    class PPJ06 {
        public static void main(String[] args){
            System.out.println("PPJ06" + "\n");

            // Zadanie 1
            {
                System.out.println("Zadanie 1");
                boolean czyPada = false;
                int wartosc = czyPada ? 5 : 8;
                System.out.println(wartosc + "\n");
            }

            // Zadanie 2
            {
                System.out.println("Zadanie 2");
                boolean czyPada = true;
                boolean czySwieciSlonce = false;

                if(czyPada == true && czySwieciSlonce == false) {
                    System.out.println("Plucha" + "\n");
                } else if(czyPada == true && czySwieciSlonce == true) {
                    System.out.println("Tecza" + "\n");
                } else if(czyPada == false && czySwieciSlonce == true) {
                    System.out.println("Slonecznie" + "\n");
                } else {
                    System.out.println("Pochmurno" + "\n");
                }
            }

            // Zadanie 3
            {
                System.out.println("Zadanie 3");
                System.out.println("Przypuszczenia: \"Hello PPJ\"");
                if(3 < 5 * 2.0)
                System.out.print("Hello");
                System.out.println(" PPJ" + "\n");
            }

            //Zadanie 4
            {
                int p2137 = 0;
                //int 2137p = 0;
                int $ap = 0;
                //int public = 0;
                //int null = 0;
            }

             // Zadanie 5
            {
                System.out.println("Zadanie 5");
                java.util.Scanner scanner = new java.util.Scanner( System.in );
                System.out.print("Wprowadz pierwsza liczbe: ");
                int num1 = scanner.nextInt( );
                System.out.print("Wprowadz pierwsza liczbe: ");
                int num2 = scanner.nextInt( );
                if(num1 > 0 && num2 > 0){
                    System.out.println("Wynik: " + (num1 - num2) + "\n");
                } else {
                    System.out.println("Wynik: " + (num1 + num2) + "\n");
                }
            }

            // Zadanie 6
            {
                System.out.println("Zadanie 6");
                double val = 0;
                System.out.print(val >= 0 ? "A " : "");
                System.out.print(val <= 1 ? "B " : "");
                System.out.println((val >= 0 && val <= 1) ? "C\n" : "\n");
            }

            // Zadanie 7
            {
                System.out.println("Zadanie 7");
                // 1234.567L Błąd kompilacji (Sufix na końcu liczby odpowiada liczbom całkowitym)
                // 12.34567E2 Taka sama jak podany literał ponieważ przecinek zostanie przesunięty w prawo o 2 miejsca
                // 1.234567E06 Nie jest taka sama jak literał, ponieważ przecinek zostanie przesunięty o 6 miejsc w prawo
                // 1234567E-3 Jest taka sama jak literał ponieważ przecinek zostanie przesunięty o 3 miejsca od lewej
            }
        }
    }