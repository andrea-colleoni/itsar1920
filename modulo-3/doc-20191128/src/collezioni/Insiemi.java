package collezioni;

import java.util.HashSet;
import java.util.Set;

public class Insiemi {

	public static void main(String[] args) {
		Set<String> insieme = new HashSet<>();
		
		System.out.println(insieme.add("uno"));
		System.out.println(insieme.add("due"));
		System.out.println(insieme.add("tre"));
		System.out.println(insieme.add("quattro"));
		System.out.println(insieme.add("uno"));

		for(String s : insieme) {
			System.out.println(s);
		}
	}

}
