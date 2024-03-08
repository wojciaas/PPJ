import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("PPJ13");
        Scanner sc = new Scanner(System.in);

        //Zadanie 01
        {
            System.out.println("Zadanie 01");
            System.out.print("Podaj rozmiar tablicy wiekszy lub rowny 2: ");
            int size = sc.nextInt();
            while (size < 2) {
                System.out.print("Rozmiar nieprawidlowy. Wprowadz rozmiar ponownie: ");
                size = sc.nextInt();
            }
            int[] arr = new int[size];
            System.out.print("Podaj najmiejsza liczbe do wylosowania: ");
            int minLos = sc.nextInt();
            System.out.print("Podaj najwieksza liczbe do wylosowania: ");
            int maxLos = sc.nextInt();

            while (maxLos < minLos) {
                System.out.println("Blad. Wybrana liczba jest mniejsza od wartosci minimalnej. Wprowadz liczbe jeszcze raz: ");
                maxLos = sc.nextInt();
            }

            for (int i = 0; i < arr.length; i++) {
                int los = (int)((Math.random()*(maxLos - minLos + 1))+minLos);
                arr[i] = los;
                for (int j = 0; j < i; j++) {
                    if(arr[i] < arr[j]){
                        int tmp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = tmp;
                    }
                }
            }
            System.out.print("W tablicy arr = {");
            for (int i = 0; i < arr.length; i++) {
                System.out.print(i < arr.length - 1 ? arr[i] + ", " : arr[i] + "}");
            }
            int counter = 0;
            System.out.print(" wystepuja pojedyncze warosci {");
            for (int i = 0; i < arr.length - 1; i++) {
                int tmp = arr[i];
                if (tmp != arr[i + 1]){
                    System.out.print(arr[i] + ", ");
                    counter++;
                }
                if (i == arr.length - 2) {
                    System.out.print(arr[arr.length - 1] + "}");
                    counter++;
                }
            }
            System.out.println(" i jest ich " + counter);
        }

        //Zadanie 02
        {
            System.out.print("Podaj rozmiar tablicy wiekszy lub rowny 2: ");
            int size = sc.nextInt();
            while(size < 2){
                System.out.print("Rozmiar nieprawidlowy. Wprowadz rozmiar ponownie: ");
                size = sc.nextInt();
            }

            int[] arr = new int[size];
            System.out.print("Podaj najmiejsza liczbe do wylosowania: ");
            int minLos = sc.nextInt();
            System.out.print("Podaj najwieksza liczbe do wylosowania: ");
            int maxLos = sc.nextInt();

            while (maxLos < minLos) {
                System.out.println("Blad. Wybrana liczba jest mniejsza od wartosci minimalnej. Wprowadz liczbe jeszcze raz: ");
                maxLos = sc.nextInt();
            }

            for (int i = 0; i < arr.length; i++) {
                int los = (int)((Math.random()*(maxLos - minLos + 1))+minLos);
                arr[i] = los;
                for (int j = 0; j < i; j++) {
                    if(arr[i] < arr[j]){
                        int tmp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = tmp;
                    }
                }
            }
            int counter = 0;
            for (int i = 0; i < arr.length; i++) {
                int tmp = arr[i];
                for (int j = i; j < arr.length; j++) {
                    if (tmp == arr[j]){
                        counter++;
                    }
                }
                if(counter >= size/2){
                    System.out.println("Wartosc " + tmp + " wystepuje w tablicy " + counter + " razy");
                }
                counter = 0;
            }
        }

        //Zadanie 03
        {
            System.out.println("Zadanie 03");
            System.out.print("Podaj najmniejsza warosc jaka moze przyjac rozmiar tablicy: ");
            int min = sc.nextInt();
            while (min < 0) {
                System.out.print("Wartosc nieprawodlowa. Wprowadz wartosc ponownie: ");
                min = sc.nextInt();
            }
            System.out.print("Podaj najwieksza warosc jaka moze przyjac rozmiar tablicy: ");
            int max = sc.nextInt();
            while (max < 0 || max < min) {
                System.out.print("Wartosc nieprawodlowa. Wprowadz wartosc ponownie: ");
                max = sc.nextInt();
            }

            int[] arr1 = new int[(int)((Math.random()*(max - min + 1))+min)];
            int[] arr2 = new int[(int)((Math.random()*(max - min + 1))+min)];
            int[] arr3 = new int[(int)((Math.random()*(max - min + 1))+min)];

            System.out.print("Podaj najmniejsza liczbe jaka moze znajdowac sie w tablicy: ");
            int minNum = sc.nextInt();
            System.out.print("Podaj najwieksza liczbe jaka moze znajdowac sie w tablicy: ");
            int maxNum = sc.nextInt();
            while(maxNum < minNum){
                System.out.print("Podana liczba jest mniejsza od dolnego zakresu losowanych liczb. Wprowadz wartosc ponownie: ");
                maxNum = sc.nextInt();
            }

            System.out.print("arr1 = {");
            for (int i = 0; i < arr1.length; i++) {
                arr1[i] = (int)((Math.random()*(maxNum - minNum + 1))+minNum);
                System.out.print(i < arr1.length - 1 ? arr1[i] + ", " : arr1[i] + "}\n");
            }
            System.out.print("arr2 = {");
            for (int i = 0; i < arr2.length; i++) {
                arr2[i] = (int)((Math.random()*(maxNum - minNum + 1))+minNum);
                System.out.print(i < arr2.length - 1 ? arr2[i] + ", " : arr2[i] + "}\n");
            }
            System.out.print("arr3 = {");
            for (int i = 0; i < arr3.length; i++) {
                arr3[i] = (int)((Math.random()*(maxNum - minNum + 1))+minNum);
                System.out.print(i < arr3.length - 1 ? arr3[i] + ", " : arr3[i] + "}\n");
            }

            int[][] arr4 = {arr1, arr2, arr3};

            System.out.println("arr4 = {");
            for (int i = 0; i < arr4.length; i++) {
                System.out.print("{");
                for (int j = 0; j < arr4[i].length; j++) {
                    System.out.print(j < arr4[i].length - 1 ? arr4[i][j] + ", " : arr4[i][j] + "}\n");
                }
            }
            System.out.println("}");
        }

        //Zadanie 04
        {
            System.out.println("Zadanie 04");
            System.out.print("Podaj rozmiar planszy: ");
            int size = sc.nextInt();
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    System.out.print(i == 0 || i == size - 1 ||
                            j == 0 || j == size - 1 ||
                            i == j || i == size - j - 1
                            ? "* " : ". ");
                }
                System.out.println();
            }
        }

        //Zadanie 05
        {
            System.out.println("Zadanie 05");

            int[] arr = new int[3];

            System.out.println("Polecenia: ");
            System.out.println("quit - spowoduje wyjscie z programu;");
            System.out.println("add - doda do tablicy kolejny element;");
            System.out.println("get - pobierze i usunie z tablicy ostatnio dodany element.");
            System.out.println("Wprowadz polecenie w formacie: \"liczba <spacja> polecenie\", przy czym cyfry wybierz z przedzialu [-5;5]");

            int number;
            int index = 0;
            String query;

            do {
                System.out.print("Wprowadz polecenie: ");
                number = sc.nextInt();
                query = sc.nextLine();
                switch (query) {
                    case " add" ->{
                        if(index < 3){
                            arr[index] = number;
                            index++;
                        } else {
                            System.out.println("Brak miejsc w tablicy.");
                        }
                        System.out.print("arr = {");
                        for (int i = 0; i < index; i++) {
                            System.out.print(i < index - 1 ? arr[i] + ", " : arr[i] + "}\n");
                        }
                    }
                    case " get" -> {
                        if(index < 3 && index != 0){
                            arr[index] = 0;
                            index--;
                        } else {
                            System.out.println("Tablica nie zawiera zadnych danych");
                        }
                        System.out.print("arr = {");
                        if (index < 3 && index != 0){
                            for (int i = 0; i < index; i++) {
                                System.out.print(i < index - 1 ? arr[i] + ", " : arr[i] + "}\n");
                            }
                        } else {
                            System.out.println("}");
                        }
                    }
                }
            } while ((number >= -5 && number <= 5) && !query.equals(" quit"));
        }

        //Zadanie 06
        {
            System.out.println("Zadanie 06");

            int[] arr = new int[3];

            System.out.println("Polecenia: ");
            System.out.println("quit - spowoduje wyjscie z programu;");
            System.out.println("add - doda do tablicy kolejny element;");
            System.out.println("get - pobierze i usunie z tablicy ostatnio dodany element.");
            System.out.println("Wprowadz polecenie w formacie: \"liczba <spacja> polecenie\", przy czym cyfry wybierz z przedzialu [-5;5]");

            int number;
            int index = 0;
            String query;

            do {
                System.out.print("Wprowadz polecenie: ");
                number = sc.nextInt();
                query = sc.nextLine();
                switch (query) {
                    case " add" ->{
                        if(index < 3){
                            arr[index] = number;
                            index++;
                        } else {
                            int[] tmp = new int[arr.length];
                            for (int i = 0; i < tmp.length; i++) {
                                tmp[i] = arr[i];
                            }
                            arr = new int[tmp.length + 1];
                            for (int i = 0; i < arr.length; i++) {
                                arr[i] = i < arr.length - 1 ? tmp[i] : number;
                            }
                            index++;
                        }
                        System.out.print("arr = {");
                        for (int i = 0; i < index; i++) {
                            System.out.print(i < index - 1 ? arr[i] + ", " : arr[i] + "}\n");
                        }
                    }
                    case " get" -> {
                        if(index < 3 && index != 0){
                            arr[index] = 0;
                            index--;
                        } else {
                            System.out.println("Tablica nie zawiera zadnych danych");
                        }
                        System.out.print("arr = {");
                        if (index < 3 && index != 0){
                            for (int i = 0; i < index; i++) {
                                System.out.print(i < index - 1 ? arr[i] + ", " : arr[i] + "}\n");
                            }
                        } else {
                            System.out.println("}");
                        }
                    }
                }
            } while ((number >= -5 && number <= 5) && !query.equals(" quit"));
        }
    }
}