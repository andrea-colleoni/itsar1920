package io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class LeggiFile {

	public static void main(String[] args) throws IOException {
		BufferedReader br;
		FileReader fr;
		File f;
		f = new File("primo.txt");
		fr = new FileReader(f);
		br = new BufferedReader(fr);

		String str = br.readLine();
		while (str != null) {
			System.out.println(str);
			str = br.readLine();
		}
		
		br.close();
	}

}
