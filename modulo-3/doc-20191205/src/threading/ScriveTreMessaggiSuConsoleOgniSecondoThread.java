package threading;

public class ScriveTreMessaggiSuConsoleOgniSecondoThread extends Thread {
	
	private String messaggio;

	public ScriveTreMessaggiSuConsoleOgniSecondoThread(String messaggio) {
		this.messaggio = messaggio;
	}

	public void scriviMessaggio() throws InterruptedException {
		for(int i = 0; i < 3; i++) {
			System.out.println(this.messaggio);
			Thread.sleep(1000);
		}
	}

	@Override
	public void run() {
		try {
			scriviMessaggio();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	

}
