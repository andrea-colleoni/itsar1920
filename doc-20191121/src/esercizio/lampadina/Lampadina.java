package esercizio.lampadina;

public class Lampadina {
	
	private boolean accesa;
	private TipoLampadina tipologia;
	private int vitaInMinuti;
	private int minutiTotaliUtilizzo;
	private String colore;
	
	
	
	public Lampadina(TipoLampadina tipologia, int vitaInMinuti, String colore) {
		this.tipologia = tipologia;
		this.vitaInMinuti = vitaInMinuti;
		this.colore = colore;
	}

	public void accendi() {
		if (minutiTotaliUtilizzo < vitaInMinuti) {
			System.out.println("accesa");
			this.setAccesa(true);
		} else {
			this.setAccesa(false);
		}
	}
	
	public void accendi(int minuti) {
		this.minutiTotaliUtilizzo += minuti;
		accendi();
	}
	
	public void spegni() {
		System.out.println("spenta");
		this.setAccesa(false);
	}
	
	public void inverti() {
		if (this.accesa) spegni(); else accendi();
	}
	
	public void stampaCaratteristiche() {
		System.out.println(this.toString());
	}
	
	
	/**
	 * @return the accesa
	 */
	public boolean isAccesa() {
		return accesa;
	}
	/**
	 * @param accesa the accesa to set
	 */
	public void setAccesa(boolean accesa) {
		this.accesa = accesa;
	}
	/**
	 * @return the tipologia
	 */
	public TipoLampadina getTipologia() {
		return tipologia;
	}
	/**
	 * @param tipologia the tipologia to set
	 */
	public void setTipologia(TipoLampadina tipologia) {
		this.tipologia = tipologia;
	}
	/**
	 * @return the vitaInMinuti
	 */
	public int getVitaInMinuti() {
		return vitaInMinuti;
	}
	/**
	 * @param vitaInMinuti the vitaInMinuti to set
	 */
	public void setVitaInMinuti(int vitaInMinuti) {
		this.vitaInMinuti = vitaInMinuti;
	}
	/**
	 * @return the minutiTotaliUtilizzo
	 */
	public int getMinutiTotaliUtilizzo() {
		return minutiTotaliUtilizzo;
	}
	/**
	 * @param minutiTotaliUtilizzo the minutiTotaliUtilizzo to set
	 */
	public void setMinutiTotaliUtilizzo(int minutiTotaliUtilizzo) {
		this.minutiTotaliUtilizzo = minutiTotaliUtilizzo;
	}
	/**
	 * @return the colore
	 */
	public String getColore() {
		return colore;
	}
	/**
	 * @param colore the colore to set
	 */
	public void setColore(String colore) {
		this.colore = colore;
	}

	@Override
	public String toString() {
		return "Lampadina [accesa=" + accesa + ", tipologia=" + tipologia + ", vitaInMinuti=" + vitaInMinuti
				+ ", minutiTotaliUtilizzo=" + minutiTotaliUtilizzo + ", colore=" + colore + "]";
	}	

}
