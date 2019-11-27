package linguaggio;

public class ProgramFlow {

	public static void main(String[] args) {	
		
	}
	
	public static void usoDiWhile() {
		// while
		// while(<espressione che si risolve in un boolean>)
		
		int i = 0;
		while (i < 10) {
			System.out.println(++i);
		}
		
		// forma do...while()
		i = 11;
		do {
			System.out.println(i++);
		} while(i < 10);
	}
	
	public static void usoDiFor2() {
		// looping: for (each)
		// viene utilizzato per scorrere le collezioni di elementi (array)
		int[] arr = new int[10];
		arr[0] = 2;
		arr[1] = 5;
		// ...
		
		int[] arr2 = { 2, 5, 8, 10, 9, 17, 21, 5 };
		// si potrebbe fare così...
		for(int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i]);
		}
		
		// ma si può fare anche così
		for(int n : arr2) { // per ogni numeo int n nella collezione arr2
			System.out.println(n);
		}		
	}
	
	public static void usoDiFor1() {
		// looping: for
		
		// for(<istruzione inizio ciclo>, <condizione permanenza nel ciclo>; <istruzione fine ciclo>)
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}
		int i = 0;
		for (; i < 10; i++) {
			System.out.println(i);
		}
		
		int j = 0;
		for (;; j++) {
			if (j < 10) {
				System.out.println(j);
			} else break;
		}
		
		int k = 0;
		for (;;) {
			if (k < 10) {
				System.out.println(k);
				k++;
			} else break;
		}
	}
	public static void usoDiSwitch() {
		// branching: switch
		int a = 2;
		
		switch (a) {
		case 1:
		case 2: 
		case 3:
			System.out.println("è uno!");
			System.out.println("è due!!");
			System.out.println("è tre!!!");
			break;
		case 4:
			System.out.println("è quattro!!!!");
			break;
		default:
			System.out.println("né 1, 2, 3 né 4");
			break;
		}
	}
	
	public static void usoDiIf() {
		// branching: if
		int a = 10;
		
		System.out.println(a);
		// if (<espressione che si risolve in un boolean>)
		
		if (a > 5) System.out.println("maggiore");
		
		if (a > 5) 
			System.out.println("maggiore");
		
		// forma con solo if() preferibile
		if (a > 5) {
			System.out.println("maggiore");
		}
		System.out.println("dopo if");
		
		if (a < 20) System.out.println("minore"); else System.out.println("maggiore");

		if (a < 20) 
			System.out.println("minore");
		else {
			System.out.println("maggiore");
		}
		// forma if() else preferibile
		if (a < 20) {
			System.out.println("minore");
		} else {
			System.out.println("maggiore");
		}
		
		// più di due rami => più di una condizione
		if (a > 20) {
			System.out.println("maggiore");
		} else if (a < 5) {
			System.out.println("minore");
		} else {
			System.out.println("compreso");
		}
	}
}
