public class Ball {
    private double radius;
    private static int ballCounter;
    private static double r;
    private Ball(double radius) {
        this.radius = radius;
    }
    public static Ball makeBall(){
        r = Math.random()*11 + 10;
        ballCounter++;
        return new Ball(r);
    }
    public static int showCounter(){
        return ballCounter;
    }
}
