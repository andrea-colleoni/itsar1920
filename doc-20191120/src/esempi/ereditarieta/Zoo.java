package esempi.ereditarieta;

import java.util.ArrayList;

public class Zoo {

	private ArrayList<Animale> animali = new ArrayList<>();
	private String nome;
	
	public void aggiungi(Animale animale) {
		animali.add(animale);
	}
	
	public void stampaInformazioni() {
		System.out.println("Elenco animali:");
		for(Animale animaleDelloZoo : animali) {
			System.out.println(animaleDelloZoo.getSpecie());
			animaleDelloZoo.muoviti();
			animaleDelloZoo.mangia();
		}
	}
	

	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}
	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}


	/**
	 * @return the animali
	 */
	public ArrayList<Animale> getAnimali() {
		return animali;
	}


	/**
	 * @param animali the animali to set
	 */
	public void setAnimali(ArrayList<Animale> animali) {
		this.animali = animali;
	}
}
