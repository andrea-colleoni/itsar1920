package threading;

public class ProgrammaRunnable {

	public static void main(String[] args) {
		ScriveTreMessaggiSuConsoleOgniSecondoRunnable s1 = new ScriveTreMessaggiSuConsoleOgniSecondoRunnable("messaggio di test numero 1");
		new Thread(s1).start();
		//s1.scriviMessaggio();
		
		ScriveTreMessaggiSuConsoleOgniSecondoRunnable s2 = new ScriveTreMessaggiSuConsoleOgniSecondoRunnable("messaggio di test numero 2");
		new Thread(s2).start();
		//s2.scriviMessaggio();
		
		ScriveTreMessaggiSuConsoleOgniSecondoRunnable s3 = new ScriveTreMessaggiSuConsoleOgniSecondoRunnable("messaggio di test numero 3");
		new Thread(s3).start();
		//s3.scriviMessaggio();

	}

}
