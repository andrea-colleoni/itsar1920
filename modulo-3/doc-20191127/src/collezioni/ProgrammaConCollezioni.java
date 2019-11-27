package collezioni;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ProgrammaConCollezioni {

	public static void main(String[] args) {
		// int[] interi = { 5, 8, 12, 34, 19, 12, 17, 21, 4, 49, 22 };
//		List<Integer> interi = new ArrayList<>();
//		interi.add(5);
//		interi.add(8);
		
		List<Integer> interi = new ArrayList<>(Arrays.asList( 5, 8, 12, 34, 19, 12, 17, 21, 4, 49, 22 ));
		
		interi.add(27);
		interi.remove(Integer.valueOf(19));
		
		interi.sort(null);
		
		stampaMedia(interi);
	}

	public static void stampaMedia(List<Integer> interi) {
		int somma = 0;	
		for(int n : interi)
			somma += n;
		System.out.println("la media è :" + (somma / interi.size()));
	}

}
