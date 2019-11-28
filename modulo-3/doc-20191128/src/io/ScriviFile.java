package io;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ScriviFile {

	public static void main(String[] args) throws IOException {
		
		BufferedWriter bw;
		FileWriter fw;
		File f;
		f = new File("primo.txt");
		fw = new FileWriter(f);
		bw = new BufferedWriter(fw);

		bw.append("ciao");
		
		// finalizza l'esecuzione di tutte le operazioni pendenti
		// sullo stream sottostante il writer (se ve ne sono)
		bw.flush();
		
		bw.close();
	}

}
