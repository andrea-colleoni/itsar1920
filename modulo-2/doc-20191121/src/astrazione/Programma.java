package astrazione;

public class Programma {

	public static void main(String[] args) {
		FiguraGeometricaPiana fgp = new PoligonoRegolare(4, 10);
		stampaAreaFigura(fgp);
		
		FiguraGeometricaPiana f2 = new Quadrato(25);
		stampaAreaFigura(f2);
		
		FiguraGeometricaPiana f3 = new Rettangolo(10, 20);
		stampaAreaFigura(f3);
		
		FiguraConAreaCalcolabile c = new Cerchio(10);
		stampaAreaFigura(c);
	}
	
	
	public static void stampaAreaFigura(FiguraConAreaCalcolabile f) {
		System.out.println(f.area());
	}

}
