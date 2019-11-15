package esempi.rettangoli;

public class ProgrammaPrincipale {

	public static void main(String[] args) {
		int pluto = 10;
		String pippo = "ciao";
		Rettangolo r1 = new Rettangolo();
		
		int altezza = 10;
		int base = 15;

		r1.base = 3;
		r1.altezza = 4.5F;

		Rettangolo r2 = new Rettangolo();

		r2.base = 30;
		r2.altezza = 4;
		
		float area = r2.area();
		System.out.println(area);
		
		System.out.println(r1.area());
		
		Pittura rosso = new Pittura();
		rosso.colore = "Rosso";
		rosso.costoInEuroAlLitro = 1.5F;
		rosso.resaInLitriAlMetroQuadro = 3;
		
		Pittura verde = new Pittura();
		verde.colore = "Verde";
		verde.costoInEuroAlLitro = 2.5F;
		verde.resaInLitriAlMetroQuadro = 2;
		
		System.out.println(r1.costoDiColorazione(rosso));
		System.out.println(r2.costoDiColorazione(rosso));

		System.out.println(r1.costoDiColorazione(verde));
		System.out.println(r2.costoDiColorazione(verde));
	}

}
