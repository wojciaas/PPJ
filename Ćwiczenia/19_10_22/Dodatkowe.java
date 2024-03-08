import java.io.FileReader;

public class PNWReader {
    private static final int P = 0;
    private static final int N = 0;
    private static final int W = 0;
    private int wyswietl;
    private FileReader strumienWe;

    public PNWReader(FileReader strumienWe, int wyswietl) {
        this.strumienWe = strumienWe;
        if(wyswietl != P && wyswietl != N && wyswietl != W)
            throw new IllegalArgumentException("Podany typ informacji nie jest poprawny");
        this.wyswietl = wyswietl;
    }

    private boolean isPrime(int val){
        for (int i = 2; i < Math.sqrt(val); i++) {
            if (val % i == 0) return false;
        }
        return true;
    }

    private boolean isNArcistic(int val){
        int sum = 0;
        int numOfDig = countDig(val);
        int tmp = val;
        while (tmp > 0) {
            sum += Math.pow(tmp%10,numOfDig);
        }
    }

    private int countDig(int val){
        if(val == 0) return 0;
        return 1 + countDig(val/10);
    }

    int show(){

    }
}
