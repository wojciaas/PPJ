public class NotEnoughGas
    extends Exception{
    public NotEnoughGas(int iloscPaliwa) {
        super("Only " + iloscPaliwa + " liters. Must fill the tank");
    }
}
