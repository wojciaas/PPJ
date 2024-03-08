public class Main {
    public static void main(String[] args) {
        //PPJ07
        System.out.println("PPJ07");

        //Zadanie 1
        /*System.out.println("Zadanie 1");
        System.out.println("Przypuszczenia kod 1 dla a = -3: Negative\nAbsolute value is: 3");
        System.out.println("Przypuszczenia kod 1 dla a = 0: Positive\nAbsolute value is: 0");
        System.out.println("Przypuszczenia kod 1 dla a = 5: Positive\nAbsolute value is: 5");

        System.out.println("Przypuszczenia kod 2 dla a = -3: Negative\nAbsolute value is: 3\nPositive\nAbsolute value is: 3");
        System.out.println("Przypuszczenia kod 2 dla a = 0: Positive\nAbsolute value is: 0");
        System.out.println("Przypuszczenia kod 2 dla a = 5: Positive\nAbsolute value is: 5");*/

        {
            int a = -3;
            //kod 1
            /*if(a < 0){
                System.out.println("Negative");
                a *= -1;
                System.out.println("Absolute value is: " + a + "\n");
            } else {
                System.out.println("Positive");
                System.out.println("Absolute value is: " + a + "\n");
            }*/
            //kod 2
            if(a < 0){
                System.out.println("Negative");
                a *= -1;
                System.out.println("Absolute value is: " + a + "\n");
            } if(a >= 0) {
                System.out.println("Positive");
                System.out.println("Absolute value is: " + a + "\n");
            }
        }
        //Zadanie 2
        System.out.println("Zadanie 2");
        {
            double a = Math.random();
            double b = Math.random();
            double c = Math.random();
            if(a>0.2&&b>0.2&&c>0.2) {
                System.out.println("Trzy ostatnie wyniki losowan sa wieksze od 0.2" + "\n");
            }
            a = Math.random();
            if(a>0.2&&b>0.2&&c>0.2) {
                System.out.println("Trzy ostatnie wyniki losowan sa wieksze od 0.2" + "\n");
            }
            b = Math.random();
            if(a>0.2&&b>0.2&&c>0.2) {
                System.out.println("Trzy ostatnie wyniki losowan sa wieksze od 0.2" + "\n");
            }
        }

        //Zadanie 3
        System.out.println("Zadanie 3");
        {
            int wrt = -14;
            if(wrt >= -4 && wrt <= 3){
                System.out.println("Podana wartosc jest czescia wspolna zbiorow A B oraz C" + "\n");
            } else {
                System.out.println("Podana wartosc nie nalezy do czesci wspolnej zbiorow A B oraz C" + "\n");
            }
        }

        //Zadanie 4
        System.out.println("Zadanie 4");
        System.out.println("a == b" + "\n");

        //Zadanie 5
        System.out.println("Zadanie 5");
        {
                java.util.Scanner scanner  = new  java.util.Scanner(  System.in  ) ;
                System.out.print("Wprowadz litere z klawiatury: ");
                char ch = scanner.next(  ).charAt  (0);
                if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'u' || ch == 'o' || ch == 'y') {
                    System.out.println(ch + " jest samogloska" + "\n");
                } else {
                    System.out.println(ch + " jest spolgloska" + "\n");
                }
        }

        //Zadanie 6
        System.out.println("Zadanie 6");
        {
            java  .util.Scanner  scanner  = new  java.util.Scanner  ( System.in ) ;
            System.out.print("Wprowadz cyfre odpowiadajaca miesiacowi ktory chcesz wprowadzic: ");
            int miesiac = scanner.nextInt(  );
            System.out.print("Wprowadz rok: ");
            scanner  = new  java.util.Scanner  ( System.in ) ;
            int rok = scanner.nextInt(  );

            if(miesiac == 2){
                if((rok % 4 == 0) && (rok % 100 != 0) || rok % 400 == 0) {
                    System.out.println("Ten miesiac w roku " + rok + " ma 29 dni");
                } else {
                    System.out.println("Ten miesiac w roku " + rok + " ma 28 dni");
                }
            } else if (miesiac == 4 || miesiac == 6 || miesiac == 9 || miesiac == 11) {
                System.out.println("Ten miesiac ma 30 dni");
            } else {
                System.out.println("Ten miesiac ma 31 dni");
            }
        }
    }
}