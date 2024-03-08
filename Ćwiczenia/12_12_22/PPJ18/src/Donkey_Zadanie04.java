public class Donkey_Zadanie04 {
    private double mass;
    private Balloon[] balloons;
    public Donkey_Zadanie04(double mass){
        this.mass = mass * 1000;
        balloons = new Balloon[0];
    }
    public void addBaloon(Balloon balloon){
        changeTabSize();
        balloons[balloons.length - 1] = balloon;
    }
    public boolean isFlying(){
        double counter = 0;
        for (int i = 0; i < balloons.length; i++) {
            counter += balloons[i].getLoad();
        }
        return counter >= mass;
    }
    private void changeTabSize(){
        Balloon[] tmp = new Balloon[balloons.length + 1];
        for (int i = 0; i < balloons.length; i++) {
            tmp[i] = balloons[i];
        }
        balloons = tmp;
    }
    public int getBalloonsLen() {
        return balloons.length;
    }
}
