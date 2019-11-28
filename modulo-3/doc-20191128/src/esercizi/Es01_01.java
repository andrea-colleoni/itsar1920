package esercizi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Es01_01 {

	public static void main(String[] args) {
			List<String> strumenti = new ArrayList<>(Arrays.asList("cello", "guitar", "violin", "double bass"));
			List<Character> caratteriDaRimuovere = new ArrayList<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));
			for(String strumento : strumenti) {
				List<Character> chars = new ArrayList<Character>();
				for(Character c : strumento.toCharArray()) {
					chars.add(c);
				}
				
				chars.removeAll(caratteriDaRimuovere);
				StringBuffer sb = new StringBuffer();
				for(Character c : chars) {
					sb.append(c);
				}
				System.out.println(sb.toString());
			}
		}
		
		public static void metodo1() {
			String[] strumenti = { "cello", "guitar", "violin", "double bass" };
			
			for(String strumento : strumenti) {
				StringBuffer sb = new StringBuffer();
				for(Character c : strumento.toCharArray()) {
					if(		Character.toLowerCase(c) != 'a' &&
							Character.toLowerCase(c) != 'e' &&
							Character.toLowerCase(c) != 'i' &&
							Character.toLowerCase(c) != 'o' &&
							Character.toLowerCase(c) != 'u') {
						sb.append(c);
					}
				}
				strumento = sb.toString();
				System.out.println(strumento);			
		}
	}

}
