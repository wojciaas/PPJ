import java.io.FileInputStream;

public class MojSkaner {
    private FileInputStream strumienWe;

    public MojSkaner(FileInputStream strumienWe) {
        this.strumienWe = strumienWe;
    }

    String odczytajSlowo(){
        int val;
        String result = "";
        try{
            while ((val = strumienWe.read()) != ' ' &&
                    val != '\t' &&
                    val != '\r' &&
                    val != '\n' &&
                    val != -1
            ) {
                result += (char)val;
            }
        } catch(Exception ex){
            ex.printStackTrace();
        }

        return result;
    }
    String odczytajLinie(){
        int val;
        String result = "";
        try {
            while ((val = strumienWe.read()) != '\n' &&
                    val != '\r' &&
                    val != -1
            ){
                result += (char)val;
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return result;
    }
    int odczytajLiczbeCalkowita(){
        int val;
        boolean isNegative = false;
        int result = 0;
        try{
            while((val = strumienWe.read()) != '\r' &&
                    val != ' ' &&
                    val != '\n' &&
                    val != -1
            ){
                if(val == '-'){
                    isNegative = true;
                } else {
                    result *= 10;
                    result += val - '0';
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return isNegative ? -result : result;
    }
    int odczytajDodatniaLiczbeCalkowita() throws Exception{
        int result = odczytajLiczbeCalkowita();
        if (result < 0)
            throw new Exception("Liczba nie jest dodatnia");
        return result;
    }
}
