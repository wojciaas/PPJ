public
	class PPJ04{
		public static void main(String[] args){
			
			System.out.println("Zadanie04-1" + "\n");
			
			int a, b;
			a = -13;
			b = 2;
			int dodawanie = a + b;
			int odejmowanie = a - b;
			int mnozenie = a * b;
			int dzielenie = a / b;
			int resztaZDzielenia = a % b;
			System.out.println("Liczby calkowite:" + "\n");
			System.out.println("dodawanie: " + a + " + " + b + " = " + dodawanie);
			System.out.println("odejmowanie: " + a + " - " + b + " = " + odejmowanie);
			System.out.println("mnozenie: " + a + " * " + b + " = " + mnozenie);
			System.out.println("dzielenie: " + a + " / " + b + " = " + dzielenie);
			System.out.println("dzielenie: " + a + " % " + b + " = " + resztaZDzielenia + "\n");
			
			double x, z;
			x = 14.2;
			z = -3.4;
			double dodawanieF = x + z;
			double odejmowanieF = x - z;
			double mnozenieF = x * z;
			double dzielenieF = x / z;
			double resztaZDzieleniaF = x % z;
			System.out.println("Liczby rzeczywiste:" + "\n");
			System.out.println("dodawanie: " + x + " + " + z + " = " + dodawanieF);
			System.out.println("odejmowanie: " + x + " - " + z + " = " + odejmowanieF);
			System.out.println("mnozenie: " + x + " * " + z + " = " + mnozenieF);
			System.out.println("dzielenie: " + x + " / " + z + " = " + dzielenieF);
			System.out.println("dzielenie: " + x + " % " + z + " = " + resztaZDzieleniaF + "\n");
			
			System.out.println("Zanki:" + "\n");
			System.out.println("dodawanie: " + 'a' + " + " + 'b');
			/*System.out.println("odejmowanie: " + 'a' - 'b');
			System.out.println("mnozenie: " + 'a' * 'b');
			System.out.println("dzielenie: " + 'a' / 'b');
			System.out.println("dzielenie: " + 'a' % 'b');*/
			
			System.out.println("Zadanie04-2" + "\n");
			System.out.println("true true");
			System.out.println("&& " + (true && true));
			System.out.println("|| " + (true || true));
			System.out.println("^ " + (true ^ true) + "\n");
			System.out.println("false false");
			System.out.println("&& " + (false && false));
			System.out.println("|| " + (false || false));
			System.out.println("^ " + (false ^ false) + "\n");
			System.out.println("true false");
			System.out.println("&& " + (true && false));
			System.out.println("|| " + (true || false));
			System.out.println("^ " + (true ^ false) + "\n");
			
			System.out.println("Zadanie04-3");
			System.out.println("s-ka w hex: " + 0x27994); //27994
			System.out.println(0b10_0111_1001_1001_0100 + "\n");
			
			System.out.println("Zadanie04-4");
			System.out.println((Math.pow(Math.sqrt(2), 2)) - 2 + "\n");
			System.out.println(Math.sqrt(2) * Math.sqrt(2) - 2 + "\n");
			
			System.out.println("Zadanie04-5");
			System.out.println("0b1011010110101:");
			System.out.println("DEC: " );
		}
	}