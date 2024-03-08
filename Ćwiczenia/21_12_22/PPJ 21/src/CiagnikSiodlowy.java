public class CiagnikSiodlowy
    extends PojazdKolowy {
    private double masa;
    public CiagnikSiodlowy(String color, int iloscOsi, double masa) {
        super(color, iloscOsi);
        this.masa = masa;
    }
    public void rozpocznijJazde(){
        if(masa/super.getIloscOsi() > 11) {
            System.out.println("Jazda niebezpieczna, odmowa uruchomienia silnika");
        } else {
            System.out.println("Milej podrozy");
        }
    }
}
