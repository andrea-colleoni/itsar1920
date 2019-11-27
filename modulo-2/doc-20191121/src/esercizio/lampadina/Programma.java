package esercizio.lampadina;

public class Programma {

	public static void main(String[] args) {
		
		Lampadina[] lampadine = new Lampadina[10];
		
		lampadine[0] = new Lampadina(TipoLampadina.Led, 10, "rosso");
		lampadine[1] = new Lampadina(TipoLampadina.Led, 10, "giallo");
		lampadine[2] = new Lampadina(TipoLampadina.Led, 10, "verde");
		lampadine[3] = new Lampadina(TipoLampadina.Led, 10, "rosa");
		lampadine[4] = new Lampadina(TipoLampadina.Led, 10, "blu");
		lampadine[5] = new Lampadina(TipoLampadina.Led, 10, "bianco");
		lampadine[6] = new Lampadina(TipoLampadina.Led, 10, "arancione");
		lampadine[7] = new Lampadina(TipoLampadina.Led, 10, "marrone");
		lampadine[8] = new Lampadina(TipoLampadina.Led, 10, "fuchsia");
		lampadine[9] = new Lampadina(TipoLampadina.Led, 10, "azzurra");

		FilareDiLuci filare = new FilareDiLuci();
		filare.setLampadine(lampadine);
		
		filare.intermittenzaPariDispari();
	}

}
