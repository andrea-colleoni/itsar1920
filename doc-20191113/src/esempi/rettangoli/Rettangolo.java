package esempi.rettangoli;

public class Rettangolo {
	float base;
	float altezza;
	
	float area() {
		return base * altezza;
	}
	
	float costoDiColorazione(Pittura pittura) {
		return area() * pittura.resaInLitriAlMetroQuadro * pittura.costoInEuroAlLitro;
	}
}
