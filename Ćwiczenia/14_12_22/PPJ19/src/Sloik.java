public class Sloik {
    private Dzem dzem;
    private boolean czyOtwarty;
    public Sloik(Dzem dzem) {
        this.dzem = dzem;
        czyOtwarty = false;
    }
    public void otworz(){
        czyOtwarty = true;
    }
    public void zamknij(){
        czyOtwarty = false;
    }
    public boolean czyOtwarty(){
        return czyOtwarty;
    }
}
