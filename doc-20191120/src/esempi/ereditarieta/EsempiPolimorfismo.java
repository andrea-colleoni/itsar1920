package esempi.ereditarieta;

public class EsempiPolimorfismo {

	public static void main(String[] args) {
		
		Felino felix = new Felino();
		felix.setSpecie("Leone");
		felix.graffia();
		
		Mammifero tom = new Felino();
		tom.setSpecie("Gatto siamese");
		tom.muoviti();
//		tom.graffia();
		((Felino)tom).graffia();
		
		Mammifero dumbo = new Mammifero();
		dumbo.setSpecie("Elefante");
		((Felino)dumbo).graffia();
	}

}
