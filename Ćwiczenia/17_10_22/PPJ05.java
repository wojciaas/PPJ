public
	class PPJ05 {
		public static void main(String[] args) {
			System.out.println("PPJ05" + "\n");

			System.out.println("Zadanie 1");{
			System.out.println("Przypuszczenie: wynik to 16");
			int x = 5;
			System.out.println((x=4) * x + "\n");}

			System.out.println("Zadanie 2");
			System.out.println(((1+2*3+4)/(5-6)+78)/(9-10/11) + "\n");

			System.out.println("Zadanie 3");{
			int x = 2024;
			System.out.println(((x % 4 == 0) && (x % 100 != 0)) || x % 400 == 0 ? 
			"Rok " + x + " jest przestepny.\n" : 
			"Rok " + x + " nie jest przestepny.\n");}

			System.out.println("Zadanie 4");
			System.out.println("Zadeklarowane zmienne zapisane zostaly w kodzie zrodlowym.");
			byte byteMinDec = (byte) -128;
			byte byteMaxDec = (byte) 127;
			byte byteMinBin = (byte) 0b1000_0000;
			byte byteMaxBin = (byte) 0b0111_1111;
			byte byteMinOct = (byte) 0200;
			byte byteMaxOct = (byte) 0;
			System.out.println(byteMinOct);

			short shortMin = -32768;
			short shortMax = 32767;

			int intMin = -2147483648;
			int intMax = 2147483647;

			long longMin = -9223372036854775808L;
			long longMax = 9223372036854775807L;

			//float floatMin = -3.xE+38F;
		}
	}