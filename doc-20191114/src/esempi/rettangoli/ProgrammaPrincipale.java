package esempi.rettangoli;

public class ProgrammaPrincipale {

	public static void main(String[] args) {
		int pluto = 10;
		String pippo = "ciao";
		Rettangolo r1 = new Rettangolo(); // invoco costruttore vuoto
		
		//r1.base = 3;
		r1.setBase(3); // valorizzo campi
		r1.setAltezza(4.5F);
		
		System.out.println("la base è " + r1.getBase());

		Rettangolo r2 = new Rettangolo(30, 4); // invoco inizializzatore
		// non ho più bisogno di modificare i campi (lo stato)
//		r2.setBase(30);
//		r2.setAltezza(4);
		
		Rettangolo r3 = new Rettangolo(10, 12);
		
		float area = r2.getArea();
		System.out.println(area);
		
		System.out.println(r1.getArea());
		
		Pittura rosso = new Pittura();
		rosso.setColore("Rosso");
		rosso.setCostoInEuroAlLitro(1.5F);
		rosso.setResaInLitriAlMetroQuadro(3);
		
		Pittura verde = new Pittura();
		verde.setColore("Verde");
		verde.setCostoInEuroAlLitro(2.5F);
		verde.setResaInLitriAlMetroQuadro(2);
		
		System.out.println(r1.getCostoDiColorazione(rosso));
		System.out.println(r2.getCostoDiColorazione(rosso));

		System.out.println(r1.getCostoDiColorazione(verde));
		System.out.println(r2.getCostoDiColorazione(verde));
	}

}
