package linguaggio;

public class ChiamataDiMetodo {

	public static void main(String[] args) {
		
		a();
		
	}

	public static void a() {
		System.out.println("a");
		b();
	}

	public static void b() {
		System.out.println("b");
		c();
	}

	public static void c() {
		System.out.println("c");
		d();
	}

	public static void d() {
		System.out.println("d");
	}

}
