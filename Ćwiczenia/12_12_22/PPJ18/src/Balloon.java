public class Balloon {
    public double helium;
    public int size;
    String material;

    public Balloon() {
        material = "lateks";
        helium = Math.random() * (0.009 - 0.005) + 0.005;
        size = 9;
    }

    public double getLoad(){
        return (6/0.007) + helium;
    }
}
