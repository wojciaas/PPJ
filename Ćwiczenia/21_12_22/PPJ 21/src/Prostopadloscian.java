public class Prostopadloscian
    extends Prostokat{
    private double height;
    public Prostopadloscian(double length, double width, double height){
        super(length, width);
        this.height = height;
    }
    public double getPole(){
        return 2 * surfArea() + 2 * getWidth() * height + 2 * getLength() * height;
    }
    public double getObj(){
        return getWidth() * getLength() * height;
    }
    @Override
    public String toString() {
        return "Prostopadloscian {" +
                "width = " + getWidth() +
                ", length = " + getLength() +
                ", height = " + height +
                ", Pole = " + getPole() +
                ", Obj = " + getObj() +
                '}';
    }
}
