package esercizi;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Es06_01 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(new File("a.txt")));
		BufferedWriter bw = new BufferedWriter(new FileWriter (new File("b.txt")));
		
		String riga = br.readLine();
		int conto = 1;
		while(riga != null) {
			if (conto++ % 2 == 0)
				bw.write(riga +"\n");
			riga = br.readLine();
		}
		
		br.close();
		bw.close();
	}

}
