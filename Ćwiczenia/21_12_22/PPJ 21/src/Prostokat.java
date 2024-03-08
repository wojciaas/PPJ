public class Prostokat {
    private double length;
    private double width;
    public Prostokat(double length, double width) {
        this.length = length;
        this.width = width;
    }
    public double surfArea(){
        return length * width;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    @Override
    public String toString() {
        return "Prostokat {" +
                "lenght = " + length +
                ", width = " + width +
                ", Pole = " + surfArea() +
                '}';
    }
}
