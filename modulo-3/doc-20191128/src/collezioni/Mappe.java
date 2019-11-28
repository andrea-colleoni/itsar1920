package collezioni;

import java.util.HashMap;
import java.util.Map;

public class Mappe {

	public static void main(String[] args) {
		// Map<tipo chiave, tipo valore>
		Map<String, String> colori = new HashMap<>();
		
		// put(chiave, valore)
		colori.put("v",  "verde");
		colori.put("r",  "rosso");
		colori.put("b",  "blu");
		
		System.out.println(colori.get("v"));
		System.out.println("-------------------");
		for(String k : colori.keySet()) {
			System.out.println(k);
			System.out.println(colori.get(k));
		}
		System.out.println("-------------------");
		for(String v : colori.values()) {
			System.out.println(v);
		}
	}

}
