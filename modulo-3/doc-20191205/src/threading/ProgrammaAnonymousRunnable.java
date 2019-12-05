package threading;

public class ProgrammaAnonymousRunnable {

	public static void main(String[] args) {
		new Thread(() -> {
			for (int i = 0; i < 3; i++) {
				System.out.println("messaggio di test numero 1");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}).start();

		new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("faccio un'altra cosa...");
			}
		}).start();

		// lambda expression
		new Thread(() -> System.out.println("faccio ancora altro....")).start();
	}
}
