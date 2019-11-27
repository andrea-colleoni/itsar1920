package linguaggio;

public class TypeSystem {

	public static void main(String[] args) {
		// tipi primitivi
		byte b = 10;

		char c = 65;
		char a = 'A';

		short s = 100;
		int i = 1000;
		long l = 10000;

		float f = 10.5F;
		double d = 100.5;

		boolean tf = true;

		// reference types
		String str1 = "ciao";
		String str2 = "buongiorno";
		String str3 = "buonasera";
		String str4 = "ciao";

		String str5 = str3;
		int j = i;
		// wrapper
		Integer k = 1000;
		Short ss = 10;
		Float ff = 10.5F;
		Double dd = 100.5;
		Long ll = 10000L;
		Byte bb = 10;
		Character cc = 'A';
		Boolean tftf = true;

		// i vale 1000  la passo al metodo
		usaECambiaInt(i);
		System.out.println(i);
		
		// str1 contiene ciao
		usaECambiaStr(str1);
		System.out.println(str1);
		
		// k vale 1000
		usaECambiaInteger(k);
		System.out.println(k);
		
		Lampadina lamp = new Lampadina();
		lamp.accesa = true;
		usaEModificaLampadina(lamp);
		System.out.println(lamp.accesa);
	}
	
	public static void usaEModificaLampadina(Lampadina v) {
		System.out.println(v.accesa);
		v.accesa = false;
	}

	public static void usaECambiaInt(int v) {
		System.out.println(v);
		v = 666;
	}

	public static void usaECambiaStr(String v) {
		System.out.println(v);
		v = "modificato";
	}

	public static void usaECambiaInteger(Integer v) {
		System.out.println(v);
		v = 999;
	}
	
	public static void usaECambiaIntegerModo2(Integer v) {
		System.out.println(v);
		// v.value = 999;
	}

}
