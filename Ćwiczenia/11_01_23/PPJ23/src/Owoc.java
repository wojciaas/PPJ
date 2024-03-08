public abstract class Owoc {
    private String nazwa;
    private double masa;

    public Owoc(String nazwa) {
        this.nazwa = nazwa;
        this.masa = Math.random() * (250 - 100 + 1) + 100;
    }

    public String getNazwa() {
        return nazwa;
    }

    public double getMasa() {
        return masa;
    }
}
