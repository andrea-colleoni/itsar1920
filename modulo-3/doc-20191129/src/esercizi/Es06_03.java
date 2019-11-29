package esercizi;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Es06_03 {

	public static void main(String[] args) throws IOException {
		List<String> righe = new ArrayList<>();
		aggiungiRighe(righe, "f1.txt");
		aggiungiRighe(righe, "f2.txt");
		scriviRighe(righe, "unione2.txt");
	}
	
	public static void aggiungiRighe(List<String> righe, String nomeFile) throws IOException {
		BufferedReader f1 = new BufferedReader(new FileReader(new File(nomeFile)));
		String letta = f1.readLine();
		while (letta != null) {
			righe.add(letta);
			letta = f1.readLine();
		}
		f1.close();
	}
	
	public static void scriviRighe(List<String> righe, String nomeFile) throws IOException {
		BufferedWriter unione = new BufferedWriter(new FileWriter(new File(nomeFile)));
		for(String s : righe)
			unione.append(s + "\n");
		
		unione.close();
	}

}
