package networking;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class ProgrammaServer {

	private static List<PrintWriter> remoteStreams = new ArrayList<>();

	public static void main(String[] args) throws IOException {
		ServerSocket ss = new ServerSocket(5000);
		System.out.println("il server ascolta sulla porta 5000");
		while (true) {
			Socket s = ss.accept();
			remoteStreams.add(new PrintWriter(s.getOutputStream()));
			new Thread(() -> {
				try {
					chat(s);
				} catch (IOException e) {
					e.printStackTrace();
				}
			}).start();
			/*
			new Thread(new Runnable() {
				
				@Override
				public void run() {
					try {
						chat(s);
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}).start();
			*/
		}
	}

	public static void chat(Socket s) throws IOException {
		System.out.println(s.getRemoteSocketAddress() + " connesso ");
		// ho il socket.... posso leggere
		BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
		PrintWriter pw = new PrintWriter(s.getOutputStream());
		pw.println("Benvenuto nella chat. Digita \"exit\" per uscire.");
		pw.print("Insierisci il tuo nome: ");
		pw.flush();
		String nomeClient = br.readLine();
		System.out.println(nomeClient + " è entrato nella chat");
		String dati = br.readLine();
		while (s.isConnected() && dati != null && !"exit".equals(dati)) {

			if ("get".contentEquals(dati)) {
				String file = br.readLine();
				BufferedReader fbr = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
				String str = fbr.readLine();
				while (str != null) {
					pw.println(str);
					str = fbr.readLine();
				}
				pw.flush();
				fbr.close();
			} else {
				System.out.println(nomeClient + ": " + dati);
				for (PrintWriter p : remoteStreams) {
					p.println(nomeClient + ": " + dati);
					p.flush();
				}
			}
			dati = br.readLine();
		}
		System.out.println(nomeClient + " se n'è andato!");
	}

}
