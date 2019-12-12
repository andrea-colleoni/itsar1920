import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GruppiProgetti {

	public static void main(String[] args) {
		List<String> gruppi = new ArrayList<String>(Arrays.asList("NeCaGrCa", "CiDCCoTo", "CoDCAcRo", "SaFiBaTs", "SoRoCiDo", "StRuRaDP"));
		List<String> progetti = new ArrayList<String>(Arrays.asList("quiz", "mes", "pet", "gas", "gest", "bfast"));

		for (int i = 6; i > 0; i--) {
			int casualeG = (int)(Math.random() * i) + 1;
			int casualeP = (int)(Math.random() * i) + 1;
			
			System.out.println(gruppi.get(casualeG - 1) + " <->" + progetti.get(casualeP - 1));
			
			gruppi.remove(gruppi.get(casualeG - 1));
			progetti.remove(progetti.get(casualeP - 1));
		}

	}

}
