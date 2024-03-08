public class Donkey {
    private double mass;
    private Balloon[] balloons;
    private int index = 0;
    public Donkey(double mass) {
        this.mass = mass * 1000;
        balloons = new Balloon[10000];
    }
    public void addBaloon(Balloon balloon){
         balloons[index++] = balloon;
    }
    public boolean isFlying(){
        double count = 0;
        for (int i = 0; i < index; i++) {
            count += balloons[i].getLoad();
        }
        return count >= mass;
    }
}
