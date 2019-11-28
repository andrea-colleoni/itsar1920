package collezioni;

import java.util.ArrayList;
import java.util.List;

public class Liste {

	public static void main(String[] args) {
		List<String> stringhe = new ArrayList<>();
		
		stringhe.add("uno");
		stringhe.add("due");
		stringhe.add("tre");
		stringhe.add("quattro");
		
		//System.out.println(stringhe.get(2));
		
		for(String s : stringhe) {
			System.out.println(s);
		}

	}

}
