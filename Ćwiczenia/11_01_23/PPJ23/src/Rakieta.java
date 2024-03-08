public class Rakieta {
    private String nazwa;
    private int wagaPaliwa = 0;

    public Rakieta(String nazwa) {
        this.nazwa = nazwa;
        this.wagaPaliwa = wagaPaliwa;
    }

    void zatankuj(){
        wagaPaliwa = (int)(Math.random() * 5001);
    }

    void start() throws Exception{
        if (wagaPaliwa < 1000) throw new Exception("start anulowany - za malo paliwa");
        else System.out.println("Procedura startowa rozpoczęta.");
    }
}
