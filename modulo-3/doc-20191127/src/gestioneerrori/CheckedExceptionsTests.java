package gestioneerrori;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedExceptionsTests {

	public static void main(String[] args) {
		File f = new File("c:\\ciccio.txt");

		try {
			FileInputStream fis = new FileInputStream(f);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		int a = Integer.valueOf("a");
	}

}
