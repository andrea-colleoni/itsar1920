package threading;

public class ProgrammaThread {

	public static void main(String[] args) throws InterruptedException {
		
		ScriveTreMessaggiSuConsoleOgniSecondoThread s1 = new ScriveTreMessaggiSuConsoleOgniSecondoThread("messaggio di test numero 1");
		s1.start();
		//s1.scriviMessaggio();
		
		ScriveTreMessaggiSuConsoleOgniSecondoThread s2 = new ScriveTreMessaggiSuConsoleOgniSecondoThread("messaggio di test numero 2");
		s2.start();
		//s2.scriviMessaggio();
		
		ScriveTreMessaggiSuConsoleOgniSecondoThread s3 = new ScriveTreMessaggiSuConsoleOgniSecondoThread("messaggio di test numero 3");
		s3.start();
		//s3.scriviMessaggio();

	}

}
