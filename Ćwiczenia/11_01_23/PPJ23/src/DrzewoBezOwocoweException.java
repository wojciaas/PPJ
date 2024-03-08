public class DrzewoBezOwocoweException
    extends Exception{
    public DrzewoBezOwocoweException(){
        super("Nie mozna zerwac owocu poniewaz nie jest drzewem owocowym\n");
    }
}
