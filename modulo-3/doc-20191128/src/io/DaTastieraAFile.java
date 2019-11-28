package io;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class DaTastieraAFile {

	public static void main(String[] args) throws IOException {

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedWriter bw = new BufferedWriter(new FileWriter(new File("da_tastiera.txt")));
		
		Character c = (char) isr.read();
		while ((byte)c.charValue() != 9) {
			System.out.print(Character.toUpperCase(c));
			bw.write(Character.toLowerCase(c));
			c = (char) isr.read();
		}
		
		bw.close();
	}
}
