package esempi.ereditarieta;

public class AlloZoo {

	public static void main(String[] args) {
		
		Zoo zoo = new Zoo();
		
		zoo.setNome("Zoo di Milano");
		
		Felino leone = new Felino();
		leone.setSpecie("Leone Africano");
		
		zoo.aggiungi(leone);

		Mammifero elefante = new Mammifero();
		elefante.setSpecie("Elefante Indiano");
		
		zoo.aggiungi(elefante);
		
		Animale boa = new Rettile();
		boa.setSpecie("Boa Costrictor");
		
		zoo.aggiungi(boa);
		
		Object scoiattolo = new Roditore();
		((Animale)scoiattolo).setSpecie("Scoiattolo Europeo");
		zoo.aggiungi((Animale)scoiattolo);
		
		zoo.stampaInformazioni();
	}

}
