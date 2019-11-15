package esempi.ereditarieta;

public class ProgrammaZoo {

	public static void main(String[] args) {
		Animale mosca = new Animale();
		mosca.setSpecie("Mosca");
		mosca.setHabitat("aria");
		
		Mammifero mucca = new Mammifero();
		mucca.setSpecie("Mucca");
		mucca.setTempoGestazione(300);
		
		Felino gatto = new Felino();
		gatto.setSpecie("Gatto siamese");
		gatto.setHabitat("Casa");
		gatto.setSistemaCircolatorio("Cuore, arterie e vene");
		gatto.setTipoPelo("Morbido");
		
		mosca.muoviti();
		
		mucca.muoviti();
		mucca.allatta();
		
		gatto.muoviti();
		gatto.allatta();
		gatto.graffia();
		
	}

}
