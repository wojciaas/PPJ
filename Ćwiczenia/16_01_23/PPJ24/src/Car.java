public class Car {
    private int iloscPaliwa;
    private int przejechaneKilometry;

    public Car() {
        iloscPaliwa = 35;
        przejechaneKilometry = 0;
    }

    void fill(){
        int ex = (int)(Math.random()*10+1);
        if (ex == 1) throw new Explosion();
        iloscPaliwa += (int)(Math.random()*21+15);
        System.out.println("Aktualna ilosc paliwa w baku: " + iloscPaliwa);
    }

    void drive100km() throws NotEnoughGas{
        if(iloscPaliwa < 10) throw new NotEnoughGas(iloscPaliwa);
        iloscPaliwa -= 10;
        przejechaneKilometry += 100;
        System.out.println(przejechaneKilometry + "km driven, " + iloscPaliwa + " liters left");
    }
}
