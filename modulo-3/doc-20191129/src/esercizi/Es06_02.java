package esercizi;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Es06_02 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(new File("a.txt")));
		BufferedWriter bw = new BufferedWriter(new FileWriter (new File("b2.txt")));
		
		String riga = br.readLine();
		int conto = 1;
		int caratteri = 0;
		while(riga != null) {
			conto++;
			caratteri += riga.length();
			riga = br.readLine();
		}
		
		bw.append("Numero righe lette: " + conto + "\n");
		bw.append("Numero caratteri letti: " + caratteri);
		
		br.close();
		bw.close();
	}

}
