package esercizio.lampadina;

public class FilareDiLuci {

	private Lampadina[] lampadine;

	public void intermittenzaPariDispari() {
		for (Lampadina l : lampadine) {
			l.stampaCaratteristiche();
			l.accendi();
		}

		while (!tutteSpente()) {
			System.out.println("----- ooooo -----");
			for (int i = 0; i < lampadine.length; i++) {
				if (i % 2 == 0) {
					lampadine[i].accendi(1);
				} else {
					lampadine[i].spegni();
				}
			}
			System.out.println("ooooo ----- ooooo");
		}
	}

	private boolean tutteAccese() {
		boolean risultato = true;
		for (Lampadina l : lampadine)
			risultato &= l.isAccesa();
		return risultato;
	}

	private boolean tutteSpente() {
		boolean risultato = true;
		for (Lampadina l : lampadine)
			risultato &= !l.isAccesa();
		return risultato;
	}

	/**
	 * @return the lampadine
	 */
	public Lampadina[] getLampadine() {
		return lampadine;
	}

	/**
	 * @param lampadine the lampadine to set
	 */
	public void setLampadine(Lampadina[] lampadine) {
		this.lampadine = lampadine;
	}

}
