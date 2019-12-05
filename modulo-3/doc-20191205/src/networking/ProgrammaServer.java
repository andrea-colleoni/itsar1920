package networking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class ProgrammaServer {

	public static void main(String[] args) throws IOException {
		ServerSocket ss = new ServerSocket(5000);
		System.out.println("il server ascolta sulla porta 5000");
		while(true) {
			Socket s = ss.accept();
			new Thread(() -> {
				try {
					chat(("Client"), s);
				} catch (IOException e) {
					e.printStackTrace();
				}
			}).start();
		}
	}

	public static void chat(String nomeClient, Socket s) throws IOException {
		System.out.println(nomeClient + " connesso sulla porta " + s.getRemoteSocketAddress());
		// ho il socket.... posso leggere
		BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
		String dati = br.readLine();
		while (s.isConnected() && dati != null && !"exit".equals(dati)) {
			System.out.println(nomeClient + ": " + dati);
			dati = br.readLine();
		}
		System.out.println(nomeClient + " se n'è andato!");
	}

}
